package com.program;

import java.util.Scanner;

class ATMSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize account balance
        double accountBalance = 1000.0;

        // Loop until user quits
        while (true) {
            // Display main menu
            System.out.println("1. Check balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Quit");

            // Get user input
            int choice = scanner.nextInt();

            // Handle user choice
            switch (choice) {
                case 1:
                    // Check balance
                    System.out.println("Your current balance is $" + accountBalance);
                    break;
                case 2:
                    // Deposit
                    System.out.print("Enter amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    accountBalance += depositAmount;
                    System.out.println("Deposit successful. Your new balance is $" + accountBalance);
                    break;
                case 3:
                    // Withdraw
                    System.out.print("Enter amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > accountBalance) {
                        System.out.println("Insufficient funds. Withdrawal cancelled.");
                    } else {
                        accountBalance -= withdrawAmount;
                        System.out.println("Withdrawal successful. Your new balance is $" + accountBalance);
                    }
                    break;
                case 4:
                    // Quit
                    System.out.println("Thank you for using our ATM system.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
