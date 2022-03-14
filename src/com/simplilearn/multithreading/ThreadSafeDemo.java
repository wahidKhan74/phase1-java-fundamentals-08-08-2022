package com.simplilearn.multithreading;

class Counter {

	int count;

	// increase count  : thread safe
	public synchronized void increaseCount() {
		count++; // count = count +1; or count+=1
	}

	// decrease count : non thread safe
	public void decreaseCount() {
		count--; // count = count -1; or count-=1
	}
}

public class ThreadSafeDemo {

	public static void main(String[] args) throws InterruptedException {
		// create counter object
		Counter counter = new Counter();

		// create thread one
		Thread t1 = new Thread(() -> {
			for (int index = 0; index < 10000; index++) {
				counter.increaseCount();
			}
		});

		// create thread two
		Thread t2 = new Thread(() -> {
			for (int index = 0; index < 10000; index++) {
				counter.increaseCount();
			}
		});

		// create thread two
		Thread t3 = new Thread(() -> {
			for (int index = 0; index < 10000; index++) {
				counter.increaseCount();
			}
		});

		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		System.out.println("The count : " + counter.count);
	}

}
