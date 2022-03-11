package com.simplilearn.collection.set.employee;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class EmployeeSet {

	public static void main(String[] args) {

		// create employee object
		Employee employee1 = new Employee(1001, "John Smith", "Engineering", 56456.567);
		Employee employee2 = new Employee(1002, "Marry Joe", "HR", 896456.567);
		Employee employee3 = new Employee(1003, "Kim Smith", "HR", 16456.567);
		Employee employee4 = new Employee(1004, "Will Smith", "Engineering", 57856.567);
		Employee employee5 = new Employee(1005, "Aria Stark", "Operations", 99056.567);

		// create a set
		Set<Employee> empSet = new LinkedHashSet<Employee>();

		empSet.add(employee1);
		empSet.add(employee2);
		empSet.add(employee3);
		empSet.add(employee4);
		empSet.add(employee1);

		System.out.println(empSet);
		System.out.println("-----------------------");
		// set iteration with iterator
		Iterator<Employee> itr = empSet.iterator();
		while (itr.hasNext()) {
			// System.out.println(itr.next());
			Employee employee = itr.next();
			System.out.println(employee.id);
			System.out.println(employee.name);
			System.out.println(employee.salary);
			System.out.println(employee.dept);
			System.out.println("--------------------");
		}
	}

}
