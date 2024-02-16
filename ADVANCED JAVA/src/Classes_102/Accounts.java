/*
 * 3)	A program that uses a class definition of a class called Accounts
 *  is required to process a corporations account records and to select a
 *  list of problem accounts. The generalized list is then brought to the
 *  attention of the comptroller through a printed report.
    Processing Requirements
    Read the following customer records through the key board
    	Customer Name
    	Customer Account number
    	Amount Owed (in kshs.)
    	Days Overdue
    Determine if the record is a problem account. An account is considered a
    problem if the amount owed is over kshs. 20,000 or the account is more than
    30 days overdue. Display the name of customer and associated information
    (account number, amount owed and days overdue) of all problem accounts in
    a suitable format.
    Write the program. NB: The user should decide how many customer/accounts he
    wants to work with at any particular time.
 */
package Classes_102;
import java.util.*;
public class Accounts {
    private String Customer_Name;
    private String Account_Num;
    private double Amount_Owed;
    private int Days_Overdue;

    public Accounts(String Customer_Name, String Account_Num, double Amount_Owed, int Days_Overdue){
        this.Customer_Name = Customer_Name;
        this.Account_Num = Account_Num;
        this.Amount_Owed = Amount_Owed;
        this.Days_Overdue = Days_Overdue;
    }
    public Accounts(){
        this("N/A","N/A",0,0);
    }
    private String InputErrorHandling(Scanner Prompt, String Message){
        while(true){
            try{
                System.out.println(Message);
                return Prompt.nextLine(); // Use next() for single-line inputs
            } catch (Exception e){
                Prompt.next();
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
    public void inputData(int Customer_Num){
        System.out.println("==================* CUSTOMER " + Customer_Num + " *==================");
        Scanner Prompt = new Scanner (System.in);
        Customer_Name = InputErrorHandling(Prompt, "Please the customer name: ");
        Account_Num = InputErrorHandling(Prompt,"Please enter the account number: ");
        Amount_Owed = Double.parseDouble(InputErrorHandling(Prompt,"Enter the amount owed: "));
        Days_Overdue = Integer.parseInt(InputErrorHandling(Prompt,"How many days is the account overdue? "));
    }
    public boolean isProblemAccount(){
        return Amount_Owed > 20000 && Days_Overdue > 30;
    }
    public void displayAccountInfo() {
        System.out.println("Customer Name: \t\t\t\t" + Customer_Name);
        System.out.println("Account Number: \t\t\t" + Account_Num);
        System.out.println("Amount Owed: \t\t\t\t" + Amount_Owed + " kshs.");
        System.out.println("Days Overdue: \t\t\t\t" + Days_Overdue);
        System.out.println();
    }
}
