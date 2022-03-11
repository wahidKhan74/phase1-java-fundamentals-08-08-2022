package com.simplilearn.collection.queue.account;

import java.util.ArrayDeque;
import java.util.Queue;

public class AccountQueue {

	public static void main(String[] args) {
		
		Queue<Account> accountQueue = new ArrayDeque<Account>();
		
		// insert data into queue 
		accountQueue.add( new Account(10001, "Mike Smith", 456757.567));
		accountQueue.add( new Account(10002, "Marry Smith", 456757.567));
		accountQueue.add( new Account(10003, "William Smith", 456757.567));
		accountQueue.add( new Account(10004, "Sara Smith", 456757.567));
		accountQueue.add( new Account(10005, "Aria Smith", 456757.567));
		
		for(Account acc: accountQueue) {
			System.out.println(acc.id);
			System.out.println(acc.name);
			System.out.println(acc.balance);
			System.out.println("---------------");
		}

	}

}
