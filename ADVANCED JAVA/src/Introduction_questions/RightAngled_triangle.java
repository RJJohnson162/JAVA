package Introduction_questions;
import java.util.InputMismatchException;
import java.util.Scanner;

public class RightAngled_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Please enter the base of the triangle");
            float base = sc.nextFloat();

            System.out.println("Please enter the height of the triangle");
            float height = sc.nextFloat();

            float area = (1.0f / 2.0f) * (height * base);

            System.out.println("The area of the triangle is " + area);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter valid numeric values.");
        } finally {
            sc.close();
        }
    }
}
