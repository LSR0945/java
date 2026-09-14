import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int result = 0;

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        System.out.println("enter operater: +, -, *, /");
        String operator = input.next();

        switch (operator) {
            case "+":result = num1 + num2;
                System.out.println("Result = " + result);
                break;

            case "-":result = num1 - num2;
                System.out.println("Result = " + result);
                break;

            case "*":result = num1 * num2;
                System.out.println("Result = " +result);
                break;

            case "/":result = num1 / num2;
                System.out.println("Result = " +result);
               

            default:
                System.out.println("Invalid Choice!");
        }

        input.close();
    }
}