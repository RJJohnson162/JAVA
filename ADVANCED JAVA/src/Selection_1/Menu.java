/* 
 * 1)Write a program that when run, produces a menu showing beer
 * brands and their prices and then prompts the user enter his/her 
 * choice (1,2,3 or 4). The user is then asked how many bottles he/she
 * wants. He is then given the total cost (depending on the cost of the
 * beer chosen) as the output. See sample dialog below. If he/she enters
 * an invalid choice e.g. 8, he/she should get an error message.
Sample dialog
a)	Use the if…else statement
b)	Use the switch statement.

 */
package Selection_1;
import java.util.Scanner;

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String[] MenuItems = {"Pilsner", "Tusker", "WhiteCap","smirnoff",};
    int[] itemPrices = {"140", "240", "180","200"};

    // MENU DISPLAY SELECTION
    System.out.println("____________MENU_____________");
    System.out.print("\n");
    System.out.println("Item                        Price");
    System.out.println("1. " + MenuItems[0] + "                        " + itemPrices[0]);
    System.out.println("2. " + MenuItems[1] + "                        " + itemPrices[1]);
    System.out.println("3. " + MenuItems[2] + "                        " + itemPrices[2]);
    System.out.println("4. " + MenuItems[3] + "                        " + itemPrices[3]);

    // INSERTION BLOCK
    System.out.println("Please enter your item no. of choice");
    int Choice = input.nextInt();

    if (Choice == 1){
        System.out.println("Enter your number of bottles for " + MenuItems[0] + ".");
        int Bottles = input.nextInt();

        double Cost = itemPrices[0] * Bottles;

        System.out.println('Your Total is : ' + Cost);
    }
    else if (Choice == 2){
        System.out.println("Enter your number of bottles for " + MenuItems[1] + ".");
        int Bottles = input.nextInt();

        double Cost = itemPrices[1] * Bottles;

        System.out.println('Your Total is : ' + Cost);
    }
    else if (Choice == 3){
        System.out.println("Enter your number of bottles for " + MenuItems[2] + ".");
        int Bottles = input.nextInt();

        double Cost = itemPrices[2] * Bottles;

        System.out.println('Your Total is : ' + Cost);
    }else{
        System.out.println("Enter your number of bottles for " + MenuItems[3] + ".");
        int Bottles = input.nextInt();

        double Cost = itemPrices[3] * Bottles;

        System.out.println('Your Total is : ' + Cost);
    }

}