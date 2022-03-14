package com.simplilearn.exception.handling;


public class ThrowExceptionDemo {

	public static void main(String[] args) {
		
		// throw :: throw keyword is used to throw an exception.
		
		ageValidator(30);
		try {
			ageValidator(10);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		ageValidator(100);
		
		System.out.println("----------");
		try {
			usernameValidator("John Smith");
			// usernameValidator("");
			usernameValidator(null);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static void ageValidator(int age) {
		if(age>18) {
			System.out.println("Your age "+age+"is a valid age, You can vote !");
		}else {
			throw new RuntimeException("Your age "+age+" is invalid to vote.");
		}
	}
	
	private static void usernameValidator(String username) throws Exception {
		if(username!=null && username.length() >0) {
			System.out.println("Valid username : "+username);
		} else {
			throw new Exception("Your username "+username+" is invalid username.");
		}
	}

}
