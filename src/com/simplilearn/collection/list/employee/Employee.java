package com.simplilearn.collection.list.employee;

public class Employee {
	
	public int id;
	public String name;
	public String dept;
	public double salary;
	
	public Employee() {}

	public Employee(int id, String name, String dept, double salary) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "[ id= "+id +" name="+name +" salary="+salary +" dept="+dept +"]";
	}
	
}
