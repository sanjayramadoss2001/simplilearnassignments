package com.assignment.BankApp;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Details details = new Details(5243546923l, "Sanjay", 50000.00);
		BankOperations operation = new BankOperations();
		
		System.out.println("***********Welcome to " + details.BankName + "***********\n");
		System.out.println("Select an option\n 1.Show Balance\n 2.Deposit Money\n 3.Withdraw\n 4.Exit" );
	
		while(true) {
			int option = sc.nextInt();
			if(option==1) {
				System.out.println("Your Balance is : " + operation.showBalance(details));
				//break;
			}
			
			if(option==2) {
				System.out.println("Enter The Amount to Deposit: ");
				int deposit = sc.nextInt();
				operation.deposit(deposit, details);
				System.out.println("Amount after Deposit : " + operation.showBalance(details));
				//break;
			}
			if(option==3) {
				System.out.println("Enter The Amount to Withdraw: ");
				int deposit = sc.nextInt();
				operation.withdraw(deposit, details);
				System.out.println("Amount after Withdraw : " + operation.showBalance(details));
				//break;
			}
			if(option ==4) {
				System.out.println("Thankyou For Visiting Our Bank Application...\n Hope you visit again");
				break;
			}
			else if (option >4){
				System.out.println("Enter Valid Option");
			}
		}
		}
		}
	
