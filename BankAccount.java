package oop_practice.BankingAccountSystem;

public class BankAccount {
		private String ownerName;
		private String accountNumber;

		private double balance;

	public BankAccount(String ownerName, String accountNumber) {
		this.ownerName = ownerName;
		this.accountNumber = accountNumber;
	}

	// Getters
	public String getOwnerName() {
		return ownerName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	// Setter
	public void setOwnerName(String ownerName) {
		if (ownerName != null && !ownerName.isEmpty()) {
			this.ownerName = ownerName;
		}	
	}

	// Add deposit in balance
	public void deposit(double amount) {
		if (amount > 0) {
			balance = balance + amount;
		} else {
			System.err.println("Invalid amount!");
		}
	}

	// Reduce deposit in balance
	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance = balance - amount;
		} else {
			System.err.println("Error: Insufficient funds on the balance");
		}
	}
}
