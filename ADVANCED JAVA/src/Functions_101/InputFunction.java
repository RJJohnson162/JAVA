package Functions_101;

import java.util.Scanner;

public class InputFunction {
    public static int input(Scanner input, String message){
        try{
            System.out.println(message);
            return input.nextInt();
        }catch(Exception e){
            input.next();
            System.out.println("Invalid input! Please try again");
            return input(input,"Please enter a number instead.");
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int age = input(input,"Please enter your age.");
        System.out.println("Your age is " + age);
    }
}
