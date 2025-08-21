package assignment4;

public class SavingsAccount extends Account {

    public SavingsAccount(String accNo, double balance) {
        super(accNo, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance in SavingsAccount.");
        }
    }
}