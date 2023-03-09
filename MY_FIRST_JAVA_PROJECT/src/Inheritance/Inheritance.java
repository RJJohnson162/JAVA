package Inheritance;

import java.util.Scanner;

public class Inheritance {
    public static void main(String [] args){
        circle myCircle = new circle();
        Cylinder myCylinder = new Cylinder();
        Scanner reader=new Scanner(System.in);
        double radius, length;
        System.out.println("Enter the radius of the circle");
        radius=reader.nextDouble();
        myCircle.setRadius(radius);
        myCylinder.setRadius(radius);
        System.out.println("Enter the height of the cylinder");
        length=reader.nextDouble();
        myCylinder.setLength(length);
        System.out.println("The area of circle is: " + 
        myCircle.findArea());
        System.out.println("The volume of cylinder is: " + 
        myCylinder.findVolume());
        }
        
}
