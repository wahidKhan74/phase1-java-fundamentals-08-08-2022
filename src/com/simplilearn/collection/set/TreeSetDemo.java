package com.simplilearn.collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		// Treeset arrange data into asc order
		TreeSet<String> setOfUniqueName = new TreeSet<String>();
		TreeSet<Integer> set1 = new TreeSet<Integer>();
		TreeSet<Double> set2 = new TreeSet<Double>();
		
		setOfUniqueName.add("John");
		setOfUniqueName.add("Usman");
		setOfUniqueName.add("Garima");
		setOfUniqueName.add("Ramesh");
		setOfUniqueName.add("Dev");
		setOfUniqueName.add("John");

		System.out.println(setOfUniqueName);
		System.out.println(setOfUniqueName.descendingSet());

		// set iteration with iterator
		Iterator<String> itr = setOfUniqueName.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("-------------------");
		// set iteration with iterator
		for (String name : setOfUniqueName) {
			System.out.println("The name : " + name);
		}

		System.out.println("-------------------");
		// set iteration with iterator
		Iterator<String> itr2 = setOfUniqueName.descendingIterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		System.out.println("-------------------");
		// set iteration with iterator
		for (String name : setOfUniqueName.descendingSet()) {
			System.out.println("Desc name : " + name);
		}

	}

}
