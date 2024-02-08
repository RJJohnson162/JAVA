/* 
 * 4)	A program is required that accepts the basic salary, allowance and tax
 *  rate and computes the tax amount and net salary of an employee. The computations
 *  are done as follows: -
    gross salary=basic salary + allowance
    tax amount = tax rate/100 * gross salary
    net salary = gross salary – tax amount
    Write a complete program that uses a class called Salary to implement the above
    requirements. The class should have the following specifications.
    Member variables: -
    	basic_salary
    	allowance
    	tax_rate
    	tax_amount
    	net_salary
    Member functions: -
    	input – for inputting details
    	output – for outputting details
    	compute – for computing the tax amount and the net salary.
    In addition, your class should have the following: –
    	A constructor that initializes basic salary, allowance and tax_rate to specified values
    	A default constructor that initializes the three variables with 10,000 and 5,000 and 10 respectively.
    	An accessor function to provide access to the value in basic_salary.
    	A function that will enable you to compare the net_salary for two employees in the main function and then outputs an appropriate message.
 */
package Functions_101;
import java.util.Scanner;
public class Salary {
    private double basic_salary;
    private double allowance;
    private double tax_rate;
    private double tax_amount;
    private double net_salary;
    private double gross_salary;

    public Salary(double basic_salary, double allowance, double tax_rate){
        this.basic_salary = basic_salary;
        this.allowance = allowance;
        this.tax_rate = tax_rate;
        Compute();
    }
    // Default Constructor
    public Salary(){
        this(0.0,0.0,0.0);
    }
    public double getBasicSalary(){
        return basic_salary;
    }
    public double inputErrorHandling(Scanner input, String prompt){
        double value = 0.0;
        boolean isValid = false;
        while(!isValid){
            try{
                System.out.println(prompt);
                value = input.nextDouble();
                isValid = true;
            } catch (Exception e){
                input.next();
                System.out.println("Invalid input!!!");
            }
        }
        return value;
    }
    public void input(int employeeNum) {
        Scanner prompt = new Scanner(System.in);
        System.out.println("____________EMPLOYEE " + employeeNum + " DATA____________");
        System.out.print("\n");
        System.out.println("Enter the data for employee "+ employeeNum);
        this.basic_salary = inputErrorHandling(prompt, "Please enter your Basic Salary");
        this.allowance = inputErrorHandling(prompt, "Please enter your Allowance");
        this.tax_rate = inputErrorHandling(prompt,"Please enter your Tax Rate");
        System.out.print("\n");
        Compute();
    }
    private void Compute (){
        gross_salary=basic_salary + allowance;
        tax_amount = tax_rate/100 * gross_salary;
        net_salary = gross_salary - tax_amount;
    }
    public void output(int employeeNum){
        System.out.println("____________EMPLOYEE " + employeeNum + " DETAILS____________");
        System.out.print("\n");
        System.out.println("Gross Salary\t\t\t" + gross_salary);
        System.out.println("Tax Amount \t\t\t" + tax_amount);
        System.out.println("Net salary \t\t\t" + net_salary);
        // print empty line
        System.out.print("\n");
    }
    public static void Compare(Salary Employee1,Salary Employee2){
        if (Employee1.net_salary > Employee2.net_salary){
            System.out.println("1st Employee has a higher net salary by " + (Employee1.net_salary-Employee2.net_salary));
        } else if(Employee1.net_salary < Employee2.net_salary){
            System.out.println("2nd Employee has a higher net salary by " + (Employee2.net_salary-Employee1.net_salary));
        } else{
            System.out.println("They both have equal net salary of " + (Employee2.net_salary));
        }
    }
}
