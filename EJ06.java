public class EJ06 {
    public static void main(String[] args) {
        printNumbersFrom100ToO(100);

        //FACTORIAL
        int numero = 5;//Número para calcular el factorial
        long factorial = calcularFactorial(numero);
        System.out.println("El factorial de " + numero + " es " + factorial);
        System.out.println("----------");

        //FIBONACCI
        int posicion = 10;//Calcular la posición 10 de Fibonacci
        long fibonacci = fibonacci(posicion);
        System.out.println("La posición " + posicion + " es igual a " + fibonacci + " en la sucesión de fibonacci");
        System.out.println("----------");
    }

    public static void printNumbersFrom100ToO(int num){
        if (num < 0) {
            System.out.println("----------");
            return;// Caso base para detener la recursividad cuando llegue a cero
        } else {
            System.out.println(num);
            printNumbersFrom100ToO( num - 1);
        }
    }

    public static long calcularFactorial(int num){
        if (num == 0 || num == 1){
            return 1;
        } else {
            return num * calcularFactorial(num - 1);
        }
    }

    public static long fibonacci(int pos){
        if (pos == 0){
            return 0;
        } else if (pos == 1) {
            return 1;
        } else {
            return fibonacci(pos - 1) + fibonacci(pos - 2);
        }
    }
}
