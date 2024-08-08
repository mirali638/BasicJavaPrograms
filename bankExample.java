class BankAccount {
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0; // Initial balance is zero
    }

    // Method to open an account
    public void openAccount() {
        System.out.println("Account opened successfully.");
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Method to check balance
    public double checkBalance() {
        return balance;
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

class SavingAccount extends BankAccount {
    private double interestRate;

    // Constructor
    public SavingAccount(String accountNumber, double interestRate) {
        super(accountNumber);
        this.interestRate = interestRate;
    }

    // Method to calculate interest
    public double calculateInterest() {
        double interest = super.checkBalance() * interestRate / 100;
        System.out.println("Interest calculated: " + interest);
        return interest;
    }
}

class FixedDepositAccount extends BankAccount {
    private int tenure;
    private double interestRate;

    // Constructor
    public FixedDepositAccount(String accountNumber, int tenure, double interestRate) {
        super(accountNumber);
        this.tenure = tenure;
        this.interestRate = interestRate;
    }

    // Method to calculate interest
    public double calculateInterest() {
        double interest = super.checkBalance() * interestRate * tenure / 100;
        System.out.println("Interest calculated: " + interest);
        return interest;
    }
}

public class bank {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount("SA12345", 3.5);
        savingAccount.openAccount();
        savingAccount.deposit(1000);
        System.out.println("Balance: " + savingAccount.checkBalance());
        savingAccount.calculateInterest();

        System.out.println();

        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount("FDA98765", 2, 5.0);
        fixedDepositAccount.openAccount();
        fixedDepositAccount.deposit(5000);
        System.out.println("Balance: " + fixedDepositAccount.checkBalance());
        fixedDepositAccount.calculateInterest();
    }
}
