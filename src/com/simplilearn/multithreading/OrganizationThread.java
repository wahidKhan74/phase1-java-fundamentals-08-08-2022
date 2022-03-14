package com.simplilearn.multithreading;

public class OrganizationThread {

	public static void main(String[] args) {
		// create a john thread
		John t1 = new John();
		t1.start();

		// create a Mike thread
		Mike t2 = new Mike();
		t2.start();

		// create a Sam thread
		Sam t3 = new Sam();
		t3.start();
	}

}

class John extends Thread {

	@Override
	public void run() {
		System.out.println("John Thread is running .. "
				+ Thread.currentThread().getName());
	}
}

class Mike extends Thread {

	@Override
	public void run() {
		System.out.println("Mike Thread is running .. "
				+ Thread.currentThread().getName());
	}
}

class Sam extends Thread {

	@Override
	public void run() {
		System.out.println("Sam Thread is running .. "
				+ Thread.currentThread().getName());
	}
}