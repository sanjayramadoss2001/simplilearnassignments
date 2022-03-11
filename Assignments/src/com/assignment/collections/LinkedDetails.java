package com.assignment.collections;

public class LinkedDetails {
		String AccName;
		long AccNo;
		double AccBalance;
		
	public LinkedDetails(String accName, long accNo, double accBalance) {
		this.AccName = accName;
		this.AccNo = accNo;
		this.AccBalance = accBalance;
	}
	
	public String toString() {
		return "[Account Holder Name : " + AccName + ", Account Number : " + AccNo + ", Account Balance : " + AccBalance + "]";
	}
}
