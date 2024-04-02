/* DIFICULTAD EXTRA (opcional):
 * Crea dos programas que reciban dos parámetros (cada uno) definidos como
 * variables anteriormente.
 * - Cada programa recibe, en un caso, dos parámetros por valor, y en otro caso, por referencia.
 *   Estos parámetros los intercambia entre ellos en su interior, los retorna, y su retorno
 *   se asigna a dos variables diferentes a las originales. A continuación, imprime
 *   el valor de las variables originales y las nuevas, comprobando que se ha invertido
 *   su valor en las segundas.
 *   Comprueba también que se ha conservado el valor original en las primeras.
 */

public class EJ05extra {
     public static void main(String[] args) {
        //Programa que recibe dos parámetros por valor
        int x = 5;
        int y = 10;

        swapValuesByValue(x, y);
        System.out.println("Valores originales:" );
        System.out.println("x: " + x);//imprime 5
        System.out.println("y: " + y);//imprime 10
        System.out.println("Los valores no son modificados fuera de la función");
        System.out.println("x: " + x);//imprime 5
        System.out.println("y: " + y);//imprime 10
        System.out.println("----------");

        //Programa que recibe dos parámetros por referencia
        Objeto obj1 = new Objeto(5);
        Objeto obj2 = new Objeto(10);

        swapValuesByReference(obj1, obj2);
        System.out.println("Valores originales por referencia:");
        System.out.println("obj1.valor: " + obj1.valor);//imprime 10
        System.out.println("obj2.valor: " + obj2.valor);//imprime 5
        System.out.println("Los valores son modificados fuera de la función al ser por referncia");
        System.out.println("----------");

     }

     public static void swapValuesByValue(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
     }

     public static void swapValuesByReference(Objeto a, Objeto b){
        int temp = a.valor;
        a.valor = b.valor;
        b.valor = temp;
     }
}

class Objeto {
    int valor;

    Objeto(int valor) {
        this.valor = valor;
    }
}