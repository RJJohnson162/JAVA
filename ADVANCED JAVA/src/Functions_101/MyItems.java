package Functions_101;

import java.util.Scanner;

public class MyItems {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Please enter the number of items to process:");
            int numItems = input.nextInt();
            Commodity[] commodities = new Commodity[numItems];

            for (int i = 0; i < numItems; i++) {
                commodities[i] = new Commodity();
                commodities[i].getData(i + 1);
                commodities[i].calculate();
                commodities[i].giveOutput();
            }

            System.out.println("Do you want to compare any two items? (Y/N)");
            char choice = input.next().toUpperCase().charAt(0);
            if (choice == 'Y') {
                System.out.println("Enter the first item number:");
                int itemOne = input.nextInt();
                System.out.println("Enter the second item number:");
                int itemTwo = input.nextInt();
                if (itemOne > 0 && itemOne <= numItems && itemTwo > 0 && itemTwo <= numItems) {
                    Commodity.compare(commodities[itemOne - 1], commodities[itemTwo - 1]);
                } else {
                    System.out.println("Invalid item numbers.");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}