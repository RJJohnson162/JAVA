package Classes_101;
import java.util.Scanner;
public class Max {
    public static double getInput(String message, Scanner input){
        try{
            System.out.println(message);
            return input.nextDouble();
        }catch (Exception e){
            input.next();
            System.out.println("Invalid input!!!");
            return getInput("Please enter a numerical value",input);
        }
    }
    public static double getMax(double a, double b){
        if (a<b){
            return b;
        }
        return a;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double num1 = getInput("Please enter the first number.", input);
        double num2 = getInput("Please enter the second number.", input);

        double Max = getMax(num1, num2);

        System.out.println("The max number is " + Math.round(Max));
    }
}
