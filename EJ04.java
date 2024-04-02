/* * EJERCICIO:
 * Muestra ejemplos de todas las operaciones que puedes realizar con cadenas de caracteres
 * en tu lenguaje. Algunas de esas operaciones podrían ser (busca todas las que puedas):
 * - Acceso a caracteres específicos, subcadenas, longitud, concatenación, repetición,
 *   recorrido, conversión a mayúsculas y minúsculas, reemplazo, división, unión,
 *   interpolación, verificación...
 *
 * DIFICULTAD EXTRA (opcional):
 * Crea un programa que analice dos palabras diferentes y realice comprobaciones
 * para descubrir si son:
 * - Palíndromos
 * - Anagramas
 * - Isogramas
  */

public class EJ04 {
    public static void main(String[] args) {
        String str1 = "Hola";
        String str2 = "Miguel";

        //Acceso a caracteres específicos
        char firstChar = str1.charAt(0);
        System.out.println("----------");
        System.out.println("Primer caracter de str1: " + firstChar);
        System.out.println("----------");

        //Subcadenas
        String  subStr = str2.substring(0, 5);
        System.out.println("Subcadena de str2: " + subStr);
        System.out.println("----------");

        //Longitud
        int length = str1.length();
        System.out.println("Longitud de str1: " + length);
        System.out.println("----------");

        //Concatenación
        String concatenation = str1.concat(" " + subStr + "!");
        System.out.println("Concatenación str1 y subStr: " + concatenation);
        System.out.println("----------");

        //Recorrido
        System.out.println("Recorrido de str1:");
        for (int i = 0; i < str1.length(); i++) {
            System.out.println(str1.charAt(i));
        }
        System.out.println("----------");

        //Conversión de mayúsculas y minúsculas
        String upperCase = str1.toUpperCase();
        String lowerCase = str2.toLowerCase();
        System.out.println("str1 en mayúsculas: " + upperCase);
        System.out.println("str2 en minúsculas: " + lowerCase);
        System.out.println("----------");

        //Reemplazo
        String replacedStr = str1.replace('o', 'O');
        System.out.println("Remplazo de 'o' por 'O' en str1: " + replacedStr);
        System.out.println("----------");

        //División
        String[] splitStr = concatenation.split(" "); 
        System.out.println("División de concatenación por espacio:");
        for (String s : splitStr) {
            System.out.println(s);
        }
        System.out.println("----------");

        //Unión
        String[] words = {"Hello", "Java!"};
        String joinedStr = String.join(" ", words);
        System.out.println("Unión de palabras por espacio: " + joinedStr);
        System.out.println("----------");

        //Verificación
        boolean contains = concatenation.contains("Hola");
        System.out.println("Concatenation contiene 'Hola'?: " + contains);
        System.out.println("----------");
    }

}
