/*
 * EJERCICIO:
 * - Muestra ejemplos de asignación de variables "por valor" y "por referencia", según
 *   su tipo de dato.
 * - Muestra ejemplos de funciones con variables que se les pasan "por valor" y 
 *   "por referencia", y cómo se comportan en cada caso en el momento de ser modificadas.
 * (Entender estos conceptos es algo esencial en la gran mayoría de lenguajes)
 *
 * DIFICULTAD EXTRA (opcional):
 * Crea dos programas que reciban dos parámetros (cada uno) definidos como
 * variables anteriormente.
 * - Cada programa recibe, en un caso, dos parámetros por valor, y en otro caso, por referencia.
 *   Estos parámetros los intercambia entre ellos en su interior, los retorna, y su retorno
 *   se asigna a dos variables diferentes a las originales. A continuación, imprime
 *   el valor de las variables originales y las nuevas, comprobando que se ha invertido
 *   su valor en las segundas.
 *   Comprueba también que se ha conservado el valor original en las primeras.
 */

public class EJ05 {
    public static void main(String[] args) {
        //Asignación de valor de tipo primitivo
        int x = 5;
        int y = x; //Se copia el valor de x en y
        y = 10; //Cambiamos el valor de y

        System.out.println("Se imprime 5, ya que x no se ve afectada por el cambio en y: " + x);
        System.out.println("Se imprime 10, ya que y se ve afectada por la asignación original: " + y);
        System.out.println("----------");

        // Asignación por referencia (objetos)
        class Objeto {
            int valor;
        
            Objeto(int valor) {
                this.valor = valor;
            }
        }

        Objeto obj1 = new Objeto(5);
        Objeto obj2 = obj1; // Se copia la referencia de obj1 en obj2
        obj2.valor = 10; // Cambiamos el valor de obj2

        System.out.println("Imprimirá 10, ya que obj1 y obj2 apuntan al mismo objeto:" + obj1.valor); // Imprimirá 10, ya que obj1 y obj2 apuntan al mismo objeto
        System.out.println("Imprimira 10: " + obj2.valor); 
        System.out.println("----------");

        //Creamos una variable de tipo entero y le damos un valor
        int miNumero = 5;
        //LLamamos a una función que modifica el valor de la variable
        //O paso por valor de una variable
        modificarNumero(miNumero);
        //Imprimimos el valor de la variable
        System.out.println("Valor de la variable original, fuera de la función:");
        System.out.println(miNumero);

        //PASO DE VALOR POR REFERENCIA
        //Creamos un Array de enteros de 5 posiciones
        int [] misNumeros = new int[5];
            
        //Asignamos valores a nuestro Array
        misNumeros[0] = 10;
        misNumeros[1] = 20;
        misNumeros[2] = 30;
        misNumeros[3] = 40;
        misNumeros[4] = 50;
            
        //Modificamos en valor de nuestro Array en la función 
        modificarArray(misNumeros);
            
        //Imprimimos el contenido de nuestro Array que saldrá modificado porque le enviamos la dirección de memoria no una copia del array
        for (int numero: misNumeros) {
            System.out.println(numero);
        }

        //El paso de un parámetro a una función de Java de un objeto es siempre por referencia.(aunque hay excepciones)
        Coche c = new Coche(5,"Opel", "Astra", 85, 1200, 14000);
         
        modificarCoche(c);
            
        System.out.println("Numero de puertas: " + c.getNumPuertas());
        System.out.println("Marca: " + c.getMarca());
        System.out.println("Modelo: " + c.getModelo());
        System.out.println("Caballos: " + c.getNumeroCaballos());
        System.out.println("Cilindrada: " + c.getCilindrada());
        System.out.println("Precio: " + c.getPrecio());

        //Vemos la opción con objetos inmutables
        String miCadena = "Hola Mundo";
         
        modificarCadena(miCadena);
        
        System.out.println("----------");
        System.out.println("La salida de un objeto inmutable es la original:");
        System.out.println(miCadena);
                    
    }
     
    private static void modificarNumero(int miNumero) {
        //Modificamos el valor de la variable a 7
        miNumero = 7;
        System.out.println("Valor de la variable modificado(copia), solo dentro de la función:");
        System.out.println(miNumero);
    }

    private static void modificarArray(int [] misNumeros) {
        misNumeros[0] = 11;
        misNumeros[1] = 21;
        misNumeros[2] = 31;
        misNumeros[3] = 41;
        misNumeros[4] = 51;
    }

    private static void modificarCoche(Coche c) {
        c.setCilindrada(1400);
        c.setPrecio(17000);
        c.setMarca("Citroen");
        c.setModelo("C3");
        c.setNumeroCaballos(92);
        c.setNumPuertas(3);
    }

    private static void modificarCadena(String miCadena) {
        miCadena = "Esto es una modificación de un String";
    }
}
/* Existen algunas excepciones

En el apartado anterior hemos dicho que todos los objetos se pasan por referencia en Java, pero esto no es 100 % cierto, existen algunas excepciones, sobre todo con los objetos que son inmutables.
¿ Qué es un objeto inmutable ?

Un objeto inmutable es aquel objeto en el que cada vez que se realiza una modificación sobre el mismo se crea una copia automáticamente del mismo, es decir, es la máquina virtual de Java la que crea la copia por nosotros. El típico ejemplo de un Objeto inmutable en Java es el objeto «String». Podéis ver más información acerca de la inmutabilidad en el siguiente enlace de wikipedia.
¿ Cómo se pasan los objetos inmutables como String ?
	
public static void main(String[] args) {
    String miCadena = "Hola Mundo";
         
    modificarCadena(miCadena);
         
    System.out.println(miCadena);
}
 
    private static void modificarCadena(String miCadena) {
    miCadena = "Esto es una modificación de un String";
}
¿ Cuál será la salida de nuestro programa ?
	
Hola Mundo

Por lo tanto, queda demostrado que existen excepciones con algunos objetos, pero son los menos casos, y solo pasa con aquellos objetos que son inmutables en Java. */