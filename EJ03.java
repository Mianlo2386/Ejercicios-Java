/* * EJERCICIO:
 * - Muestra ejemplos de creación de todas las estructuras soportadas por defecto
 *   en tu lenguaje.
 * - Utiliza operaciones de inserción, borrado, actualización y ordenación.
 *
 * DIFICULTAD EXTRA (opcional):
 * Crea una agenda de contactos por terminal.
 * - Debes implementar funcionalidades de búsqueda, inserción, actualización
 *   y eliminación de contactos.
 * - Cada contacto debe tener un nombre y un número de teléfono.
 * - El programa solicita en primer lugar cuál es la operación que se quiere realizar,
 *   y a continuación los datos necesarios para llevarla a cabo.
 * - El programa no puede dejar introducir números de teléfono no númericos y con más
 *   de 11 dígitos (o el número de dígitos que quieras).
 * - También se debe proponer una operación de finalización del programa.
 */

import java.util.ArrayList;

public class EJ03 {
    public static void main(String[] args) {
        int[] arregloEnteros = new int[5];
        int[] numeros = {1, 2, 3, 4, 5};
        
        // Llamamos al método para imprimir los arreglos
        imprimirArreglo(arregloEnteros);
        imprimirArreglo(numeros);

         // Crear una lista de cadenas
        ArrayList<String> listaCadenas = new ArrayList<String>();
        
        // Agregar elementos a la lista
        listaCadenas.add("Hola");
        listaCadenas.add("Mundo");
        listaCadenas.add("Cruel");
        
        // Llamar al método para mostrar la lista
        mostrarLista(listaCadenas);
    }

    // Método para imprimir un arreglo de enteros
    public static void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println(); // Salto de línea al final
    }
    // Método para mostrar una lista de cadenas
    public static void mostrarLista(ArrayList<String> lista) {
        System.out.println("Elementos de la lista:");
        for (String elemento : lista) {
            System.out.println(elemento);
        }
    }    
    }

