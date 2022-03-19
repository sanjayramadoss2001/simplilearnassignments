package com.assignments.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class BankTest {
	public static void main(String[] args) {
		Process();
	}

	// Test Operations
	private static void Process() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username : ");
		String UserName = sc.nextLine();
		Account account = new Account(55143216, UserName, 5000.00);
		BankOperation operation = new BankOperation();

		// To Create File as User Name
		String FileExtension = ".txt";
		File file2 = new File("C:\\Users\\sanja\\eclipse-workspace\\Assignments\\bank\\" + UserName + FileExtension);
		try {
			boolean response2 = file2.createNewFile();
			if (response2) {
				System.out.println("Login Successfully");
			} else if (!response2) {
				System.out.println("User Already Exists");
			}
		} catch (Exception e) {
			System.out.println(e.getClass());
			System.out.println(e.getMessage());
		}
		try {
			PrintWriter save = new PrintWriter(file2);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}

		// Writing Operatios in File
		try {
			PrintWriter save = new PrintWriter(file2);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}

		while (true) {
			System.out.println("Hello " + UserName + "\n"
					+ " Enter 1 to see Available Balance\n Enter 2 to Deposit Amount\n Enter 3 to Withdraw Amount\n Enter 4 to Exit");
			int option = sc.nextInt();

			switch (option) {

			case 1:
				operation.showBalance(account);
				try {
					PrintWriter save = new PrintWriter(file2);
					save.append(UserName + " Checked Balance \n" + "Available Balance : " + account.balance + "\n");
					
				} catch (Exception e) {
					System.out.println(e.getClass());
					System.out.println(e.getMessage());
				}
				break;

			case 2:
				try {
					PrintWriter save = new PrintWriter(file2);
					save.append("Before Deposit : " + account.balance + "\n");
					
				} catch (Exception e) {
					System.out.println(e.getClass());
					System.out.println(e.getMessage());
				}
				System.out.println("Enter Amount to Deposit : ");
				double depositAmount = sc.nextDouble();
				operation.deposit(account, depositAmount);
				try {
					PrintWriter save = new PrintWriter(file2);
					save.append("After Deposit : " + account.balance + "\n");
					
				} catch (Exception e) {
					System.out.println(e.getClass());
					System.out.println(e.getMessage());
				}
				break;

			case 3:
				try {
					PrintWriter save = new PrintWriter(file2);
					save.append("Balance Before Withdraw : " + account.balance + "\n");

				} catch (Exception e) {
					System.out.println(e.getClass());
					System.out.println(e.getMessage());
				}
				System.out.println("Enter Amount to Withdraw : ");
				double withdrawAmount = sc.nextDouble();
				operation.withdraw(account, withdrawAmount);
				try {
					PrintWriter save = new PrintWriter(file2);
					save.append("Balance After withdraw : " + account.balance + "\n");
					save.close();
				} catch (Exception e) {
					System.out.println(e.getClass());
					System.out.println(e.getMessage());
				}
				break;

			case 4:
				break;
			default:
				System.out.println("Wrong Choice, Select Correct Option");
			}
		}
	}

}
