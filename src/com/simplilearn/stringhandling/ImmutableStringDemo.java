package com.simplilearn.stringhandling;

public class ImmutableStringDemo {

	public static void main(String[] args) {
		// In java, string objects are immutable.
		// Immutable simply means unmodifiable or non changeable values.
				
		String username = "John";
		
		// concat() -> update the string
		String response = username.concat(" Smith");
		
		System.out.println(username);  // old name -> old string 
		
		System.out.println(response);  // new name  -> new String
	}

}
