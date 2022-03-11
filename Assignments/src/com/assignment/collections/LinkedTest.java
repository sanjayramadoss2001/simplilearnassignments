package com.assignment.collections;
import java.util.Iterator;
import java.util.LinkedList;
public class LinkedTest {

	public static void main(String[] args) {
		LinkedList<LinkedDetails> details = new LinkedList<LinkedDetails>();
		
		details.add(new LinkedDetails("Sam", 87342233, 54000.00));
		details.add(new LinkedDetails("Ram", 87346483, 64000.00));
		details.add(new LinkedDetails("Smith", 87345373, 58000.00));
		
		Iterator<LinkedDetails> itr = details.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
