/*
 * 1) Consider a used-car yard in downtown Nairobi called Makokha Car
 *  Sales that needs to store details of the vehicles they have in stock.
 *  For each vehicle we need to store the following:
    	Registration number
    	Make
    	Distance traveled in Km
    	Buying price (In kshs)
    	Selling price (In kshs)
    	Name of the previous owner
    Write a C# program that uses a class named UsedCar and inputs the details
    for all 30 vehicles in the yard. The program then outputs the details of
    all vehicles with selling prices between kshs. 400,000 and kshs. 1,000,000.
                                    (14 mks)
 */
package Classes_102;
import java.util.Scanner;
public class UsedCar {
    private String Reg_no;
    private String Make;
    private double Mileage;
    private double Buying_price;
    private double Selling_price;
    private String prevOwner;

    public UsedCar(String Reg_no, String Make, double Mileage, double Buying_price, double Selling_price, String prevOwner){
        this.Reg_no = Reg_no;
        this.Make = Make;
        this.Mileage = Mileage;
        this.Buying_price = Buying_price;
        this.Selling_price = Selling_price;
        this.prevOwner = prevOwner;
    }
    public String inputErrorHandling(Scanner prompt, String message){
        while(true){
            try{
                System.out.println(message);
                return prompt.nextLine();
            } catch(Exception e){
                prompt.next();
                System.out.println("Invalid input!!!");
            }
        }
    }
}
