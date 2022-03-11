package com.simplilearn.collection.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {

		TreeMap<String, Integer> mapOfCities = new TreeMap<String, Integer>();

		mapOfCities.put("Alaska", 393833);
		mapOfCities.put("New Maxico", 567656);
		mapOfCities.put("Virginia", 393833);
		mapOfCities.put("Kansas", 7876546);
		mapOfCities.put("Alaska", 5465677);

		System.out.println(mapOfCities);

		// iterate over map
		for (Map.Entry<String, Integer> entry : mapOfCities.entrySet()) {
			System.out.println(" Key : " + entry.getKey());
			System.out.println(" Value : " + entry.getValue());
			System.out.println("--------------");
		}

	}

}
