/*  * EJERCICIO:
 * - Crea ejemplos de funciones básicas que representen las diferentes
 *   posibilidades del lenguaje:
 *   Sin parámetros ni retorno, con uno o varios parámetros, con retorno...
 * - Comprueba si puedes crear funciones dentro de funciones.
 * - Utiliza algún ejemplo de funciones ya creadas en el lenguaje.
 * - Pon a prueba el concepto de variable LOCAL y GLOBAL.
 * - Debes hacer print por consola del resultado de todos los ejemplos.
 *   (y tener en cuenta que cada lenguaje puede poseer más o menos posibilidades)
 * En Java las funciones serian los métodos.
 */
public class EJ02{ 
    // Variable de instancia (global dentro de la clase)
    static int variableGlobal = 10;
    public static void main(String[] args) {
        int numero = 10;
        int resultado = funcionConVariosParametrosYRetorno(5, 7);

        funcionSinParametrosNiRetorno();// Llamada a la función
        funcionConUnParametro(numero); 
        
        System.out.println("El resultado de la suma es: " + resultado + "\n---------");

        funcionDentroDeOtraFuncion();

        // Generar un número aleatorio entre 0.0 (inclusive) y 1.0 (exclusivo)
        double numeroAleatorio = Math.random();

        System.out.println("Número aleatorio generado por la función Math.random que ya viene en el lenguaje: " + numeroAleatorio);
        System.out.println("---------"); // Salto de línea y guiones

           // Variable local dentro del método main
           int variableLocal = 20;

           System.out.println("Variable local dentro de main: " + variableLocal);
           System.out.println("Variable global dentro de main: " + variableGlobal);
           
           // Llamada a un método que utiliza una variable local y una variable global
           metodoPrueba();

           // EXTRA: FizzBuzz

           String fizz = "FIZZ";
           String buzz = "BUZZ";
           fizzBuzz(fizz, buzz);
        
    }
    public static void funcionSinParametrosNiRetorno() {
        System.out.println("Esta es una función sin parámetros ni retorno");
        System.out.println("---------");
    }
    public static void funcionConUnParametro(int numero) {
        System.out.println("El número recibido es: " + numero);
        System.out.println("---------");
    }
    public static int funcionConVariosParametrosYRetorno(int a, int b) {
        return a + b;
    }
    // Función definida dentro de otra función (no es posible en Java, solo es una llamada dentro de otra función)
    public static void funcionDentroDeOtraFuncion() {
        System.out.println("Llamada a una función dentro de otra función\n---------");
    }
    public static void metodoPrueba() {
        // Variable local dentro de un método
        int variableLocalMetodo = 30;

        System.out.println("Variable local dentro de metodoPrueba: " + variableLocalMetodo);
        System.out.println("Variable global dentro de metodoPrueba: " + variableGlobal);

        System.out.println("---------");
    }
    public static void fizzBuzz(String fizz, String buzz){
        for (int i = 0; i <=
         100; i++) {
            if(i % 3 == 0 && i % 5 ==0){
                System.out.println(fizz + " " + buzz);
            }else if(i % 3 == 0){
                System.out.println(fizz);
            }else if(i % 5 == 0){
                System.out.println(buzz);
            }else{
                System.out.println(i);
            }
        }
    }
}