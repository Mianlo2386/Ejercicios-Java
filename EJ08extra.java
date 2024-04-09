public class EJ08extra {
    public static void main(String[] args) {
        // Crear una pila de enteros
        Pila<Integer> pilaEnteros = new Pila<>();
        pilaEnteros.push(1);
        pilaEnteros.push(2);
        pilaEnteros.push(3);
        
        // Imprimir contenido de la pila
        System.out.println("Contenido de la pila de enteros:");
        pilaEnteros.imprimirContenido();

        // Crear una cola de cadenas
        Cola<String> colaCadenas = new Cola<>();
        colaCadenas.encolar("Hola");
        colaCadenas.encolar("Mundo");
        
        // Imprimir contenido de la cola
        System.out.println("\nContenido de la cola de cadenas:");
        colaCadenas.imprimirContenido();
    } 
}
