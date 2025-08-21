package assignment4;

public class BankingSystemDemo {
    public static void main(String[] args) {
        // Create accounts
        Account savings = new SavingsAccount("S001", 1000);
        Account checking = new CheckingAccount("C001", 500);

        // Display total accounts using static method
        System.out.println("Total Bank Accounts Created: " + Bank.getTotlaAccounts());

        // Perform transactions
        Transaction transaction = new Transaction();
        savings.displayAccountInfo();
        transaction.performTransaction(savings, 200, "deposit");

        checking.displayAccountInfo();
        transaction.performTransaction(checking, 300, "withdraw");

        // Final Balances
        System.out.println("\nFinal Balances:");
        savings.displayAccountInfo();
        checking.displayAccountInfo();
    }
}