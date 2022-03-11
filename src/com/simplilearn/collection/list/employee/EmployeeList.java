package com.simplilearn.collection.list.employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {

	public static void main(String[] args) {
		
		// create employee object
		Employee employee1 = new Employee(1001, "John Smith", "Engineering", 56456.567);
		Employee employee2 = new Employee(1002, "Marry Joe", "HR", 896456.567);
		Employee employee3 = new Employee(1003, "Kim Smith", "HR", 16456.567);
		Employee employee4 = new Employee(1004, "Will Smith", "Engineering", 57856.567);
		Employee employee5 = new Employee(1005, "Aria Stark", "Operations", 99056.567);
		
		// create list
		List<Employee> empList = new ArrayList<Employee>();

		empList.add(employee1);
		empList.add(employee2);
		empList.add(employee5);
		
		// insert data at index
		//empList.add(0,employee3);
		
		// replace
		//empList.set(3, employee4);
		//iterations
		for(Employee employee : empList) {
			System.out.println(employee);
			
			System.out.println(employee.id);
			System.out.println(employee.name);
			System.out.println(employee.salary);
			System.out.println(employee.dept);
			System.out.println("----------");
		}

	}

}
