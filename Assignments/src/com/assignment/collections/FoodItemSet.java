package com.assignment.collections;

public class FoodItemSet {
	int id;
	String name;
	double price;
	
public FoodItemSet(int id, String name, double price) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
}	
public String toString() {
return "Product Id : " + id + ", Product Name : " + name + ", Product Price : " + price;
}
}
