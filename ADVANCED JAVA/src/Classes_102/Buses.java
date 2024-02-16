/*
 * 4)	The following details of buses for Kenya Bus Services are stored:
 *  -RegNo
 *  -FuelCapacity
 *  -AxleWeight
 *  Write a program that uses a class called Buses
 *  to store the details given above. The program should include:
    	Declaration of the class
    	Declaration of an array instance of the class called Express of size 67.
    	A function definition for a member function to input the details of the 67
        buses Express buses.
    	A function definition to output the details input above.
    	A main() function to test the class definition above.                                  (14 mks)
 */

package Classes_102;
import java.util.Scanner;
public class Buses {
    private String RegNo;
    private int FuelCapacity;
    private double AxleWeight;

    public Buses(String RegNo, int FuelCapacity, double AxleWeight){
        this.RegNo = RegNo;
        this.FuelCapacity = FuelCapacity;
        this.AxleWeight = AxleWeight;
    }
    public Buses(){
        this("N/A",0,0);
    }
    public String InputErrorHandling(Scanner Input, String message){
        while(true){
            try{
                System.out.println(message);
                return Input.nextLine();
            } catch(Exception e){
                Input.next();
                System.out.println("Invalid input: " + e.getMessage());
            }
        }
    }
    public void setDetails(int Num_of_Buses){
        Scanner Input = new Scanner(System.in);
        System.out.println("==================* BUS " + Num_of_Buses + " DATA ENTRY *==================\n");
        RegNo = InputErrorHandling(Input, "Please enter the Bus Registration number: ");
        FuelCapacity = Integer.parseInt(InputErrorHandling(Input,"Enter the Fuel Capacity in litres: "));
        AxleWeight = Double.parseDouble(InputErrorHandling(Input,"Enter the Axle Weight in kg: "));
    }
    public void DisplayData(){
        System.out.println("==================* BUS DETAILS *==================\n");
        System.out.println("Reg No: \t\t"+ RegNo);
        System.out.println("Fuel Capacity:\t\t" + FuelCapacity + "\tLitres");
        System.out.println("Axle Weight:\t\t" + AxleWeight + "\tKg");
    }
}
