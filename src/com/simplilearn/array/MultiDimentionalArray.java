package com.simplilearn.array;

import java.util.Arrays;

public class MultiDimentionalArray {

	public static void main(String[] args) {
		
		int[][] numbers = { {2,4,6,8,10}, {3,5,9,11,13} };
		
		// numbers[0][3]= 300;
		
		System.out.println(Arrays.toString(numbers[0]));
		System.out.println(Arrays.toString(numbers[1]));
		
		
		System.out.println("---------------------");
		
		for (int row = 0; row < numbers.length; row++) {
			System.out.println(Arrays.toString(numbers[row]));
			for (int col = 0; col < numbers[row].length; col++) {
				System.out.println("[ "+row +","+col +"]  : "+ numbers[row][col]);
			}
		}

	}

}
