package Functions_101;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Employee {
    public static void main(String[] args){
        try{
            Scanner input = new Scanner(System.in);
            System.out.println("____________WELCOME TO THE SYSTEM____________");
            System.out.print("\n");
            int employees;
            while(true){
                try{
                    System.out.println("Please enter the number if employees you'd wish to enter data for: ");
                    employees = input.nextInt();
                    break;
                } catch (InputMismatchException e){
                    System.out.println("Please enter a valid number!");
                    continue;
                }
            }
            //Create an array of employee objects and populate it with user-inputted data
            Salary[] Employees = new Salary[employees];

            for(int i=0; i<Employees.length; i++){
                Employees[i] = new Salary();
                Employees[i].input(1 + i);
                Employees[i].output(i + 1);
            }

            if(employees >= 1){
                System.out.println("Would you like to compare the net salaries of two employees? Y/N: ");
                char choice = input.next().toUpperCase().charAt(0);
                if (choice == 'Y'){
                    if (choice == 'Y') {
                        int employeeOne;
                        int employeeTwo;
                        while(true){
                            try{
                                System.out.println("Enter the first Employee number:");
                                employeeOne = input.nextInt();
                                System.out.println("Enter the second Employee number:");
                                employeeTwo = input.nextInt();
                                if (employeeOne > 0 && employeeOne <= employees && employeeTwo > 0 && employeeTwo <= employees) {
                                    Salary.Compare(Employees[employeeOne - 1], Employees[employeeTwo - 1]);
                                } else {
                                    System.out.println("Invalid Employee numbers.");
                                }
                            }catch (InputMismatchException e){
                                System.out.println("Please enter a valid number!");
                                continue;
                            }
                        }
                    }
                }
            }

            input.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
