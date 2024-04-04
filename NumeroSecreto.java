import java.util.Random;
import java.util.Scanner;

public class NumeroSecreto {
    public static void main(String[] args) {
        int intentos = 10;
        int numeroSecreto = new Random().nextInt(101); // Genera un número entre 0 y 100 (ambos inclusive)
        Scanner teclado = new Scanner(System.in);
        int numeroUsuario = -1; // Inicializo la variable con un valor fuera del rango válido

        for (int i = 0; i < intentos; i++) {
            System.out.println("Intento " + (i + 1) + ": Ingrese un número entre 0 y 100: ");
            numeroUsuario = teclado.nextInt(); // Asigno el valor ingresado por el usuario a la variable

            if (numeroUsuario < 0 || numeroUsuario > 100) {
                System.out.println("Por favor, ingrese un número válido entre 0 y 100.");
                continue; // Salta al siguiente intento sin contar como uno de los 5 intentos
            }

            if (numeroSecreto < numeroUsuario) {
                System.out.println("El número secreto es menor.");
            } else if (numeroSecreto > numeroUsuario) {
                System.out.println("El número secreto es mayor.");
            } else {
                System.out.println("¡Felicitaciones! Adivinaste el número secreto.");
                break;
            }
        }

        if (numeroSecreto != numeroUsuario) {
            System.out.println("Alcanzaste el máximo de intentos. El número secreto era: " + numeroSecreto);
        }
    }
}
