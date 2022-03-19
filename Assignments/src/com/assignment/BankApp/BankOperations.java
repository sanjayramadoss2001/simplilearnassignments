package com.assignment.BankApp;

public class BankOperations {
		
	public double showBalance(Details details) {
		if(details != null) {
			return details.AccountBalance;
		}else {
			return 0;
		}
	}
	
	public void deposit(double amount, Details details) {
		if(amount > 0) {
			details.AccountBalance += amount;
			System.out.println("Deposit Completed Successfully!");
		}else {
			System.out.println("Please Enter Valid Amount to Deposit");
		}
	}
	public void withdraw(double amount, Details details) {
		if(amount>0) {
			details.AccountBalance -= amount;
			System.out.println("Withdraw completed successfull");
		}else {
			System.out.println("Invalid Amount to Withdraw");
		}
	}
	}
