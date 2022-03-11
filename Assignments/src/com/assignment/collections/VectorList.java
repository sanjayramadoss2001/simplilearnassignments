package com.assignment.collections;

public class VectorList {
		int ProductID;
		String ProductName;
		double ProductPrice;
		
		public VectorList(int ProductID, String ProductName, double ProductPrice) {
			this.ProductID = ProductID;
			this.ProductName = ProductName;
			this.ProductPrice = ProductPrice;
		}
		
		public String toString() {
			return "[Product ID : " + ProductID + ", Product Name : " + ProductName + ", Product Price : " + ProductPrice + "]";
		}
}
