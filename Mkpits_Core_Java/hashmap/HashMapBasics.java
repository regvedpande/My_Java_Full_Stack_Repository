package com.mkpits.hashmap;

import java.util.HashMap;

public class HashMapBasics {

	public static void main(String[] args) {

		HashMap<String, Integer> pairs = new HashMap<String, Integer>();
		pairs.put("Regved", 23);
		pairs.put("Pranav", 22);
		pairs.put("Ashik", 25);

		pairs.put("Raj", 23);
		pairs.put("Sanket", 23);

		// HashMap follows LIFO
		// It prints the answer Lexicographically

		System.out.println(pairs);

		// Size of the HashMap
		System.out.println(pairs.size());

		for (int i = 0; i < pairs.size(); i++) {

			System.out.println(pairs.containsKey("Pranav"));
			break;
		}

	}

}
