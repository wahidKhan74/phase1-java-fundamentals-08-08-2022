package com.simplilearn.accessmodifier;

import com.simplilearn.typecasting.Student;

public class DefaultAccessModifierDemo {

	public static void main(String[] args) {
		
		Brother brother = new Brother();
		
		System.out.println("Money :: "+brother.money);
		System.out.println("Clothes :: "+brother.clothes);
		
		brother.showAll();
		
		Student student = new Student();
		// student.id;  // compile time error
		// student.name; // compile time error
		// student.marks;  // compile time error
		
		// student.showStatus(); // compile time error
	}

}


class Brother {
	
	// default variable 
	double money = 547567.678;
	String clothes = "XYZ";
	
	// default method 
	void showAll() {
		System.out.println("The Money :: "+money + " Clothes :: " +clothes);
	}
	
}