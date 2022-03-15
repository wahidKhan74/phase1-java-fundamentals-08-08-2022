package com.simplilearn.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
		
		//step 1:  create an object
		Employee employee = new Employee(100111, "John Smith", "Engineering", 756756.546);
		
		//step 2:  create a byte stream
		try {
			// create file output stream.
			FileOutputStream file = new FileOutputStream("file-db.txt");
			
			// create object stream
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			// method to serialize object
			out.writeObject(employee);
			
			System.out.println("Serialization is completed !");
			out.close();
			file.close();
			
		} catch (Exception e) {
			System.out.println("Exception Ocuured : "+e.getClass());
			System.out.println("Exception Message : "+e.getMessage());
		}
		
	}

}
