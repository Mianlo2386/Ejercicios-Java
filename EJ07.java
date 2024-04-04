import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class EJ07 {
    public static void main(String[] args) {
        // Ejemplo de uso de pilas (stack)
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        System.out.println("Elementos de la pila:");
        while (!pila.isEmpty()) {
            System.out.println(pila.pop());
        }

        System.out.println("----------");

        // Ejemplo de uso de Cola
        Queue<Integer> cola = new LinkedList<>();
        cola.offer(1);
        cola.offer(2);
        cola.offer(3);
        System.out.println("Elementos de la cola:");
        while (!cola.isEmpty()) {
            System.out.println(cola.poll());
        }
        System.out.println("----------");

        webNavigation();

        System.out.println("----------");

        imprimirDocumentos();

        
    }

    public static void webNavigation() {
        Stack<String> historial = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Añade una URL o interactúa con las palabras adelante/atras/salir:");
            String action = scanner.nextLine();

            if (action.equals("salir")) {
                System.out.println("Saliendo del navegador web...");
                break;
            } else if (action.equals("adelante")) {
                // en este caso en Java no necesitamos hacer nada para adelante
                System.out.println("No hay páginas para navegar adelante, porque esto es una pila.");
            } else if (action.equals("atras")) {
                if (!historial.isEmpty()) {
                    String paginaAnterior = historial.pop();
                    System.out.println("Has navegado a la página anterior: " + paginaAnterior + ".");
                } else {
                    System.out.println("No hay páginas para navegar hacia atrás.");
                }
            } else {
                historial.push(action);
                System.out.println("Has navegado a la página " + action + ".");
            }
        }

        scanner.close();

    }

    public static void imprimirDocumentos() {
        Queue<String> colaDocumentos = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
    
        while (true) {
            System.out.println("Añade un documento o selecciona imprimir/salir:");
            
            // Verifica si hay más líneas disponibles antes de intentar leerlas
            if (scanner.hasNextLine()) {
                String action = scanner.nextLine();
    
                if (action.equals("salir")) {
                    System.out.println("Saliendo del sistema de impresión...");
                    break;
                } else if (action.equals("imprimir")) {
                    if (!colaDocumentos.isEmpty()) {
                        String documento = colaDocumentos.poll();
                        System.out.println("Imprimiendo documento: " + documento);
                    } else {
                        System.out.println("No hay documentos en la cola para imprimir.");
                    }
                } else {
                    colaDocumentos.offer(action);
                    System.out.println("Documento añadido a la cola de impresión: " + action);
                }
            } else {
                System.out.println("No hay más entrada disponible. Saliendo del sistema de impresión...");
                break;
            }
        }
    
        scanner.close();
    }
    
}
