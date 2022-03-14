package com.assignment.collections;

public class EventSet {
		int id;
		String Name;
		String StartDate;
		String CreateDate;
		String eventType;
		public EventSet(int id, String name, String startDate, String createDate, String eventType) {
			this.id = id;
			Name = name;
			StartDate = startDate;
			CreateDate = createDate;
			this.eventType = eventType;
		}
		
		public String toString() {
			return "ID : " + id + ", Name : " + Name + ", Start Date : " + StartDate + ", Create Date : " + CreateDate + ", Event Type : " + eventType ;
		}
}
