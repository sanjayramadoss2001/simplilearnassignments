package com.assignment.shop;

public class Test {
	public static void main(String[] args) {
		ProductDetails details = new ProductDetails(1128323, "Oreo", 30);
		
		Operations operation = new Operations();
		
		operation.showDetails(details);
		
		operation.buyProduct(details, 300);
	}
}
