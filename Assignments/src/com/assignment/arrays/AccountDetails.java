package com.assignment.arrays;

public class AccountDetails {
		String HolderName;
		int AccountNo;
		double Balance;
		
		public AccountDetails(String HolderName, int AccountNo, double Balance){
			this.HolderName = HolderName;
			this.AccountNo = AccountNo;
			this.Balance = Balance;
		}
		
		public String toString() {
			return "[ Account Holder Name : " + HolderName + ", Account Number " + AccountNo + ", Account Balance : " + Balance + " ]";
		}
}
