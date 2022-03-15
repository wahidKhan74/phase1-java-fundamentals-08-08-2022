package com.simplilearn.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;

public class ListSerializationDemo {

	public static void main(String[] args) {
		
		//step 1:  create an list object
		List<Employee> list = new LinkedList<Employee>();
		
		// add employees into list
		list.add(new Employee(100111, "John Smith", "Engineering", 54565.546));
		list.add(new Employee(100112, "Will Smith", "Dev", 6786756.546));
		list.add(new Employee(100113, "Marry Smith", "HR", 34532.546));
		list.add(new Employee(100114, "David Smith", "Engineering", 112455.546));
		
		//step 2:  create a byte stream
		try {
			// create file output stream.
			FileOutputStream file = new FileOutputStream("list-db.txt");
			
			// create object stream
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			// method to serialize object
			out.writeObject(list);
			
			System.out.println("Serialization is completed !");
			out.close();
			file.close();
			
		} catch (Exception e) {
			System.out.println("Exception Ocuured : "+e.getClass());
			System.out.println("Exception Message : "+e.getMessage());
		}
		
	}

}
