package com.simplilearn.array;

public class EmailArray {

	public static void main(String[] args) {

		// create empty array size as 5
		String[] emails = new String[5];

		// insert data inot array
		emails[0] = "john.smith@gmail.com";
		emails[1] = "will.smith@gmail.com";
		emails[2] = "mike.smith@gmail.com";
		
		// emails[3] = 500;

		// access datafrom array
		System.out.println("Email at index 1 : " + emails[1]);
		System.out.println("Email at index 3 : " + emails[3]);

		System.out.println("---------------------");
		// System.out.println("Email at index 5 : " + emails[5]);

		// access elements with iteration
		for (int index = 0; index < emails.length; index++) {
			System.out.println("Element at index : " + index + " value : " + emails[index]);
		}

	}

}
