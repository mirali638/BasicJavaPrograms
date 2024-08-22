class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
class Account {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: Rs " + amount);
    }
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Not Sufficient Fund. You try to withdraw Rs "+ amount +" and current balance is Rs "+balance);
        }
        balance -= amount;
        System.out.println("Withdrawn: Rs " + amount);
    }
    public double getBalance() {
        return balance;
    }
}
public class pr6_3 {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(1000.00);
        try {
            account.withdraw(400.00);
            account.withdraw(300.00);
            account.withdraw(500.00); 
        } catch (InsufficientFundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
