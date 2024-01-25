package Selection_1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] MenuItems = {"Pilsner", "Tusker", "WhiteCap", "Smirnoff"};
        int[] itemPrices = {140, 240, 180, 200};

        // MENU DISPLAY SELECTION
        System.out.println("____________\tMENU\t_____________");
        System.out.print("\n");
        System.out.println("Item\t\t\t\tPrice");
        System.out.println("1. " + MenuItems[0] + "\t\t\t" + itemPrices[0]);
        System.out.println("2. " + MenuItems[1] + "\t\t\t" + itemPrices[1]);
        System.out.println("4. " + MenuItems[3] + "\t\t\t" + itemPrices[3]);
        System.out.println("3. " + MenuItems[2] + "\t\t\t" + itemPrices[2]);

        // INSERTION BLOCK
        System.out.println("Please enter your item no. of choice");
        int choice;
        while(true){
            try{
                choice = input.nextInt();
                if (choice > 0 && choice < MenuItems.length + 1){
                    break;
                }else{
                    System.out.println("Invalid entry! Please enter a number between 1 and " + MenuItems.length);
                }
            }catch (InputMismatchException e){
                input.next();
                System.out.println("Invalid entry! Please enter a number.");
            }
        }

        if (choice >= 1 && choice <= 4) {
            System.out.println("Enter your number of bottles for " + MenuItems[choice - 1] + ".");
            int bottles = input.nextInt();

            double cost = itemPrices[choice - 1] * bottles;

            System.out.println("Your Total is : " + cost);
        } else {
            System.out.println("Invalid choice. Please enter a number between 1 and 4.");
        }
        input.close();
    }
}
