package com.simplilearn.collection.map.account;

import java.util.LinkedHashMap;
import java.util.Map;

public class AccountMap {

	public static void main(String[] args) {

		Map<Integer, Account> accountMap = new LinkedHashMap<Integer, Account>();

		accountMap.put(10001, new Account(10001, "tony stark", 78846546.546));
		accountMap.put(10002, new Account(10002, "aria stark", 896546.546));
		accountMap.put(10003, new Account(10003, "marry stark", 523546.546));
		accountMap.put(10004, new Account(10004, "john smith", 5786546.546));
		accountMap.put(10005, new Account(10005, "will ssmithtark", 5236546.546));

		System.out.println(accountMap);

		System.out.println("10001 Acc :> " + accountMap.get(10001));
		System.out.println("10003 Acc :> " + accountMap.get(10003));
		System.out.println("--------------");
		// iterate over map
		for (Map.Entry<Integer, Account> entry : accountMap.entrySet()) {
			System.out.println(" Key : " + entry.getKey());
			System.out.println(" Value : " + entry.getValue());
			System.out.println("--------------");
		}
	}

}
