import java.util.Scanner;

public static void main(String[] args) {
    System.out.println("Enter width: ");
    Scanner input = new Scanner(System.in);
    double Width = input.nextDouble();
    System.out.println("Enter height: ");
    double Height = input.nextDouble();

    double Area = Width * Height;
    double Perimeter = 2*(Width + Height);

    System.out.println("The Area of the rectangle is " + Area + " and the perimeter is " + Perimeter);
}