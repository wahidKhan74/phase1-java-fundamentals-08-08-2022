package com.simplilearn.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class ListDeserializationDemo {

	public static void main(String[] args) {
		
		// Reading Byte Stream
		try {
			// 1. read a file
			FileInputStream file = new FileInputStream("list-db.txt");
			
			// 2. create a input stream object
			ObjectInputStream input = new ObjectInputStream(file);
			
			// 3. method to de-serialized object
			List<Employee> employeeList = (List<Employee>) input.readObject(); 
			
			System.out.println(" Deserialization completed !");
			for(Employee employee : employeeList) {
				System.out.println("-------------");
				System.out.println("Emp Id : "+ employee.id);
				System.out.println("Emp Name : "+ employee.name);
				System.out.println("Emp Salary : "+ employee.salary);
				System.out.println("Emp Dept : "+ employee.dept);
			}
			
		} catch (Exception e) {
			System.out.println("Exception Ocuured : "+e.getClass());
			System.out.println("Exception Message : "+e.getMessage());
		}

	}

}
