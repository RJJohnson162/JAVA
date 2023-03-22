package Assignment_2;

import javax.swing.JOptionPane;

// BankAccount class
class BankAccount {
    protected int accountNumber;
    protected String holderName;
    protected double balance;

    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void checkBalance() {
        String message = "Account number: " + accountNumber + "\n"
                + "Holder name: " + holderName + "\n"
                + "Balance: " + balance;
        JOptionPane.showMessageDialog(null, message, "Check Balance", JOptionPane.INFORMATION_MESSAGE);
    }

    public void deposit(double amount) {
        balance += amount;
        JOptionPane.showMessageDialog(null, "Deposit successful.", "Deposit", JOptionPane.INFORMATION_MESSAGE);
    }

    public void withdraw(double amount) {
        JOptionPane.showMessageDialog(null, "Withdrawal not allowed from BankAccount.", "Withdraw", JOptionPane.WARNING_MESSAGE);
    }
}

// SavingAccount class
class SavingAccount extends BankAccount {
    private double interestRate;

    public SavingAccount(int accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        String message = String.format("Interest calculated: $%.2f\nNew balance: $%.2f", interest, balance);
        JOptionPane.showMessageDialog(null, message, "Calculate Interest", JOptionPane.INFORMATION_MESSAGE);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            String message = String.format("Withdrawal successful. Balance: $%.2f", balance);
            JOptionPane.showMessageDialog(null, message, "Withdraw", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Withdrawal not allowed. Insufficient balance.", "Withdraw", JOptionPane.WARNING_MESSAGE);
        }
    }
    
}

// CurrentAccount class
class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(int accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            JOptionPane.showMessageDialog(null, "Withdrawal successful.", "Withdraw", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Withdrawal not allowed. Exceeding overdraft limit.", "Withdraw", JOptionPane.WARNING_MESSAGE);
        }
    }
}

// Main class
public class Bank {
    public static void main(String[] args) {
        int accountNumber;
        String holderName;
        double balance, interestRate, overdraftLimit, amount;
        char accountType;

        accountNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter account number: "));
        holderName = JOptionPane.showInputDialog("Enter holder name: ");
        balance = Double.parseDouble(JOptionPane.showInputDialog("Enter balance: "));
        accountType = JOptionPane.showInputDialog("Enter account type (S for Saving, C for Current): ").charAt(0);
    
        if (accountType == 'S') {
            interestRate = Double.parseDouble(JOptionPane.showInputDialog("Enter interest rate: "));
            SavingAccount savingAccount = new SavingAccount(accountNumber, holderName, balance, interestRate);
    
            boolean continueLoop = true;
            do {
                String[] options = {"Check balance", "Deposit", "Withdraw", "Calculate interest", "Quit"};
                int choice = JOptionPane.showOptionDialog(null, "Select operation:", "Saving Account", JOptionPane.DEFAULT_OPTION,
                        JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

                switch (choice) {
                    case 0:
                        savingAccount.checkBalance();
                        break;
                    case 1:
                        amount = Double.parseDouble(JOptionPane.showInputDialog("Enter amount to deposit: "));
                        savingAccount.deposit(amount);
                        break;
                    case 2:
                        amount = Double.parseDouble(JOptionPane.showInputDialog("Enter amount to withdraw: "));
                        savingAccount.withdraw(amount);
                        break;
                    case 3:
                        savingAccount.calculateInterest();
                        break;
                    case 4:
                        continueLoop = false;
                        JOptionPane.showMessageDialog(null, "Exiting system.", "Quit", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Invalid choice.", "Error", JOptionPane.ERROR_MESSAGE);
                        break;
                }
                } while (continueLoop);

        } else if (accountType == 'C') {
            overdraftLimit = Double.parseDouble(JOptionPane.showInputDialog("Enter overdraft limit: "));
            CurrentAccount currentAccount = new CurrentAccount(accountNumber, holderName, balance, overdraftLimit);
    
            boolean quit = false;

            do {
                String[] options = {"Check balance", "Deposit", "Withdraw", "Quit"};
                int choice = JOptionPane.showOptionDialog(null, "Select operation:", "Current Account", JOptionPane.DEFAULT_OPTION,
                        JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

                switch (choice) {
                    case 0:
                        currentAccount.checkBalance();
                        break;
                    case 1:
                        amount = Double.parseDouble(JOptionPane.showInputDialog("Enter amount to deposit: "));
                        currentAccount.deposit(amount);
                        break;
                    case 2:
                        amount = Double.parseDouble(JOptionPane.showInputDialog("Enter amount to withdraw: "));
                        currentAccount.withdraw(amount);
                        break;
                    case 3:
                        quit = true;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Invalid choice.", "Error", JOptionPane.ERROR_MESSAGE);
                        break;
                }
            } while (!quit);

        } else {
            JOptionPane.showMessageDialog(null, "Invalid account type.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}