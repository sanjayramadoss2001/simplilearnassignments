package com.assignment.collections;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
public class FoodItemSetTest {

public static void main(String[] args) {
	Set<FoodItemSet> listset = new HashSet<FoodItemSet>();
		listset.add(new FoodItemSet(25155, "KitKat", 30.00));
		listset.add(new FoodItemSet(25155, "Dairy Milk", 50.00));
		listset.add(new FoodItemSet(25155, "Munch", 10.00));
	
		System.out.println(listset);
		
		Iterator<FoodItemSet> itr = listset.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("--------------------------------------------------------------------");
		
		for(FoodItemSet fdset : listset) {
			System.out.println(fdset);
		}
}
}
