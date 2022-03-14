package com.simplilearn.multithreading;

class Account {

	double balance = 1000.00;

	// show balance
	public synchronized void showBalance() {
		System.out.println("The Account balance is : " + balance);
	}

	// deposit
	public synchronized void deposit(double amount) {
		System.out.println("Deposit Begin ...");
		balance += amount;
		System.out.println("Deposit is cmpleted & new balance is " + balance);
		notify();
	}

	// withdraw
	public synchronized void withdraw(double amount) {
		if (balance <= amount) {
			System.out.println("In sufficient fund");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		balance -= amount;
		System.out.println("Withdraw is cmpleted & new balance is " + balance);
	}
}

public class ThreadWithWait {

	public static void main(String[] args) {

		Account account = new Account();

		// create thread
		Thread t1 = new Thread(() -> {
			account.withdraw(1000);
		});

		Thread t2 = new Thread(() -> {
			account.deposit(5000);
		});

		Thread t3 = new Thread(() -> {
			account.showBalance();
		});

		t1.start();
		t2.start();
		t3.start();
	}

}
