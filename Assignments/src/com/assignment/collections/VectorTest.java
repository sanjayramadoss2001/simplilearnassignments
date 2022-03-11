package com.assignment.collections;
import java.util.Vector;
import java.util.Iterator;
public class VectorTest {
	public static void main(String[] args) {
		Vector<VectorList> vec = new Vector<VectorList>();
		
		vec.add(new VectorList(1764, "Bat", 1500.00));
		vec.add(new VectorList(1764, "Ball", 200.00));
		vec.add(new VectorList(1764, "Stump", 350.00));
		
		Iterator<VectorList> itr = vec.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("----------------------------------------------------------------");
		
		for(VectorList vtr : vec) {
			System.out.println(vtr);
		}
	}
}
