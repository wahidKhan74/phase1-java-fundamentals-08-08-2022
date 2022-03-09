package com.simplilearn.innerclass;

public class OuterTest2 {

	// data variables
	private static double amount = 45456.567;
	public static String message ="Today is a good day!";
	
	// static inner class
	static class InnerTest {
		
		private String data ="Hello & Welcome ";
		
		public void showData() {
			System.out.println("Outer class data "+amount);
			System.out.println("Outer class data "+message);
			System.out.println("Inner class data "+data);
		}
	}
	
	public static void main(String[] args) {
		//create  inner class object from outer class object
		InnerTest inner = new OuterTest2.InnerTest();
		
		inner.showData();
	}
	
}
