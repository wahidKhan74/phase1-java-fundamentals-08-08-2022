package com.simplilearn.array;

import java.util.Arrays;

public class EmployeeArray {

	public static void main(String[] args) {
		
		// create employee array
		Employee [] empList = new Employee[5];
		
		// insert data into employee arra
		empList[0] = new Employee(1001, "John", "Engineering", 546567.67);; 
		empList[1] = new Employee(1002, "Mike", "Dev", 946567.67);
		empList[2] = new Employee(1003, "Will", "HR", 16567.67);
		
		 System.out.println(Arrays.toString(empList));
		 
		 System.out.println(empList[1]);
		 System.out.println(empList[4]);
	}

}
