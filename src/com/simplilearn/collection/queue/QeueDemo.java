package com.simplilearn.collection.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QeueDemo {

	public static void main(String[] args) {

		// Queue is a data structure which works in first in first out order.

		Queue<String> peopleQueue = new ArrayDeque<>();

		peopleQueue.add("John");
		peopleQueue.add("Mike");
		peopleQueue.add("William");
		peopleQueue.add("David");
		peopleQueue.add("Carl");
		peopleQueue.add("John");

		System.out.println(peopleQueue);

		// peek -> checking top element
		System.out.println("Head :> " + peopleQueue.peek());
		System.out.println("Head :> " + peopleQueue.element());

		// remove element from head
		String removedElem = peopleQueue.poll();
		System.out.println("Removed elem :> " + removedElem);

		String removedElem2 = peopleQueue.poll();
		System.out.println("Removed elem :> " + removedElem2);

		System.out.println(peopleQueue);
		System.out.println("---------------");
		// iteration over
		for (String person : peopleQueue) {
			System.out.println(person);
		}

		System.out.println("---------------");

		Queue<String> bankQueue = new PriorityQueue<>();

		bankQueue.add("William");
		bankQueue.add("Marry");
		bankQueue.add("Sam");
		bankQueue.add("David");
		bankQueue.add("Kim");
		bankQueue.add("Yeen");

		System.out.println(bankQueue);
		// peek -> checking top element
		System.out.println("Head :> " + bankQueue.peek());
		System.out.println("Head :> " + bankQueue.element());

		// remove element from head
		String removed = bankQueue.poll();
		System.out.println("Removed elem :> " + removed);

	}

}
