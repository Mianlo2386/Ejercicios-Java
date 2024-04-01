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
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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

        // Crear un mapa de cadenas y enteros
        HashMap<String, Integer> mapa = new HashMap<String, Integer>();

        // Agregar elementos al mapa
        mapa.put("Uno", 1);
        mapa.put("Dos", 2);

        // Llamar al método para mostrar el mapa
        mostrarMapa(mapa);

        // Crear un conjunto de enteros
        HashSet<Integer> conjuntoEnteros = new HashSet<Integer>();
        
        // Agregar elementos al conjunto
        conjuntoEnteros.add(1);
        conjuntoEnteros.add(2);
        
        // Llamar al método para mostrar el conjunto
        mostrarConjunto(conjuntoEnteros);

        //Crear una cola de cadenas
        Queue<String>colaCadenas = new LinkedList<String>();

        //Agregar elementos a la cola

        colaCadenas.add("Primero");
        colaCadenas.add("Segundo");

        //Llamar al método para mostrar la cola
        mostrarCola(colaCadenas);

        //Crear una pila de enteros
        Stack<Integer> pilaEnteros = new Stack<Integer>();

        //Agregar elementos a la pila
        pilaEnteros.push(1);
        pilaEnteros.push(2);

        //Llamar al método para mostrar la pila
        mostrarPila(pilaEnteros);
    }

    // Método para imprimir un arreglo de enteros
    public static void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("\n" +  "---------------"); 
    }
    // Método para mostrar una lista de cadenas
    public static void mostrarLista(ArrayList<String> lista) {
        System.out.println("Elementos de la lista:");
        for (String elemento : lista) {
            System.out.println(elemento);
        }
        System.out.println("\n" +  "---------------"); 
    }   
    // Método para mostrar un mapa de cadenas y enteros
    public static void mostrarMapa(HashMap<String, Integer> mapa) {
        System.out.println("Contenido del mapa:");
        for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }
        System.out.println("\n" +  "---------------"); 
    } 
    // Método para mostrar un conjunto de enteros
    public static void mostrarConjunto(HashSet<Integer> conjunto) {
        System.out.println("Contenido del conjunto:");
        for (Integer elemento : conjunto) {
            System.out.println(elemento);
        }
        System.out.println("\n" +  "---------------"); 
    }
    //Método para mostrar una cola de cadenas
    public static void mostrarCola(Queue<String> cola){
        System.out.println("Contenido de la cola:");
        for (String elemento: cola){
            System.out.println(elemento);
        }
        System.out.println("\n-------------");
    }
    //Método para mostrar una pila de enteros
    public static void mostrarPila(Stack<Integer> pila) {
        System.out.println("Contenido de la pila:");
        while (!pila.isEmpty()) {
            System.out.println(pila.pop());
        }
        System.out.println("\n--------------");
    }
    }

