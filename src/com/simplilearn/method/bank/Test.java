package com.simplilearn.method.bank;

public class Test {
	
	public static void main(String[] args) {
	
		// create a ccount object
		Account account = new Account(11223344, 500000.567, "Iron Man", "iron.man@ironbak.com");
		
		// create a BankOperation object
		BankOperation opr = new BankOperation();
		
		System.out.println("Welcome to the bank :: '"+ opr.bankName+ " ' ");
		
		System.out.println("The user balance : " + opr.showBalance(account));
		
		System.out.println("The user balance after deposit: "+opr.depositAmt(account,1000.56));
		System.out.println("The user balance after deposit: "+opr.depositAmt(account,5000.00));
		
		
		System.out.println("The user balance after withdraw: "+opr.withdrawAmt(account,1000.56));
		System.out.println("The user balance after withdraw: "+opr.withdrawAmt(account,5000.00));
	}
}
