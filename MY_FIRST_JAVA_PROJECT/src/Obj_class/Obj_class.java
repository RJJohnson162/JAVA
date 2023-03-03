package Obj_class;
import java.util.Scanner;

public class Obj_class {
  public static void main(String[] args) {
    Rectangle rec=new Rectangle();
    Scanner reader=new Scanner(System.in);
    int len, wid;
    System.out.println("Enter length and width of Rectangle");
    len=reader.nextInt();
    wid=reader.nextInt();
    rec.setLength(len);
    rec.setWidth(wid);
    System.out.println("Area of the Rectangle with length: " +    
    rec.getLength() + " and "+rec.getWidth() +" is "+ 
    rec.findArea());
  }
}
