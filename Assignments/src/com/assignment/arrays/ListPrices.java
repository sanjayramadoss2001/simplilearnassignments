package com.assignment.arrays;
import java.util.Arrays;
public class ListPrices {
	
	public static void main(String[] args) {
		
		PriceList[] list = new PriceList[5];
		list[0] = new PriceList("Oreo", 30);
		list[1] = new PriceList("Dairy Milk", 40);
		list[2] = new PriceList("GoneMad", 5);
		list[3] = new PriceList("Munch", 10);
		list[4] = new PriceList("Kit Kat", 20);
		
		System.out.println(Arrays.toString(list));
		System.out.println(list[1]);
		
		for(int i=0; i<list.length; i++) {
			System.out.println("The Product Details = " + list[i] );
		}
}
}