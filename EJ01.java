/* 
* - Crea ejemplos utilizando todos los tipos de operadores de tu lenguaje:
 *   Aritméticos, lógicos, de comparación, asignación, identidad, pertenencia, bits...
 *   (Ten en cuenta que cada lenguaje puede poseer unos diferentes)
*/


/*
 * - Utilizando las operaciones con operadores que tú quieras, crea ejemplos
 *   que representen todos los tipos de estructuras de control que existan
 *   en tu lenguaje:
*/

/*
 *   Condicionales, iterativas, excepciones...
 * - Debes hacer print por consola del resultado de todos los ejemplos.
*/

// Archivo EJ01.java
public class EJ01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        boolean c = true;
        boolean d = true;
        String[] days = {"lunes", "martes", "miércoles", "jueves", "sábado", "domingo" }; //List con dias de la semana, sin el viernes
        int x = 25; //11001
        int y = 5; //0101
        int z = 9; //1001
        aritmetics(a, b); // Llamada al método aritmetics de la clase EJ01
        logics(c, d);
        compareishon(a, b);
        teneichon(days);
        biteichon(x, y, z);
        extra();
    }
    
    public static void aritmetics(int numero_a, int numero_b) {
        System.out.println("La suma es: " + (numero_a + numero_b));
        System.out.println("La resta es: " + (numero_a - numero_b));
        System.out.println("La multiplicación es: " + (numero_a * numero_b));
        System.out.println("La división es: " + (numero_a / numero_b));
        System.out.println("El resto es: " + (numero_a % numero_b));

        System.out.println("---------"); //Tambien se puede trabajar de la sig forma:

        //  System.out.println(numero_a += numero_b);
        //  System.out.println(numero_a -= numero_b);
        //  System.out.println(numero_a *= numero_b);
        //  System.out.println(numero_a /= numero_b);
        //  System.out.println(numero_a %= numero_b);
    }
    public static void logics(boolean bool_a,boolean bool_b){
        if (bool_a && bool_b == true){
            System.out.println("Resultado segun parametros otorgados: AND");
        }  else if(bool_a || bool_b != true ){
            System.out.println("Resultado segun parametros otorgados: OR");
        } //Tambien esta el NOT, cuya funcion es negar el booleano entregado.

        System.out.println("---------");
    }
    public static void compareishon(int num1, int num2){      
        if (num1 > num2){
            System.out.println("Numero 1: " + num1 + " > " + "Numero 2: " + num2);             
        } 
        else{
            System.out.println("Numero 1: " + num1 + " < " + "Numero 2: " + num2);              
        }

        System.out.println("---------");     
    }
    public static void teneichon(String[] days){
        try{
            
            System.out.println(days[6]); //Intento imprimir el índice del ultimo día (sup que son 7)
        } catch(Exception e){
            System.out.println("Excepcion detectada");
        }

        System.out.println("---------");

    }
    public static void biteichon(int e, int f, int g){
        
        //Desplazamiento a la izquierda
        System.out.println(e << 2);
        //Desplazamiento a la derecha
        System.out.println(e >> 2);
        //AND
        System.out.println(f & g);
        //OR
        System.out.println(f | g);
        //XOR
        System.out.println(f ^ g);
        //NOT
        System.out.println(~f);
        System.out.println(~g);

        System.out.println("---------");
    }
    public static void extra(){
        for(int i=10; i<55; i+=2){
            if(i !=16 && i % 3 != 0){
                System.out.println(i);
            }
        }
    }
}

    
    /* Este método, llamado biteichon(), realiza operaciones con bits utilizando varios operadores a nivel de bits en Java. Aquí está lo que hace cada parte del método:

    Desplazamiento a la izquierda (<<): Este operador desplaza los bits de un número hacia la izquierda una cierta cantidad de posiciones, insertando ceros en el extremo derecho. Por ejemplo, x << 2 desplaza los bits de x dos posiciones hacia la izquierda. En binario, esto equivale a multiplicar x por 2^2. Entonces, si x es 25 (en binario: 11001), x << 2 sería 100100, que es 100 (en decimal). El resultado de este desplazamiento a la izquierda se imprime por consola.

    Desplazamiento a la derecha (>>): Este operador desplaza los bits de un número hacia la derecha una cierta cantidad de posiciones. Por ejemplo, x >> 2 desplaza los bits de x dos posiciones hacia la derecha. En binario, esto equivale a dividir x por 2^2 (o 4). Entonces, si x es 25 (en binario: 11001), x >> 2 sería 110 (en decimal). El resultado de este desplazamiento a la derecha se imprime por consola.

    AND (&): Este operador realiza una operación lógica AND bit a bit entre dos números. Cada bit del resultado es 1 si y solo si ambos bits correspondientes en los números originales son 1. Por ejemplo, a & b realiza la operación AND bit a bit entre a y b. En binario, esto sería 0101 AND 1001, que es 0001 (en decimal 1). El resultado de esta operación se imprime por consola.

    OR (|): Este operador realiza una operación lógica OR bit a bit entre dos números. Cada bit del resultado es 1 si al menos uno de los bits correspondientes en los números originales es 1. Por ejemplo, a | b realiza la operación OR bit a bit entre a y b. En binario, esto sería 0101 OR 1001, que es 1101 (en decimal 13). El resultado de esta operación se imprime por consola.

    XOR (^): Este operador realiza una operación lógica XOR bit a bit entre dos números. Cada bit del resultado es 1 si los bits correspondientes en los números originales son diferentes. Por ejemplo, a ^ b realiza la operación XOR bit a bit entre a y b. En binario, esto sería 0101 XOR 1001, que es 1100 (en decimal 12). El resultado de esta operación se imprime por consola.

    NOT (~): Este operador realiza una operación de negación bit a bit de un solo número. Cada bit del resultado es 0 si el bit correspondiente en el número original es 1, y viceversa. Por ejemplo, ~a realiza la operación NOT bit a bit en a. En binario, esto sería ~0101, que es 1010 (en decimal -6) debido a la representación de complemento a dos. El resultado de esta operación se imprime por consola.
 */
  
