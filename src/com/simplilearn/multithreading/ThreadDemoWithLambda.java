package com.simplilearn.multithreading;

public class ThreadDemoWithLambda {

	public static void main(String[] args) {

		// create thread t1
		Thread t1 = new Thread(()-> {
				System.out.println("Thread One is running !");
		});
		t1.start();
		
		// create thread t2
		Thread t2 = new Thread(() -> {
				System.out.println("Thread Two is running !");
		});
		t2.start();

	}

}
