package com.assignment.collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class mapTest {
	public static void main(String[] args) {
		
		Map<Integer, mapList> list = new LinkedHashMap<Integer, mapList>();
		
		list.put(713318, new mapList("Sam", 713318));
		list.put(713319, new mapList("Ram", 713319));
		list.put(713320, new mapList("John", 713320));
		
		System.out.println(list);
		System.out.println(list.get(713319));
		
		System.out.println("-------------------------------------------------");
		
		for(Map.Entry<Integer, mapList> entry : list.entrySet()) {
			System.out.println(entry);
		}
			
		
		
	}
}
