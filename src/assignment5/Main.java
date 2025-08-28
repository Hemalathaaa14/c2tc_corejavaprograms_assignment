package assignment5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt for booking details
        System.out.println("Enter booking details (Format: StageEvent,Customer,NoOfSeats):");
        String bookingDetails = sc.nextLine();
        String[] parts = bookingDetails.split(",");
        TicketBook tb = new TicketBook(parts[0], parts[1], Integer.parseInt(parts[2]));

        // Prompt for payment mode
        System.out.println("Enter Payment Mode: 1.Cash  2.Wallet  3.Card");
        int mode = sc.nextInt();
        sc.nextLine(); // consume newline

        // Print booking details
        System.out.println("Stage event:" + tb.getStageEvent());
        System.out.println("Customer:" + tb.getCustomer());
        System.out.println("Number of seats:" + tb.getNoOfSeats());

        // Payment processing
        switch (mode) {
            case 1:
                System.out.println("Enter cash amount:");
                int cashAmount = sc.nextInt();
                tb.payment(cashAmount);
                break;

            case 2:
                System.out.println("Enter wallet amount:");
                int walletAmount = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter wallet number:");
                String walletNo = sc.nextLine();
                tb.payment(walletAmount, walletNo);
                break;

            case 3:
                System.out.println("Enter card holder name:");
                String holderName = sc.nextLine();
                System.out.println("Enter amount:");
                int cardAmount = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter card type (Credit/Debit):");
                String cardType = sc.nextLine();
                System.out.println("Enter CCV:");
                String ccv = sc.nextLine();
                tb.payment(holderName, cardAmount, cardType, ccv);
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}