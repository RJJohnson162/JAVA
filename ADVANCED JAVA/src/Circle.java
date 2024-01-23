import java.util.Scanner;

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter the radius of the circle");
    double radius = scanner.nextDouble();

    double Area = 3.142* radius * radius;
    double Circumference = 3.142 * radius + radius;

    System.out.println("The area of the circle is " + Area + " and the circumference is " + Circumference);
}