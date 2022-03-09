package com.simplilearn.method.bank;

public class BankOperation {
	
	public String bankName ="Iron Bank";
	
	// show balance
	public double showBalance(Account account) {
		if(account !=null) {
			return account.balance;
		}
		return 0;
	}
	
	// deposit amount
	public double depositAmt(Account account, double amount) {
		if(amount>0) {
			account.balance += amount ;  // account.balance =  account.balance + amount;
			return account.balance;
		} else {
			System.out.println("Invalid deposit Amount");
			return 0;
		}
	}
	
	
	// withdraw amount
	public double withdrawAmt(Account account, double amount) {
		if(amount>0) {
			account.balance -= amount ;  // account.balance =  account.balance - amount;
			return account.balance;
		} else {
			System.out.println("Invalid withdraw Amount");
			return 0;
		}
	}
}
