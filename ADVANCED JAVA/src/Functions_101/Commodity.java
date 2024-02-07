package Functions_101;
import java.util.Scanner;

public class Commodity {
    private double buyingPrice;
    private double transportCost;
    private double sellingPrice;
    private double profit;

    public Commodity(double buyingPrice, double transportCost, double sellingPrice) {
        this.buyingPrice = buyingPrice;
        this.transportCost = transportCost;
        this.sellingPrice = sellingPrice;
    }

    public Commodity() {
        this(0.0, 0.0, 0.0);
    }

    public void getData(int itemNumber) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter details for item " + itemNumber + ":");
        this.buyingPrice = inputErrorHandling(input, "Enter buying price: ");
        this.transportCost = inputErrorHandling(input, "Enter transport cost: ");
        this.sellingPrice = inputErrorHandling(input, "Enter selling price: ");
    }

    public void calculate() {
        profit = sellingPrice - (transportCost + buyingPrice);
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public void giveOutput() {
        if (profit > 0) {
            System.out.println("You've made a profit of $" + profit + ".");
        } else if (profit < 0) {
            System.out.println("You've incurred a loss of $" + (-profit) + ".");
        } else {
            System.out.println("You've broken even.");
        }
    }

    private double inputErrorHandling(Scanner input, String message) {
        while (true) {
            try {
                System.out.print(message);
                return input.nextDouble();
            } catch (Exception e) {
                input.next();
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }

    public static void compare(Commodity item1, Commodity item2) {
        double diff = item1.getBuyingPrice() - item2.getBuyingPrice();
        if (diff > 0) {
            System.out.println("Item 1 is more expensive than Item 2 by $" + diff);
        } else if (diff < 0) {
            System.out.println("Item 2 is more expensive than Item 1 by $" + (-diff));
        } else {
            System.out.println("Both items have the same buying price.");
        }
    }
}
