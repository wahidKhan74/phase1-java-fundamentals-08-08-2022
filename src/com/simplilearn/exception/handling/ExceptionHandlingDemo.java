package com.simplilearn.exception.handling;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		System.out.println("Program started ...");
		try {
			int balance = 56567;
			int amount = 60;
			int result = balance / amount;
			System.out.println("Result Avg Balance fator :"+result);
		} catch (Exception e) {
			System.out.println("Exception Occured and handled "+e.getClass());
		} finally {
			System.out.println("Aways running !");
		}
		
		System.out.println("Program is Terminated !");
	}

}
