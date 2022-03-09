package com.simplilearn.method.bank;

public class Account {

	public long accNo;
	public double balance;
	public String username;
	public String email;
	
	// non parameterized constructor
	public Account() {}
	
	//  parameterized constructor : initialize all data variable of class
	public Account(long accNo, double balance, String username, String email) {
		this.accNo = accNo;
		this.balance = balance;
		this.username = username;
		this.email = email;
	}
}
