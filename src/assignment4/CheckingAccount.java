package assignment4;

public class CheckingAccount extends Account {
    private static final double TRANSACTION_FEE = 10.0;

    public CheckingAccount(String accNo, double balance) {
        super(accNo, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= (amount + TRANSACTION_FEE)) {
            balance -= (amount + TRANSACTION_FEE);
            System.out.println("Withdrawn from CheckingAccount. New Balance: " + balance);
            System.out.println("Transaction completed with fee: " + TRANSACTION_FEE);
        } else {
            System.out.println("Insufficient balance in CheckingAccount.");
        }
    }
}