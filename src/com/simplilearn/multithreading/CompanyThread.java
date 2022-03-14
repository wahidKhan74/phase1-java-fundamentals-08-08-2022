package com.simplilearn.multithreading;

public class CompanyThread {

	public static void main(String[] args) {
		
		// create object of bob
		Bob bob = new Bob();
		Thread t1 = new Thread(bob);
		t1.start();
		
		// create object of usman
		Usman usman = new Usman();
		Thread t2 = new Thread(usman);
		t2.start();
	}

}

class Work  {
	
	public void submit() {
		
	}
}

class Bob extends Work implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread Bob is running !");
	}
	
}

class Usman implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread Usman is running !");
	}
	
}
