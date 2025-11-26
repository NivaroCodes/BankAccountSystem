package oop_practice.BankingAccountSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Welcome page
        System.out.println("Welcome to the bank!!"); 

        // Create an account
        BankAccount account = new BankAccount("Nivaro", "8888");

      	// Scanner for user input
        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        while (running) {
            // Menu
            System.out.println("\n=== Menu ===");
            System.out.println("1. Show balance");
            System.out.println("2. Add money");
            System.out.println("3. Take money");
            System.out.println("4. Exit");
            System.out.print("Choose action: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your balance: " + account.getBalance());
                    break;
                case 2:
                    System.out.print("Enter money to add: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter money to take: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Wrong choice. Try again.");
            }
        }

        scanner.close();
    }
}
