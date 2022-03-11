package com.simplilearn.collection.queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> numbers = new PriorityQueue<Integer>();
		
		numbers.add(6);
		numbers.add(4);
		numbers.add(2);		

		numbers.offer(1);
		System.out.println(numbers);
	}

}
