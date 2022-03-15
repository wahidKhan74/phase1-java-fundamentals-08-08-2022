package com.simplilearn.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) {
		
		// Reading Byte Stream
		try {
			// 1. read a file
			FileInputStream file = new FileInputStream("file-db.txt");
			
			// 2. create a input stream object
			ObjectInputStream input = new ObjectInputStream(file);
			
			// 3. method to de-serialized object
			Employee employee = (Employee) input.readObject(); 
			
			System.out.println(" Deserialization completed !");
			
			System.out.println("Emp Id : "+ employee.id);
			System.out.println("Emp Name : "+ employee.name);
			System.out.println("Emp Salary : "+ employee.salary);
			System.out.println("Emp Dept : "+ employee.dept);
			
		} catch (Exception e) {
			System.out.println("Exception Ocuured : "+e.getClass());
			System.out.println("Exception Message : "+e.getMessage());
		}

	}

}
