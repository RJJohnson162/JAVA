package Introduction_questions;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the radius of the circle");
        double radius;
        while (true) {
            try {
                radius = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.nextLine();
            }
        }

        double area = 3.142 * radius * radius;
        double circumference = 2 * 3.142 * radius;

        System.out.println("The area of the circle is " + area + " and the circumference is " + circumference);
        scanner.close();
    }
}
