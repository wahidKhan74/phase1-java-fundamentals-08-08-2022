package com.simplilearn.typecasting;

public class ExplicitTypeCastingDemo {
	
	// Explicit type cast : When type are not compatible,& type conversion does not happen
	// automatically
	/**
	 * Narrowing : Converts data of incompatible type Convert data from higher range
	 * value to lower range value. double => float => long => int => short => byte.
	 */
	
	public static void main(String[] args) {
		
		double price = 122.5656;
		
		long bigPrice = (long) price; // Narrowing => double -> long
		
		int intPrice = (int) price;
		
		short shortPrice = (short) bigPrice;
		
		byte bytePrice = (byte) price;
		
		System.out.println("Double Price : "+price);
		System.out.println("Long Price : "+bigPrice);
		System.out.println("Integer Price : "+intPrice);
		System.out.println("Short Price : "+shortPrice);
		System.out.println("Byte Price : "+bytePrice);
		
	}
	
}
