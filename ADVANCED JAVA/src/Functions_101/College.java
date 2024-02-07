package Functions_101;
import java.util.Scanner;

public class College {
    private double programming;
    private double webDesign;
    private double networking;
    private double total;
    private double average;

    public College(double programming, double webDesign, double networking) {
        this.programming = programming;
        this.webDesign = webDesign;
        this.networking = networking;
    }

    public College() {
        this(0.0, 0.0, 0.0);
    }

    public double getAverage() {
        return average;
    }

    public double getTotal() {
        return total;
    }

    public void compute() {
        total = programming + networking + webDesign;
        average = total / 3;
    }

    public void dataPrompt() {
        try (Scanner input = new Scanner(System.in)) {
            String[] units = {"Programming", "Networking", "Web Design"};
            programming = dataIn("Enter the marks for " + units[0] + ".\n", input);
            networking = dataIn("Enter the marks for " + units[1] + ".\n", input);
            webDesign = dataIn("Enter the marks for " + units[2] + ".\n", input);
        }
    }

    public void dataOut() {
        System.out.println("\n\t__________\t RESULTS \t__________\n");
        System.out.println("The marks for Programming are: \t\t\t" + programming + ".");
        System.out.println("The marks for Networking are: \t\t\t" + networking + ".");
        System.out.println("The marks for Web Design are: \t\t\t" + webDesign + ".");
        System.out.println("The Total mark is: \t\t\t\t" + total + ".");
        System.out.println("The average for the marks is: \t\t\t" + average + ".");
    }

    private static double dataIn(String message, Scanner input) {
        while (true) {
            try {
                System.out.print(message);
                return input.nextDouble();
            } catch (Exception e) {
                input.next();
                System.out.println("Invalid input!!");
            }
        }
    }

    public static void main(String[] args) {
        College college1 = new College();
        college1.dataPrompt();
        college1.compute();
        college1.dataOut();
    }
}
