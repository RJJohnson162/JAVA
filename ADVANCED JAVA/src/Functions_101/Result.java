package Functions_101;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Result {
    public static void main(String[] args){
        System.out.println("____________WELCOME TO EXA-RESULT____________");
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter the number of students you wish to enter data for: ");
        int Num_of_Students;
        while(true){
            try{
                Num_of_Students = input.nextInt();
                break;
            }catch (InputMismatchException e){
                System.out.print("\nPlease enter a valid integer!");
                input.next();
                continue;
            }
        }
        Student[] Students = new Student[Num_of_Students];
        for (int i = 0; i < Num_of_Students; i++) {
            Students[i] = new Student();
            Students[i].input(i + 1);
            Students[i].display(i + 1);
        }
        input.close();
    }
}
