import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float res = 0;
        char c;

        do {
            String operator = scanner.nextLine();
            float num1 = scanner.nextFloat();
            float num2 = scanner.nextFloat();
            scanner.nextLine();

            switch(operator) {
                case "+":
                    res = num1 + num2;
                    break;
                case "-":
                    res = num1 - num2;
                    break;
                case "*":
                    res = num1 * num2;
                    break;
                case "/":
                    res = num1 / num2;
                    break;
            }
            System.out.println(res);
            c = scanner.nextLine().charAt(0);
            
        }while(c != 'e');
        scanner.close();
    }
}
