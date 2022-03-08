package com.simplilearn.typecasting;

public class ImplicitTypeCastingDemo {

	public static void main(String[] args) {
	
		// Implicit Type cast : When data type are compatible, there automatically type cast
		
		/**
		 * Widening Type cast : Converts data from lower range value to higher range type.
		 * byte -> short -> int -> long  -> float -> double.
		 */
		
		byte smallCount = 100;  // 1 byte (8 bit) => -128 to 127 
		
		short shortCount = smallCount;  // Widening => byte -> short => 2 byte (16 bit) => -32768to 32767
		
		int intCount = smallCount; // Widening => byte -> int
		
		long bigCount = intCount; // Widening => int -> long
		
		float floatCount = intCount; // Widening => int -> float
		
		float floatCount2 = bigCount; // Widening => long -> float		
		
		double decimalCount = bigCount; // Widening => long -> double
		
		System.out.println("Byte Count : "+smallCount);
		System.out.println("Short Count : "+shortCount);
		System.out.println("Integer Count : "+intCount);
		System.out.println("Long Count : "+bigCount);
		System.out.println("Float Count : "+floatCount);
		System.out.println("Double Count : "+decimalCount);
	}

}
