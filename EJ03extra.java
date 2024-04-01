import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;


public class EJ03extra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        //Creamos el Hashmap para almacenar los contactos
        Map<String, String> agenda = new HashMap<>();

        agenda.put("Danu", "1130502040");
        agenda.put("Luz", "1122334455");
        agenda.put("Lila", "1077889900");

        do {
            mostrarMenu();
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    buscarContacto(agenda, scanner);
                    break;
                case 2:
                    insertarContacto(agenda, scanner);
                    break;
                case 3:
                    // Lógica para actualizar contacto
                    break;
                case 4:
                    // Lógica para eliminar contacto
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
                    break;
            }
        } while (opcion != 5);

        scanner.close();
    }

    public static void mostrarMenu() {
        System.out.println("\n--- Menú de Agenda ---");
        System.out.println("1. Buscar contacto");
        System.out.println("2. Insertar contacto");
        System.out.println("3. Actualizar contacto");
        System.out.println("4. Eliminar contacto");
        System.out.println("5. Salir");
    }

    public static void buscarContacto(Map<String, String> agenda, Scanner scanner) {
        scanner.nextLine();
        System.out.println("Ingrese el nombre o el número de teléfono del contacto a buscar:");
        String consulta = scanner.nextLine();

        //Si la consulta es un número de teléfono
        if (consulta.matches("\\d{10}")){
            buscarContactoPorTelefono(agenda, consulta);
        } else {
            buscarContactoPorNombre(agenda, consulta);
        }
    }  
    public static void insertarContacto(Map<String, String> agenda, Scanner scanner) {
        System.out.println("Ingrese el nombre del contacto:");
        String nombre = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Ingrese el número de teléfono:");
        String telefono = scanner.nextLine();

        if (validarTelefono(telefono)){
            if (agenda.containsValue(telefono)){
                System.out.println("El número de teléfono ya existe en la agenda.");
            } else {
                agenda.put(nombre, telefono);
                System.out.println("Contacto agregado correctamente.");
            }
        } else {
            System.out.println("Número de teléfono no válido. Debe ser numérico y tener la longitud adecuada (10 números).");
        }
    }

    public static void buscarContactoPorNombre(Map<String, String> agenda, String nombre){
        String telefono = agenda.get(nombre);
        if (telefono != null) {
            System.out.println("El número de teléfono de " + nombre + " es: " + telefono);
        } else {
            System.out.println("El contacto '" + nombre + "' no se encuentra en la agenda.");
        }
    }

    public static void buscarContactoPorTelefono(Map<String, String> agenda, String telefono){
        for (Map.Entry<String, String> entry : agenda.entrySet()) {
            if (entry.getValue().equals(telefono)) {
                System.out.println("El nombre del contacto con el número de telefono " + telefono + " es: " + entry.getKey());
                return;
            }
        }
        System.out.println("El número de teléfono '" + telefono + "' no se encuentra en la agenda.");
    }

    public static boolean validarTelefono(String telefono) {
        //Validar si el número de teléfono es correcto
        return telefono.matches("\\d{10}");
    }
}
