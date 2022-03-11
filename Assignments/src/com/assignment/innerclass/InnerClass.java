package com.assignment.innerclass;

public class InnerClass {
	
	private String status1 = "pass";
	private String status2 = "fail";
	
	class Finance {
		private static String str = "Finance License Applied";
		public void showFinance() {
			System.out.println("Finance Status : " + str);
			if(str.contains("Applied")) {
				System.out.println(status1);
			}else if (str.contains("Not Applied")) {
				System.out.println(status2);
			}
		}
	}
	
	class Lockers {
		private static String str1 = "Locker are Locked";
		public void showLocker() {
			System.out.println("Locker Status : " + str1);
			if(str1.contains("Locked")) {
				System.out.println(status1);
			}else if (str1.contains("Not Locked")){
				System.out.println(status2);
			}
		}
		
	}
	
	class Banking {
		private static String str3 = "Online Banking Enabled";
		public void showBanking() {
			System.out.println("Banking Status : " + str3);
			if(str3.contains("Enabled")) {
				System.out.println(status1);
			}else if (str3.contains("Not Enabled")) {
				System.out.println(status2);
			}
		}
	}
	
	class Insurance  {
		private static String str4 = "You're Eligible for Insurance";
		public void showInsurance() {
			System.out.println("Insurance Status : " + str4);
			if(str4.contains("Eligible")) {
				System.out.println(status1);
			}else if(str4.contains("Not Eligible")) {
				System.out.println(status2);
			}
		}
	}
	
	public static void main(String[] args) {
		InnerClass inner = new InnerClass();
		Finance finance = inner.new Finance();
		Lockers locker = inner.new Lockers();
		Banking banking = inner.new Banking();
		Insurance insurance = inner.new Insurance();
		
		finance.showFinance();
		locker.showLocker();
		banking.showBanking();
		insurance.showInsurance();
		
	}
}

