// A class that encapsulates data and methods
class BankAccount {
    // Private fields (data) - hidden from outside access
    private String accountHolder;
    private double balance;

    // Constructor to initialize account details
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public getter method to access private data safely
    public String getAccountHolder() {
        return accountHolder;
    }

    // Public getter for balance
    public double getBalance() {
        return balance;
    }

    // Public method to deposit money (controls how balance changes)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Public method to withdraw money (with validation)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid or insufficient funds.");
        }
    }
}

// Main class
public class Main2 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Alice", 1000.0);

        // Accessing data only through public methods
        System.out.println("Account Holder: " + acc.getAccountHolder());
        System.out.println("Initial Balance: " + acc.getBalance());

        acc.deposit(500);
        acc.withdraw(200);

        System.out.println("Final Balance: " + acc.getBalance());
    }
}
