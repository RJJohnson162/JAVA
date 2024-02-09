/*
 * 5) A program is required that accepts the registration number, name
 *  and average mark of a student and then outputs his/her grade.
    Declare a class called Student that has the following specifications:
    Private member variables:
    	name
    	avg_mark
    	grade
    	reg_no
    Public member functions:
    	input – to be used to input values into member variables.
    	compute – To assign a letter grade based on the average mark.
    	display – to display contents of member variables.
    In addition, your class should have the following: –
    	A constructor that initializes all the member variables with specified values.
    	A default constructor.
    	An accessor function to provide access to the value in grade.
 */
package Functions_101;
import java.util.Scanner;
public class Student {
    private String Reg_no;
    private String Name;
    private double Average_Mark;
    private String Grade;

    public Student (String Reg_no,String Name, double Average_Mark){
        this.Reg_no = Reg_no;
        this.Name= Name;
        this.Average_Mark = Average_Mark;
        Compute(); // Calling the compute method to calculate the grade
    }
    public Student(){
        this("N/A","N/A", 00);
    }
    public String getGrade(){
        return Grade;
    }
    private String inputErrorHandling(Scanner prompt, String message){
        while(true){
            try{
                System.out.println(message);
                // return a stringified result even when the entry is double
                return String.valueOf(prompt.nextLine());
            } catch (Exception e){
                prompt.next();
                System.out.println("Invalid Entry! Please enter again.\n");
            }
        }
    }
    public void input(int Student_num){
        Scanner prompt = new Scanner (System.in);
        if (Student_num > 0) {
            System.out.println(" ____________STUDENT " + Student_num + " DETAILS____________ \n");
            Reg_no = inputErrorHandling(prompt,"Enter Register Number for student: ");
            Name = inputErrorHandling(prompt,"\nEnter name of student " + (Student_num+1) + ": ");
            Average_Mark = Double.parseDouble(inputErrorHandling(prompt,"\nEnter average mark of student " + Name + ": "));
            Compute();
            System.out.print("\n");
        }
        System.out.println("Please enter the number of students who have taken the course.(MUST BE GREATER THAN ZERO).");
    }
    private void Compute(){
        if (Average_Mark >= 80 )
            Grade = "A";
        else if (Average_Mark >= 74)
            Grade = "A-";
        else if(Average_Mark >= 67)
            Grade = "B+";
        else if (Average_Mark >= 60)
            Grade = "B";
        else if (Average_Mark >=56)
            Grade ="B-" ;
        else if (Average_Mark >= 53)
            Grade = "C+";
        else if (Average_Mark >= 50)
            Grade = "C";
        else if (Average_Mark >= 46)
            Grade= "C-";
        else if (Average_Mark >= 42)
            Grade = "D+";
        else
            Grade = "E";
    }
    public void display(int Student_num){
        System.out.println("____________STUDENT "+ Student_num + " RESULTS____________\n");
        System.out.println("Registration number : \t\t\t" + Reg_no);
        System.out.println("Student Name : \t\t\t\t"+ Name);
        System.out.println("Average Marks : \t\t\t" + Average_Mark);
        System.out.println("Grade : \t\t\t\t" + Grade);
    }
}
// For main function go to file Result.java
