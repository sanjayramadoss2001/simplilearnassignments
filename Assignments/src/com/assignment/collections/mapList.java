package com.assignment.collections;

public class mapList {
		public String Name;
		public int RollNum;
		
		public mapList(String Name, int RollNum){
			this.Name = Name;
			this.RollNum = RollNum;
		}
		
		
		public String toString() {
			return "[Student Name : " + Name + ", Roll Number :" + RollNum + "]";
		}
}
