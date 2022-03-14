package com.assignment.collections;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
public class EventQueueTest {
	public static void main(String[] args) {
			
		Set<EventQueue> list = new HashSet<EventQueue>(); 
		
		list.add(new EventQueue(24532, "01/03/2022", "15/03/2022", "25/02/2022", "Sports Day"));
		list.add(new EventQueue(24533, "01/03/2022", "15/03/2022", "25/02/2022", "Martial Arts Event"));
		list.add(new EventQueue(24534, "01/03/2022", "15/03/2022", "25/02/2022", "Annual Day"));
		
		System.out.println(list);
		
		Iterator<EventQueue> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("-------------------------------------------------------------------------------------------");
		
		for (EventQueue event : list) {
			System.out.println(event);
		}
	}
}
