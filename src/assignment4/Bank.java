package assignment4;

public class Bank {
    private static int totalAccounts = 0;

    public static void incrementTotalAccounts() {
        totalAccounts++;
    }

    public static int getTotlaAccounts() {
        return totalAccounts;
    }
}