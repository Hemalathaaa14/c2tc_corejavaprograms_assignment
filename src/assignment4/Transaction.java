package assignment4;

public class Transaction {

    public void performTransaction(Account account, double amount, String type) {
        System.out.println("\nTransaction started...");
        if (type.equalsIgnoreCase("deposit")) {
            account.deposit(amount);
        } else if (type.equalsIgnoreCase("withdraw")) {
            account.withdraw(amount);
        }
    }
}