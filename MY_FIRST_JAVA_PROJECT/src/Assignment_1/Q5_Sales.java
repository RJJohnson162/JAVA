package Assignment_1;
import java.util.Scanner;

public class Q5_Sales {

    public static void main(String[] args) {

        // Define the names of the salesmen and items as arrays
        String[] salesmen = {"Brian", "Joan", "Mike"};//, "Chris", "Diana", "John", "Grace", "Paul", "Lucy", "James"};
        String[] items = {"Item1", "Item2", "Item3", "Item4", "Item5"};

        // Define a 2D array to store the sales made by each salesman for each item
        int[][] sales = new int[3][5];

        // Define variables for calculating totals
        int grandTotal = 0;
        int[] itemTotals = new int[5];

        try (
        // Define a scanner to get input from the user
        Scanner input = new Scanner(System.in)) {
            // Loop through each salesman and item to get sales input
            for (int i = 0; i < salesmen.length; i++) {
                // Get sales input for each item for this salesman
                System.out.println("Enter sales for " + salesmen[i] + ": ");
                for (int j = 0; j < items.length; j++) {
                    System.out.print(items[j] + ": ");
                    sales[i][j] = input.nextInt();
                }

                // Calculate and display the total sales for this salesman
                int totalSales = 0;
                for (int j = 0; j < items.length; j++) {
                    totalSales += sales[i][j];
                    itemTotals[j] += sales[i][j];
                }
                System.out.println("Total Sales: " + totalSales);

                // Add this salesman's total sales to the grand total
                grandTotal += totalSales;
            }
        }

        // Display the table header
        System.out.println("\nName\tItem1\tItem2\tItem3\tItem4\tItem5\tTotalSales");
        System.out.println("___________________________________________________");

        // Display the sales data for each salesman
        for (int i = 0; i < salesmen.length; i++) {
            System.out.print(salesmen[i] + "\t");
            for (int j = 0; j < items.length; j++) {
                System.out.print(sales[i][j] + "\t");
            }
            System.out.println(sales[i][0] + sales[i][1] + sales[i][2] + sales[i][3] + sales[i][4]);
        }

        // Display the item totals and grand total
        System.out.println("Item\t");
        System.out.print("Totals:\t");
        for (int i = 0; i < items.length; i++) {
            System.out.print(itemTotals[i] + "\t");
        }
        System.out.println(grandTotal);
    }

}
