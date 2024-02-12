/*
 * 3)	Write a program that calculates both the area and perimeter
 * of a rectangle. Your program must make use of a class called Rectangle
 * with the following members.
    Member Variables:
    	width (to hold the width of the rectangle)
    	length (to hold the length of the rectangle)
    	perimeter (to hold the perimeter of the rectangle)
    	area (to hold the area of the rectangle)
    Member Functions:
    	input( )
    	compute( )
    	output( )
    In addition, your class should have the following: –
    	A constructor that initializes the member variables to some specified values
    	A default constructor that initializes width and length with 1.
    	An accessor function to provide access to the value in perimeter.
*/

package Classes_101;
import java.util.Scanner;

public class Rectangle {
    private double width;
    private double length;
    private double perimeter;
    private double area;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        compute(); // Compute perimeter and area upon object creation
    }

    public Rectangle() {
        this(1.0, 1.0);
    }

    public double getPerimeter() {
        return perimeter;
    }
    public double inputErrorHandling(String prompt, Scanner input) {
        double value = 0.0;
        boolean isValidInput = false;

        while (!isValidInput) {
            try {
                System.out.println(prompt);
                value = input.nextDouble();
                isValidInput = true; // Input is valid, exit loop
            } catch (Exception e) {
                input.next(); // Consume invalid input
                System.out.println("Invalid input!!!");
            }
        }

        return value;
    }


    public void input(Scanner input) {
        length = inputErrorHandling("Please enter the length of the rectangle: ",input);
        width = inputErrorHandling("Please enter the width of the rectangle: ",input);
        compute(); // Recompute perimeter and area after input
    }

    private void compute() {
        perimeter = 2 * (width + length);
        area = width * length;
    }

    public void output() {
        System.out.println("The perimeter of the rectangle is: " + perimeter);
        System.out.println("The area of the rectangle is: " + area);
    }
}

// For main function go to CallRect.java