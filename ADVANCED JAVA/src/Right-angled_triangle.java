import java.util.Scanner;

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Please enter the base of the triangle");
    float Base = sc.nextFloat();
    System.out.println("Please enter the height of the triangle");
    float Height = sc.nextFloat();

    float Area = .5 (Height*Base);

    System.out.println("The area of the triangle is " + Area);
}