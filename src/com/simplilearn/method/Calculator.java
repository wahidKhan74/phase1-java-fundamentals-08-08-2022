package com.simplilearn.method;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		CalcOpr calcopr = new CalcOpr();

		// step 1. collect input from user console.
		Scanner input = new Scanner(System.in);
		System.out.println("-----------------------------------");
		System.out.println(" :: Welcome to Arithmatic Calculator :: ");
		System.out.println(CalcOpr.calcName);
		System.out.println("-----------------------------------");

		System.out.println(" :: Enter a number 1 vaule :: ");
		int x = input.nextInt();

		System.out.println(" :: Enter a number 2 vaule :: ");
		int y = input.nextInt();

		float result1 = calcopr.add(x, y);
		System.out.println("The addition is : " + result1);
		
		float result2 = calcopr.sub(x, y);
		System.out.println("The subtraction is : " + result2);
		
		float result3 = calcopr.mul(x, y);
		System.out.println("The multiplication is : " + result3);	
		
		float result4 = CalcOpr.div(x, y);
		System.out.println("The division is : " + result4);
		
		double result5 = CalcOpr.avg(x, y);
		System.out.println("The average is : " + result5);
	}

}

class CalcOpr {

	public static String calcName ="BaseCalculous";
	
	// addition
	public float add(int num1, int num2) {
		return num1 + num2;
	}

	// subtraction
	public short sub(int num1, int num2) {
		return (short) (num1 - num2);
	}

	// multiplication
	public float mul(int num1, int num2) {
		return num1 * num2;
	}

	// division
	public static float div(int num1, int num2) {
		return num1 / num2;
	}

	// average
	public static double avg(int num1, int num2) {
		return (num1 + num2) / 2;
	}
}