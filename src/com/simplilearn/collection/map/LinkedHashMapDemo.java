package com.simplilearn.collection.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {

		Map<String, Double> mapOfItems = new LinkedHashMap<String, Double>();

		mapOfItems.put("Orange", 46.56);
		mapOfItems.put("Apple", 76.56);
		mapOfItems.put("Kiwi", 99.56);
		mapOfItems.put("Banana", 16.56);
		mapOfItems.put("Mango", 946.56);
		mapOfItems.put("Grapes", 46.56);

		System.out.println(mapOfItems);

		System.out.println("Kiwi price :" + mapOfItems.get("Kiwi"));
		System.out.println("Mango price :" + mapOfItems.get("Mango"));

		// iterate over map
		for (Map.Entry<String, Double> entry : mapOfItems.entrySet()) {
			System.out.println(" Key : " + entry.getKey());
			System.out.println(" Value : " + entry.getValue());
			System.out.println("--------------");
		}
	}

}
