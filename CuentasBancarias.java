import java.util.Scanner;

public class CuentasBancarias {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion;

        String nombreDelCliente = "Tony Stark";
        String tipoDeCuenta = "Corriente";
        double saldo = 1599.99;

        System.out.println("***********************************");
        System.out.println("");
        System.out.println("Nombre del Cliente: " + nombreDelCliente);
        System.out.println("Tipo de cuenta: " + tipoDeCuenta);
        System.out.println("Saldo disponible: " + saldo);
        System.out.println("");
        System.out.println("***********************************");
        System.out.println("");
        

        do {
            mostrarMenu();
            System.out.println("**   Escriba el número de la opción deseada   **");
            System.out.println("");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    consultarSaldo(saldo, scanner);
                    break;
                case 2:
                    saldo = retirar(saldo, scanner);
                    break;
                case 3:
                    saldo = depositar(saldo, scanner);
                    break;
                case 9:
                    System.out.println("Saliendo del programa... Gracias por usar nuestros servicios!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
                    break;
            }

        } while (opcion != 9);

        scanner.close();
    }

    public static void mostrarMenu() {
        System.out.println("");
        System.out.println("1 - Consultar saldo");
        System.out.println("2 - Retirar");
        System.out.println("3 - Depositar");
        System.out.println("9 - Salir");
        System.out.println("");
    }

    public static void consultarSaldo(double saldo, Scanner scanner) {
        System.out.println("Saldo disponible: " + saldo);
        
    }

    public static double retirar(double saldo, Scanner scanner) {
        System.out.println("Cuánto desea retirar? ");
        double cantidad = scanner.nextDouble();
        if (cantidad > saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            saldo -= cantidad;
            System.out.println("Saldo disponible: " + saldo);
        }
        return saldo;
    }

    public static double depositar(double saldo, Scanner scanner) {
        System.out.println("Cuánto desea depositar? ");
        double cantidad = scanner.nextDouble();
        saldo += cantidad;
        System.out.println("Saldo disponible: " + saldo);
        return saldo;
    }
}

