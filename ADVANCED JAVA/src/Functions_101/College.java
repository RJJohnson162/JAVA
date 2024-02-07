package Functions_101;
import java.util.Scanner;
public class College {
    private static double Programming;
    private static double Web_Design;
    private static double Networking;
    private double Total;
    private double Average;

    public College(double Programming, double Web_Design, double Networking){
        College.Programming = Programming;
        College.Web_Design = Web_Design;
        College.Networking = Networking;
    }
    public College(){
        College.Networking= 0.0;
        College.Programming = 0.0;
        College.Web_Design = 0.0;
    }

    public double getAverage(){
        return Average;
    }
    public double getTotal(){
        return Total;
    }

    public static double data_in(String message, Scanner Input){
        try{
            System.out.print(message);
            return Input.nextDouble();
        } catch (Exception e){
            Input.next();
            System.out.println("Invalid input!!");
            return data_in(message, Input);
        }
    }
    public void compute(){
        Total = Programming + Networking + Web_Design;
        Average = Total/3;

    }
    public void dataPrompt(){
        Scanner Input = new Scanner(System.in);
        String[] Units = {"Programming", "Networking", "Web Design"};
        Programming = data_in("Enter the marks for"+Units[0]+".\n",Input);
        Networking = data_in("Enter the marks for"+Units[1]+".\n",Input);
        Web_Design = data_in("Enter the marks for"+Units[2]+".\n",Input);
    }
    public void dataOut(){
        System.out.println("\n\t__________\t RESULTS \t__________\n");
        System.out.println("The marks for Programming are: \t\t\t"+Programming+".");
        System.out.println("The marks for Networking are: \t\t\t"+Networking+".");
        System.out.println("The marks for Web_Design are: \t\t\t"+Web_Design+".");
        System.out.println("The Total mark is: \t\t\t\t"+Total+".");
        System.out.println("The average for the marks is: \t\t\t"+Average+".");

    }
}
class Main {
    public static void main(String[] args){
        College college1 = new College();
        college1.dataPrompt();
        college1.compute();
        college1.dataOut();
    }
}
