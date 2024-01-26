package Selection_1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Switch_caseMenu {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] MenuItems = {"Cappuccino", "Java(black)", "Ice tea", "Croissant"};
        int[] Price = {350, 360, 280, 150};

        System.out.println("\tWELCOME TO THE MENU!!!");

        // MENU DISPLAY SELECTION
        System.out.println("____________\tMENU\t_____________");
        System.out.print("\n");
        System.out.println("Item\t\t\t\tPrice");
        for (int counter = 0; counter < MenuItems.length; counter++) {
            System.out.println((counter + 1) +". " + MenuItems[counter] + "\t\t\t" + Price[counter]);
        }

        System.out.print('\n');
        int ItemNumber;
        while (true){
            try{
                System.out.println("Please enter the item number of choice: ");
                ItemNumber = input.nextInt();
                if(ItemNumber > 0 && ItemNumber <= 4){
                    break;
                }else{
                    System.out.println("Invalid input. Please enter a number between 1 and 4");
                }
            }catch(InputMismatchException e){
                input.next();
                System.out.println("Invalid input type. Please enter a numeric value.");
            }
        }

        if (ItemNumber <= 4) {
            switch (ItemNumber) {
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("You have chosen " + MenuItems[ItemNumber - 1] + ", and it costs " + Price[ItemNumber - 1]);
                    System.out.println("How many orders would you like to place? ");
                    int Quantity;
                    while (true) {
                        try {
                            Quantity = input.nextInt();
                            if (Quantity >= 1) {
                                double totalCost = Quantity * Price[ItemNumber - 1];
                                System.out.println("Your Total cost is " + totalCost);
                                System.out.println("\nThank you for your business come back again!");
                                break;
                            }else{
                                System.out.println("Invalid quantity entered. Please enter a number greater than zero.");
                            }
                        }catch (InputMismatchException e){
                            input.next();
                            System.out.println("Invalid input type. Please enter a numeric value.");
                        }
                    }
                    break;
                default:
                    System.out.println("That's not a valid selection.");
            }
        } else {
            System.out.println("That's not a valid selection.");
        }
        input.close();
    }
}
