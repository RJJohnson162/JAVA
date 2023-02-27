import javax.swing.JOptionPane;

public class App {
    /**
     * @param args
     */
    static int Valid;
    
    public static void main(String[] args){
        do{
            String FirstNumber = JOptionPane.showInputDialog("Enter the first Number");
            int number1 = Integer.parseInt(FirstNumber);
            String SecondNumber = JOptionPane.showInputDialog("Enter the second Number");
            int number2 = Integer.parseInt(SecondNumber);
            
            int sum = number1 + number2;
            double Average = (double)sum / 2;
            JOptionPane.showMessageDialog(null,"The average is: " + Average);
            JOptionPane.showConfirmDialog(null, "Do you want to continue and add another set of numbers?");
        }while(Valid ==JOptionPane.YES_OPTION);
    }
}