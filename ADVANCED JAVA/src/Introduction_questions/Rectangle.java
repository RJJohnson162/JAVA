package Introduction_questions;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Enter width: ");
            double width = input.nextDouble();

            System.out.println("Enter height: ");
            double height = input.nextDouble();

            double area = width * height;
            double perimeter = 2 * (width + height);

            System.out.println("The Area of the rectangle is " + area + " and the perimeter is " + perimeter);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter valid numeric values.");
        } finally {
            input.close();
        }
    }
}
