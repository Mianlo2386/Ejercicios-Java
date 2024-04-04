import java.util.Scanner;

public class ConvertidorTemperaturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el valor en grados Celsius:");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 1.8) + 32;

        System.out.println("El equivalente en grados Fahrenheit es: ");
        System.out.println(fahrenheit);

        int fahrenheitInt = (int) fahrenheit;

        System.out.println("La temperatura sin decimales es:");
        System.out.println(fahrenheitInt);
    }
}
