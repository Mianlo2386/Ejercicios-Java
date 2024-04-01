/* Se procedera a crear ejemplos de inserción, borrado, actualización y ordenamiento */
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Queue;

public class EJ03bis {
        public static void main(String[] args) {
        //Crear un arreglo de tamaño 5
        int[] arreglo = new int[5];

        //Inserción: asignar valores a posiciones específicas
        arreglo[0] = 10;
        arreglo[1] = 20;
        arreglo[2] = 30;

        //Mostrar arreglo antes de actualización
        System.out.println("Arreglo antes de la actualización:");
        mostrarArreglo(arreglo);
        System.out.println("-----------");

        //Actualización: cambiar el valor en una posición existente
        arreglo[1] = 25;

        //Mostrar el arreglo después de la actualización
        System.out.println("Arreglo despues de la actualización:");
        mostrarArreglo(arreglo);
        System.out.println("----------");

        //Creo segundo arreglo desordenado de tamaño 5
        int[] arregloDesordenado = {30, 10, 20,50, 40};

        //Mostrar arreglo antes del ordenamiento
        System.out.println("Arreglo antes del oredenamiento:");
        mostrarArreglo2(arregloDesordenado);
        System.out.println("-----------");

        //Ordenar el arreglo
        Arrays.sort(arregloDesordenado);

        //Mostrar el arreglo ordenado
        System.out.println("Arreglo después del ordenamiento:");
        mostrarArreglo2(arregloDesordenado);
        System.out.println("----------");

        //Crear una lista enlazada de enteros
        LinkedList<Integer> listaEnlazada = new LinkedList<Integer>();

        //Inserción: Agregar elementos al final de la lista
        listaEnlazada.add(10);
        listaEnlazada.add(20);
        listaEnlazada.add(30);

        //Mostrar la lista antes del borrado
        System.out.println("Lista enlazada antes del borrado:");
        mostrarListaEnlazada(listaEnlazada);
        System.out.println("-----------");

        //Crear una lista enlazada de enteros desordenada
        LinkedList<Integer> listaEnlazadaDesordenada = new LinkedList<Integer>();
        listaEnlazadaDesordenada.add(30);
        listaEnlazadaDesordenada.add(10);
        listaEnlazadaDesordenada.add(20);
        listaEnlazadaDesordenada.add(50);
        listaEnlazadaDesordenada.add(40);

        //Mostrar la lista enlazada antes del ordenamiento
        System.out.println("Lista enlazada antes del ordenamiento:");
        mostrarListaEnlazada2(listaEnlazadaDesordenada);
        System.out.println("----------");

        //Ordenar la lista enlazada
        listaEnlazadaDesordenada.sort(null);

        //Mostrar la lista enlazada antes del ordenamiento
        System.out.println("Lista enlazada después del oedenamiento:");
        mostrarListaEnlazada2(listaEnlazadaDesordenada);
        System.out.println("----------");

        //Borrado: Eliminar el segundo elemento de la lista
        listaEnlazada.remove(1);

        //Mostrar la lista enlazada después del borrado
        System.out.println("Lista enlazada después del borrado:");
        mostrarListaEnlazada(listaEnlazada);
        System.out.println("----------");

        //Crear un mapa de cadena de enteros
        HashMap<String, Integer> mapa = new HashMap<String, Integer>();

        //Inserción: Agregar elementos al mapa
        mapa.put("Uno", 1);
        mapa.put("Dos", 2);
        mapa.put("Tres", 3);

        //Mostrar el mapa antes de la actualización
        System.out.println("Mapa antes de la actualización:");
        mostrarMapa(mapa);
        System.out.println("----------");

        //Actualización: Cambiar el valor asociado a una clave existente
        mapa.put("Dos", 20);

        //Mostrar mapa después de la actualización
        System.out.println("Mapa después de la actualización:");
        mostrarMapa(mapa);
        System.out.println("----------");

        //Crear una pila de enteros
        Stack<Integer> pila = new Stack<>();

        //Inserción: Agregar elementos a la pila
        pila.push(10);
        pila.push(20);
        pila.push(30);

        //Mostrar la pila antes del borrado
        System.out.println("Pila antes del borrado:");
        mostrarPila(pila);
        System.out.println("----------");

        //Borrado Eliminar el elemento superior de la pila
        pila.pop();

        //Mostrar la pila antes del borrado
        System.out.println("Pila después del borrado:");
        mostrarPila(pila);
        System.out.println("----------");

        //Crear una cola de enteros
        Queue<Integer> cola = new LinkedList<>();

        //Inserción: Agregar elementos a la cola
        cola.add(10);
        cola.add(20);
        cola.add(30);

        //Mostrar la cola antes del borrado
        System.out.println("Cola antes del borrado:");
        mostrarCola(cola);
        System.out.println("----------");

        //Borrado: eliminar el primer elemento de la cola
        cola.poll();

        //Mostrar la cola después del borrado
        System.out.println("Cola después del borrado:");
        mostrarCola(cola);
        System.out.println("----------");

    }

    //Método para mostrar un arreglo
    public static void mostrarArreglo(int[] arreglo) {
        for (int i=0; i < arreglo.length; i++){
            System.out.println(arreglo[i] + " ");
        }
    }

    public static void mostrarArreglo2(int[] arregloDesordenado) {
        for (int i=0; i < arregloDesordenado.length; i++){
            System.out.println(arregloDesordenado[i] + " ");
        }
    }

    //Método para mostrar una lista enlazada
    public static void mostrarListaEnlazada(LinkedList<Integer> listaEnlazada) {
        for (Integer elemento : listaEnlazada) {
            System.out.println(elemento);
        }
    }

    //Método para mostrar una lista enlazada
    public static void mostrarListaEnlazada2(LinkedList<Integer> listaEnlazadaDesordenada) {
        for (Integer elemento : listaEnlazadaDesordenada) {
            System.out.println(elemento);
        }
    }

    //Método para mostrar un mapa
    public static void mostrarMapa(HashMap<String, Integer> mapa) {
        for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }
    }
    //Método para mostrar una pila de enteros
    public static void mostrarPila(Stack<Integer> pila){
        if (pila.isEmpty()){
            System.out.println("La pila esta vacía");
            return;
        }

        System.out.println("Contenido de la pila:");
        for (int i = pila.size() -1; i >= 0 ; i--) {
            System.out.println(pila.get(i));
        }
    }
    //Método para mostrar cola de enteros
    public static void mostrarCola(Queue<Integer> cola) {
        if (cola.isEmpty()){
            System.out.println("La cola esta vacía.");
            return;
        }
        System.out.println("Contenido de la cola:");
        for (Integer elemento : cola) {
            System.out.println(elemento);
        }
    }
}
