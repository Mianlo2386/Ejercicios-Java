import java.util.Scanner;

public class ConvertidorTemperaturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el valor en grados Celsius:");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 1.8) + 32;

        int fahrenheitInt = (int) fahrenheit;

        // Formateando el resultado para mostrar solo un decimal
        String formattedResult = String.format("%.1f", fahrenheit);

        System.out.println("El equivalente en grados Fahrenheit es: ");
        System.out.println(fahrenheit);

        System.out.println("El equivalente en grados Fahrenheit con un decimal es: ");
        System.out.println(formattedResult);

        System.out.println("La temperatura sin decimales es:");
        System.out.println(fahrenheitInt); 
        
        scanner.close();
    }
    
}
