package Assignment_1;
import java.util.Scanner;

public class Q3_creditEvaluator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of customers: ");
        int numOfCustomers = scanner.nextInt();

        for (int i = 1; i <= numOfCustomers; i++) {
            System.out.println("Customer " + i);

            System.out.print("Enter credit limit: ");
            double creditLimit = scanner.nextDouble();

            System.out.print("Enter price of item: ");
            double price = scanner.nextDouble();

            System.out.print("Enter quantity of item: ");
            int quantity = scanner.nextInt();

            double totalValue = price * quantity;

            if (totalValue > creditLimit) {
                System.out.println("Sorry you cannot purchase goods of such value on credit.");
                System.out.println("Please re-enter the quantity of the item: ");
                quantity = scanner.nextInt();

                totalValue = price * quantity;

                if (totalValue > creditLimit) {
                    System.out.println("Sorry, you cannot purchase the item on credit.");
                    continue; // skip to next customer
                }
            }

            System.out.println("Thank you for purchasing from us.");
            System.out.println("Total value of purchase: " + totalValue);
        }

        scanner.close();

    }

}
