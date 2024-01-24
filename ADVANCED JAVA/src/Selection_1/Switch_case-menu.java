package Selection_1;
import java.util.Scanner;

public class Switch_Case_Menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] MenuItems = {"Cappuccino", "Java", "Ice tea", "Croissant"};
        int[] Price = {350, 360, 280, 150};

        System.out.println("Welcome to the Menu!");

        // MENU DISPLAY SELECTION
        System.out.println("\t____________\tMENU\t_____________");
        System.out.print("\n");
        System.out.println("Item                        Price");
        for (int counter = 0; counter < MenuItems.length; counter++) {
            System.out.println("1. " + MenuItems[counter] + "                        " + Price[counter]);
        }

        System.out.print('\n');
        System.out.println("Please enter the item number of choice: ");
        int ItemNumber = input.nextInt();

        if (ItemNumber <= 4) {
            switch (ItemNumber) {
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("You have chosen " + MenuItems[ItemNumber - 1] + ", and it costs " + Price[ItemNumber - 1]);
                    System.out.println("How many orders would you like to place? ");
                    int Quantity = input.nextInt();
                    int totalCost = Price[ItemNumber - 1] * Quantity;

                    System.out.println("Your Total cost is " + totalCost);
                    break;
                default:
                    System.out.println("That's not a valid selection.");
            }
        } else {
            System.out.println("That's not a valid selection.");
        }
    }
}
