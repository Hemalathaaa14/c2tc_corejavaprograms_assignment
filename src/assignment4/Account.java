package assignment4;
public abstract class Account {
    protected String accNo;
    protected double balance;

    public Account(String accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
        Bank.incrementTotalAccounts();
    }

    public String getAccNo() {
        return accNo;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public abstract void withdraw(double amount);

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accNo);
        System.out.println("Balance: " + balance);
    }
}