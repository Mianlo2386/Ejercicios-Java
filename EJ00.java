//Sitio web oficial de Java: https://www.java.com/

// Sintaxis de comentarios en una línea
/*
Sintaxis de comentarios
en varias líneas
*/

public class EJ00 {
    public static void main(String[] args) {

        // Tipos de datos primitivos en Java
        String texto = "Hola, Java!"; // Cadena de texto
        int entero = 25; // Entero
        boolean booleano = true; // Booleano
        double decimal = 3.14; // Decimal de doble precisión
        float flotante = 5.67f; // Decimal de precisión simple
        char caracter = 'A'; // Carácter

        // Variable
        int numero = 10; // Variable 'numero' de tipo entero con valor 10
        // Constante
        final double PI = 3.1416; // Constante 'PI' de tipo double con valor 3.1416
        String lenguaje = "Java";

        // Imprimir por terminal el texto
        System.out.println("¡Hola, " + lenguaje + "!");
        System.out.println("Texto: " + texto);
        System.out.println("Entero: " + entero);
        System.out.println("Booleano: " + booleano);
        System.out.println("Decimal: " + decimal);
        System.out.println("Flotante: " + flotante);
        System.out.println("Carácter: " + caracter);
        System.out.println("Variable de tipo entero: " + numero);
        System.out.println("Constante PI de tipo double: " + PI);

       
/* 
    byte: Representa un entero de 8 bits con signo.
        Rango: -128 a 127
        Tamaño en memoria: 1 byte
        Ejemplo: byte edad = 30;

    short: Representa un entero de 16 bits con signo.
        Rango: -32,768 a 32,767
        Tamaño en memoria: 2 bytes
        Ejemplo: short numero = 1000;

    int: Representa un entero de 32 bits con signo (el más comúnmente utilizado).
        Rango: -2,147,483,648 a 2,147,483,647
        Tamaño en memoria: 4 bytes
        Ejemplo: int cantidad = 50000;

    long: Representa un entero de 64 bits con signo.
        Rango: -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807
        Tamaño en memoria: 8 bytes
        Ejemplo: long poblacion = 7794798734L; (nota la 'L' al final para indicar que es un valor long)

    float: Representa un número de punto flotante de precisión simple.
        Rango: Aproximadamente ±3.40282347E+38F
        Tamaño en memoria: 4 bytes
        Ejemplo: float precio = 25.75f; (nota la 'f' al final para indicar que es un valor float)

    double: Representa un número de punto flotante de precisión doble (el más comúnmente utilizado para valores decimales).
        Rango: Aproximadamente ±1.79769313486231570E+308
        Tamaño en memoria: 8 bytes
        Ejemplo: double pi = 3.14159;

    boolean: Representa un valor booleano, es decir, verdadero (true) o falso (false).
        Tamaño en memoria: 1 bit (en la práctica, la JVM puede reservar 1 byte)
        Ejemplo: boolean esMayorDeEdad = true;

    char: Representa un solo carácter Unicode de 16 bits.
        Rango: 0 a 65,535
        Tamaño en memoria: 2 bytes
        Ejemplo: char letra = 'A'; */

    }
}