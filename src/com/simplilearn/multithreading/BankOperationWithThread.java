package com.simplilearn.multithreading;

class Customer {
	
	double balance = 1000.00;
	
	// show balance
	public synchronized void showBalance() {
		System.out.println("The Account balance is : "+balance);
	}	
	// deposit
	public synchronized void deposit(double amount) {
		System.out.println("Deposit Begin ...");
		balance += amount;
		System.out.println("Deposit is cmpleted & new balance is "+ balance);
	}	
	// withdraw 
	public synchronized void withdraw(double amount) {
		if(balance <= amount) {
			System.out.println("In sufficient fund");
			return;
		}
		balance -= amount;
		System.out.println("Withdraw is cmpleted & new balance is "+ balance);
	}
}

public class BankOperationWithThread {

	public static void main(String[] args) {
		
		Customer customer = new  Customer();
		
		// create thread
		Thread t1 = new Thread(()->{
			customer.withdraw(1000);
		});
		
		Thread t2 = new Thread(()->{
			customer.deposit(5000);
		});
		
		Thread t3 = new Thread(()->{
			customer.showBalance();
		});

		t1.start();
		t2.start();
		t3.start();
	}

}
