import java.util.Scanner;

public class Q4_AreaCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int shapeChoice = 0;
        int Trials = 0;

        while (shapeChoice < 1 || shapeChoice > 3) {
            System.out.println("Enter the shape:");
            System.out.println("1. Triangle");
            System.out.println("2. Rectangle");
            System.out.println("3. Circle");
            System.out.print("Your shapeChoice: ");
            shapeChoice = scanner.nextInt();
            Trials++;

            if (Trials == 3) {
                System.out.println("Too many Trials. Program exiting.");
                System.exit(0);
            }
        }

        switch (shapeChoice) {
            case 1:
                System.out.print("Enter base of triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter height of triangle: ");
                double height = scanner.nextDouble();
                double triangleArea = 0.5 * base * height;
                System.out.println("The area of the triangle is " + triangleArea);
                break;

            case 2:
                System.out.print("Enter length of rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter width of rectangle: ");
                double width = scanner.nextDouble();
                double rectangleArea = length * width;
                System.out.println("The area of the rectangle is " + rectangleArea);
                break;

            case 3:
                System.out.print("Enter radius of circle: ");
                double radius = scanner.nextDouble();
                double circleArea = Math.PI * radius * radius;
                System.out.println("The area of the circle is " + circleArea);
                break;
        }

        scanner.close();

    }

}
