package com.simplilearn.exception.handling;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		strLengthCalculator("John Smith");
		strLengthCalculator(null);
		strLengthCalculator("Aria Stark");
		
		System.out.println("--------------");
		transaction(30);
		transaction(0);
		transaction(100);
		
		System.out.println("--------------");
		numberConvertor("56567");
		numberConvertor("565abc");
		numberConvertor("121");
		numberConvertor("67567");
	}

	private static void strLengthCalculator(String str) {
		try {
			int length = str.length();
			System.out.println("String length : "+ length);
		} catch (NullPointerException e) {
			System.out.println("Exception Occures : " + e.getClass());
			System.out.println("Exception Message : " + e.getMessage());
		}
	}
	
	private static void transaction(int amount) {
		try {
			int balance =3000;
			int result = balance / amount;
			System.out.println(" Result Amount :> " + result);
		} catch (ArithmeticException e) {
			System.out.println("Exception Occures : " + e.getClass());
			System.out.println("Exception Message : " + e.getMessage());
		}
		
	}
	
	private static void numberConvertor(String input) {
		try {
			int result = Integer.parseInt(input);
			System.out.println(" Integer Amount :> " + result);
		} catch (NumberFormatException e) {
			System.out.println("Exception Occures : " + e.getClass());
			System.out.println("Exception Message : " + e.getMessage());
		}
	}
}
