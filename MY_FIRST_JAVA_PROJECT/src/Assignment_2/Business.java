package Assignment_2;
import java.util.Scanner;

public class Business {
    private double buyingPrice;
    private double sellingPrice;
    private double transportCost;

    public Business(double buyingPrice, double sellingPrice, double transportCost) {
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.transportCost = transportCost;
    }

    public Business() {
        this.buyingPrice = 0;
        this.sellingPrice = 0;
        this.transportCost = 0;
    }

    public void computeProfitOrLoss() {
        double profit = sellingPrice - (buyingPrice + transportCost);
        if (profit > 0) {
            System.out.println("Profit made: $" + profit);
        } else if (profit < 0) {
            System.out.println("Loss made: $" + (-profit));
        } else {
            System.out.println("No profit or loss made");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter buying price: ");
        double buyingPrice = input.nextDouble();
        System.out.print("Enter selling price: ");
        double sellingPrice = input.nextDouble();
        System.out.print("Enter transport cost: ");
        double transportCost = input.nextDouble();

        Business item1 = new Business(buyingPrice, sellingPrice, transportCost);

        System.out.print("Enter buying price for the item: ");
        buyingPrice = input.nextDouble();
        System.out.print("Enter item selling price: ");
        sellingPrice = input.nextDouble();
        System.out.print("Enter transport cost: ");
        transportCost = input.nextDouble();

        Business item2 = new Business(buyingPrice, sellingPrice, transportCost);

        input.close();

        item1.computeProfitOrLoss();
        item2.computeProfitOrLoss();
    }
}
