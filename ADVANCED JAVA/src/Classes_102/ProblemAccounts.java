package Classes_102;
import java.util.Scanner;
import java.util.InputMismatchException;
public class ProblemAccounts {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int Num_of_Accounts;
        while(true){
            try{
                System.out.println("Please the Number of Accounts you're dealing with: ");
                Num_of_Accounts = sc.nextInt();
                break;
            } catch (InputMismatchException e){
                sc.next();
                System.out.println("Invalid!!! Please enter an Integer");
            }
        }

        Accounts[] accounts = new Accounts[Num_of_Accounts];

        for (int i = 0; i < accounts.length; i++){
            accounts[i] = new Accounts();
            accounts[i].inputData(i + 1);
        }
        System.out.println("==================* PROBLEM ACCOUNTS *==================");
        for(Accounts account : accounts){
            if (account.isProblemAccount()){
                account.displayAccountInfo();
            }
        }
        sc.close();
    }
}
