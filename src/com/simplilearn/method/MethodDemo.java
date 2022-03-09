package com.simplilearn.method;

public class MethodDemo {

	public static void main(String[] args) {
		
		MethodDemo demo = new MethodDemo();
		
		// method deceleration
//		demo.showMessage();
//		
//		demo.displayAuthor("John Smith");
//		
//		demo.ageCalculator(1995);
		
		demo.retirementCalc("Jon Snow", 1990);
		
		demo.retirementCalc("Marry James", 1890);
	}
	
	// user defined methods
	 // 1. non parameterized method
	 // 2. parameterized method
	
	// methods deceleration
	// non parameterized method
	public void showMessage() {
		System.out.println("Welcome to java methods");
	}
	
	
	// one parameterized methods
	public void displayAuthor(String author) {
		System.out.println("The Author : "+author);
	}
	
	public int ageCalculator(int yearOfBirth) {
		int age = 2022 - yearOfBirth;
		System.out.println("The user age is : "+age);
		return age;
	}
	
	// two parameterized methods
	public void retirementCalc(String username, int yearOfBirth) {
		int age = ageCalculator(yearOfBirth);
		if(age>60) {
			System.out.println("Hi , "+username +" you are already retired.");
		} else {
			System.out.println("Hi , "+username 
					+" you have "+(60-age) +" year for retirement.");
		}
	}
	
}
