package com.assignment.arrays;

public class ipLists {
	public static void main(String[] args) {
		IpCollection[] ip = new IpCollection[4];
		
		ip[0] = new IpCollection("192.168.1.0");
		ip[1] = new IpCollection("192.168.1.1");
		ip[2] = new IpCollection("192.168.1.2");
		ip[3] = new IpCollection("192.168.1.3");
		
		System.out.println(ip[2]);
		
		for(int i=0; i<ip.length; i++) {
			System.out.println(ip[i]);
		}
	}
}
