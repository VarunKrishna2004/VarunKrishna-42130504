package bankingsystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import bankingsystem.BankAccount;

	public class BankingSystem {
	    private static Map<Integer, BankAccount> accounts = new HashMap<>();
	    private static int nextAccountNumber = 1000; // Starting account number

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nWelcome to the Banking System");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. View Transaction History");
            System.out.println("6. Exit");

            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    createAccount(scanner);
                    break;
                case 2:
                    performTransaction(scanner, "deposit");
                    break;
                case 3:
                    performTransaction(scanner, "withdraw");
                    break;
                case 4:
                    checkBalance(scanner);
                    break;
                case 5:
                    viewTransactionHistory(scanner);
                    break;
                case 6:
                    System.out.println("Thank you for using the Banking System.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void createAccount(Scanner scanner) {
        System.out.print("Enter account holder name: ");
        scanner.nextLine(); // Consume newline
        String name = scanner.nextLine();

        int accountNumber = nextAccountNumber++;
        BankAccount account = new BankAccount(accountNumber, name);
        accounts.put(accountNumber, account);
        System.out.println("Account created successfully. Account number: " + accountNumber);
    }

	    private static void performTransaction(Scanner scanner, String type) {
	        System.out.print("Enter account number: ");
	        int accountNumber = scanner.nextInt();

	        BankAccount account = accounts.get(accountNumber);
	        if (account == null) {
	            System.out.println("Account not found.");
	            return;
	        }

	        System.out.print("Enter amount: ");
	        double amount = scanner.nextDouble();

	        if (type.equals("deposit")) {
	            account.deposit(amount);
	        } else if (type.equals("withdraw")) {
	            account.withdraw(amount);
	        }
	    }

	    private static void checkBalance(Scanner scanner) {
	        System.out.print("Enter account number: ");
	        int accountNumber = scanner.nextInt();

	        BankAccount account = accounts.get(accountNumber);
	        if (account == null) {
	            System.out.println("Account not found.");
	            return;
	        }

	        account.viewBalance();
	    }

	    private static void viewTransactionHistory(Scanner scanner) {
	        System.out.print("Enter account number: ");
	        int accountNumber = scanner.nextInt();

	        BankAccount account = accounts.get(accountNumber);
	        if (account == null) {
	            System.out.println("Account not found.");
	            return;
	        }

	        account.viewTransactionHistory();
	    }
	}