package Selection_1;

import java.util.Scanner;

public class Numerical_Calculator {
    private static double getInput(String message, Scanner input){
        try{
            System.out.println(message);
            return input.nextDouble();
        }catch(Exception e){
            input.nextLine();
            System.out.println("Invalid input! Please enter a number.");
            return getInput(message, input);
        }
    }
    private static double handleDivisionByZero(Scanner input){
        System.out.println("Invalid input! Zero is not allowed. Please enter a valid number.");
        return getInput("Enter a non-zero number for the second number please.", input);
    }
    private static double handleModuloByZero(Scanner input) {
        System.out.println("Error: Modulo by zero is not allowed.");
        return getInput("Enter a non-zero value for the second number:", input);
    }
    private static void handleInvalidOperator() {
        System.out.println("Error: Invalid operator.");
    }
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        double num1 = getInput("Enter the first number", input);
        double num2 = getInput("Enter the second number", input);

        System.out.println("Enter the operator (+, -, *, /, %):");
        char operator = input.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = (num2 != 0) ? num1 / num2 : handleDivisionByZero(input);
                break;
            case '%':
                result = (num2 != 0) ? num1 % num2 : handleModuloByZero(input);
                break;
            default:
                handleInvalidOperator();
                return;
        }

        System.out.println("Result: " + result);

        input.close();
    }
}
