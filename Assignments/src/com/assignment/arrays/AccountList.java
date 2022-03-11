package com.assignment.arrays;

public class AccountList {
	public static void main(String[] args) {	
	AccountDetails[] details = new AccountDetails[3];
		details[0] = new AccountDetails("Antony" , 297654, 54000.00);
		details[1] = new AccountDetails("Brutus" , 297678, 100000.00);
		details[2] = new AccountDetails("Caesar" , 297694, 54000.00);
		
		System.out.println(details[2]);
		
		for(int i=0; i<details.length; i++) {
			System.out.println(details[i]);
		}
}
}
