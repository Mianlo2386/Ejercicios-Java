// Cola.java
import java.util.LinkedList;
import java.util.Queue;

public class Cola<T> {
    private Queue<T> elementos;

    public Cola() {
        elementos = new LinkedList<>();
    }

    public void encolar(T elemento) {
        elementos.add(elemento);
    }

    public T desencolar() {
        return elementos.poll();
    }

    public int size() {
        return elementos.size();
    }

    public boolean isEmpty() {
        return elementos.isEmpty();
    }

    public void imprimirContenido() {
        for (T elemento : elementos) {
            System.out.println(elemento);
        }
    }
}

