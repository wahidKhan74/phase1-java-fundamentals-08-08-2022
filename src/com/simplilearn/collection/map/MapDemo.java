package com.simplilearn.collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
			
		// Map is java collection stores data i key(unique) and value pair
		Map<String, String> map1 = new HashMap<>();  // store key value + no insertion order
		Map<String, String> map2 = new LinkedHashMap<>(); // store key value + insertion order
		Map<String, String> map3 = new TreeMap<>(); // store key value pair + order by key -> asc keys
		
		Map<String, Long> phoneBook = new HashMap<String, Long>();
		
		// add element in map
		phoneBook.put("John", 895478990L);
		phoneBook.put("Mike", 567568678L);
		phoneBook.put("Will", 123123423L);
		phoneBook.put("Kim",  878978956L);
		phoneBook.put("Ava",  895478990L);
		phoneBook.put("Will", 679790000L);
		
		System.out.println(phoneBook);
		
		System.out.println("Wills number :" + phoneBook.get("Will"));
		System.out.println("Kim number :" +phoneBook.get("Kim"));
		
		// iterate over map
		for(Map.Entry<String, Long> entry : phoneBook.entrySet()) {
			System.out.println(" Key : "+entry.getKey());
			System.out.println(" Value : "+entry.getValue());
			System.out.println("--------------");
		}
	}

}
