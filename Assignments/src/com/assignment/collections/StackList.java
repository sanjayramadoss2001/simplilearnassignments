package com.assignment.collections;
import java.util.Stack;
import java.util.Iterator;
public class StackList {
	public static void main(String[] args) {
		
		Stack<String> stck = new Stack<String>();
		
		stck.add("PUBG");
		stck.add("CS:GO");
		stck.add("Valorant");
		stck.add("Fortnite");
		
		System.out.println(stck);
		System.out.println(stck.get(0));
		
		Iterator<String> itr = stck.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		for (int i =0; i<stck.size(); i++) {
			System.out.println("Game : " + stck.get(i));
		}
		
		for (String str : stck) {
			System.out.println(str);
		}
		
	}

}
