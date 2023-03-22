package Assignment_2;
import javax.swing.JOptionPane;

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
            JOptionPane.showMessageDialog(null, "Profit made: $" + profit);
        } else if (profit < 0) {
            JOptionPane.showMessageDialog(null, "Loss made: $" + (-profit));
        } else {
            JOptionPane.showMessageDialog(null, "No profit or loss made");
        }
    }

    public static void main(String[] args) {
        String input;
        double buyingPrice, sellingPrice, transportCost;

        input = JOptionPane.showInputDialog("Enter buying price for item 1:");
        buyingPrice = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("Enter selling price for item 1:");
        sellingPrice = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("Enter transport cost for item 1:");
        transportCost = Double.parseDouble(input);

        Business item1 = new Business(buyingPrice, sellingPrice, transportCost);

        input = JOptionPane.showInputDialog("Enter buying price for item 2:");
        buyingPrice = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("Enter selling price for item 2:");
        sellingPrice = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("Enter transport cost for item 2:");
        transportCost = Double.parseDouble(input);

        Business item2 = new Business(buyingPrice, sellingPrice, transportCost);

        item1.computeProfitOrLoss();
        item2.computeProfitOrLoss();
    }
}
