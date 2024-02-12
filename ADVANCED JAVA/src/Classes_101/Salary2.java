/*
 * 6)	Write a complete C# programming using the following specifications.
    Your program should accept the gross salary of an employee and compute both the
    tax amount and net salary using the following taxation rate.

    Gross Salary	            Tax Rate
    >=30,000 	                15%
    >=20,000 and < 30,000	    12%
    >= 10,000 and < 20,000	    10%
    <10,000	Not Taxed

    Your program should have a class called Salary2 with the following members: -
    Member Variables:
    gross, tax, net
    Member functions:
    	data_in( ) – For data input.
    	data_out( ) – For data output.
    	compute( ) – To perform calculations.
    In addition, your class should have the following: –
    	A constructor that initializes the member variables to some specified values
    	A default constructor that initializes all the member variables to 0.
    	An accessor function to provide access to the value in gross.
*/
package Classes_101;

import java.util.Scanner;

public class Salary2 {
    private double gross;
    private double tax;
    private double net;

    public Salary2(double gross){
        this.gross = gross;
        Compute();
    }
    public Salary2(){
        this(00);
    }
    //Accessor Method
    public double getGross(){
        return gross;
    }

    public double inputErrorHandling(Scanner prompt, String message){
        while (true){
            try{
                System.out.println(message);
                return prompt.nextDouble();
            } catch (Exception e){
                prompt.next();
                System.out.println("Invalid input!!");
            }
        }
    }
    public void input(){
        Scanner prompt = new Scanner(System.in);
        gross = inputErrorHandling(prompt, "Please enter the employees Gross salary");
        Compute();
        System.out.print("\n");
    }
    private void Compute(){
        if (gross >= 30000)
            tax = 0.15 * gross;
        else if(gross >= 20000)
            tax = 0.12 * gross;
        else if(gross >= 100000)
            tax = 0.10 * gross;
        else
            tax = gross;

        net = gross - tax;
    }

    public void output(){
        System.out.println("____________RESULTS____________");
        System.out.println("Gross Salary: \t\t\t"+ gross);
        System.out.println("Tax Amount: \t\t\t"+ Math.round(tax));
        System.out.println("Net Salary: \t\t\t"+ Math.round(net));
    }
}
