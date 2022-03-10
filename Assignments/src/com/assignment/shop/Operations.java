package com.assignment.shop;

public class Operations {
	public void showDetails(ProductDetails details) {
		System.out.println("Product Id : " + details.ProductId);
		System.out.println("Product name : " + details.ProductName);
		System.out.println("Product name : " + details.ProductPrice);
		System.out.println();
	}
	
	public void buyProduct(ProductDetails details, int customerPay) {
		if(customerPay >= details.ProductPrice) {
			double balance = customerPay - details.ProductPrice;
			System.out.println("Product Brought Successfully");
			System.out.println("Your Remaining Balance : " + balance);
		}else {
			System.out.println("Invalid amount to buy the product");
		}
	}
}
