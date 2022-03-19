package com.assignments.filehandling;

public class BankOperation {
		
	public String BankName = "Indian Bank";
	
	public void showBalance(Account acc) {
		if(acc != null) {
			System.out.println("Available Balance : " + acc.balance);
		}
	}
	
	public double deposit(Account acc, double amount) {
		System.out.println("Balance Before Deposit : " + acc.balance);
		if(amount>0) {
			acc.balance += amount;
			System.out.println("Amount Deposited Successfully");
			System.out.println("Balance After Deposit : " + acc.balance);
			return acc.balance;
			
		}else {
			System.out.println("Invalid Deposit Amount");
		}
		
		return 0;
	}
	
	public void withdraw(Account acc, double amount) {
		System.out.println("Balance Before Withdraw : " + acc.balance);
		if(amount>0) {
			System.out.println("Amount Withdraw Successfully");
			acc.balance -= amount;
			System.out.println("Balance Before Withdraw : " + acc.balance);
		}else {
			System.out.println("Enter valid Amount to Withdraw");
		}
		
		}
}
