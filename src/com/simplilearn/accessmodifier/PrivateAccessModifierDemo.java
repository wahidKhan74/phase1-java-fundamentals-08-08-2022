package com.simplilearn.accessmodifier;

public class PrivateAccessModifierDemo {

	public static void main(String[] args) {
		
		BankAccount account = new BankAccount();
		
		// account.balance;  // compile time error.
		// account.fdAmount; // compile time error.
		// account.showBalance(); // compile time error.
		
		account.printAll();
		

	}

}

class BankAccount {
	
	// private variable : properties : data members
	private double balance = 456456.567;
	private double fdAmount = 78689.67;
	
	// private methods : member function
	private double showBalance() {
		return balance;
	}
	
	private double showFdAmount() {
		return fdAmount;
	}
	
	//public methods
	public void printAll() {
		System.out.println("The balance : "+balance +" & fd amount  : "+fdAmount);
	}
	
}