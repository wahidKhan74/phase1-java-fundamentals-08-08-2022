package com.simplilearn.multithreading;

public class ThreadDemoWithAnonymousClass {

	public static void main(String[] args) {

		// create object of usman
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread One is running !");
			}

		});
		t1.start();
		
		Thread t2 = new Thread( new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread Two is running !");
			}
		});
		t2.start();

	}

}
