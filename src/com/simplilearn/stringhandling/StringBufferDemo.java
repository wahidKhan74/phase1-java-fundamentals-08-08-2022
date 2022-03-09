package com.simplilearn.stringhandling;

public class StringBufferDemo {

	public static void main(String[] args) {

		// StringBuffer is allow to create a mutable string.
		// String buffer tread safe.
		
		
		StringBuffer message = new StringBuffer("Today is a good day!");

		System.out.println(message);

		// string modification
		message.append(" Happy learning !");
		System.out.println(message);

		// replace text
		message.replace(0, 1, "t");
		System.out.println(message);

		// delete text
		message.delete(0, 2);
		System.out.println(message);

		// insert text
		message.insert(0, "Welcome, ");
		System.out.println(message);
	}

}
