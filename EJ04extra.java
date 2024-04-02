import java.util.Scanner;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class EJ04extra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------------");
        System.out.println("Ingrese una palabra o frase para verificar si es un palíndromo: ");
        String input = scanner.nextLine();

        if (esPalindromo(input)) {
            System.out.println("Es palíndromo!");
            System.out.println("------------");
        } else {
            System.out.println("No es palíndromo!");
            System.out.println("------------");
        }

        System.out.println("Ingrese una palabra para verificar si es un anagrama: ");
        String palabra1 = scanner.nextLine();
        System.out.println("Ingrese una segunda palabra para verificar si es un anagrama: ");
        String palabra2 = scanner.nextLine();

        if (esAnagrama(palabra1, palabra2)) {
            System.out.println("Es anagrama!");
            System.out.println("------------");
        } else {
            System.out.println("No es anagrama!");
            System.out.println("------------");
        }

        System.out.println("Ingrese una palabra para verificar si es un isograma: ");
        String palabra3 = scanner.nextLine();

        if (esIsograma(palabra3)) {
            System.out.println("Es isograma!");
            System.out.println("------------");
        } else {
            System.out.println("No es isograma!");
            System.out.println("------------");
        }

        scanner.close();

    }

    public static boolean esPalindromo(String str) {
        //Convertimos a minúsculas y eliminamos caracteres no alfabéticos
        str = str.toLowerCase().replaceAll("[^a-z^]", "");

        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean esAnagrama(String palabra1, String palabra2) {
        char[] arrPalabra1 = palabra1.toLowerCase().replaceAll("[^a-z^]", "").toCharArray();
        char[] arrPalabra2 = palabra2.toLowerCase().replaceAll("[^a-z^]", "").toCharArray();
        
        Arrays.sort(arrPalabra1);
        Arrays.sort(arrPalabra2);
        
        return Arrays.equals(arrPalabra1, arrPalabra2);
    }

    public static boolean esIsograma(String palabra3){
        palabra3 = palabra3.toLowerCase().replaceAll("[^a-z^]", ""); 

        //Utilizar un conjunto para almacenar letras únicas
        Set<Character> letras = new HashSet<>();

        //Recorrer cada letra de la palabra
        for (char letra : palabra3.toCharArray()) {
            //Si la letra ya esta en el conjunto, la palabra no es isograma
            if (letras.contains(letra)) {
                return false;
            }
            //Agregar la letra al conjunto
            letras.add(letra);
        }
        return true;
    }
}
