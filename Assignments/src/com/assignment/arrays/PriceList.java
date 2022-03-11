package com.assignment.arrays;

public class PriceList {
		String ProductName;
		float Price;
		
		public PriceList(String ProductName, float Price) {
			this.ProductName = ProductName;
			this.Price = Price;
		}
		@Override
		public String toString() {
			return "[ Product Name : " + ProductName + " ; Product Price : " + Price + " ]";
			}
}
