package com.mkpits.hashmap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class ScoreboardUsingHashMap {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// Create a HashMap to store player scores (key) and names (value)
		HashMap<Integer, String> players = new HashMap<>();

		// Create a BufferedReader for user input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Ask the user for the range
		System.out.println("Enter Range : ");
		int range = Integer.parseInt(br.readLine());

		// Ask the user to enter player scores and names
		System.out.println("Enter the Players Score and Name : ");
		for (int i = 0; i < range; i++) {
			// Read player score and name from the user and put them in the HashMap
			players.put(Integer.parseInt(br.readLine()), br.readLine());
		}

		// Call the method to sort and display player scores
		sortbykey(players);

		// Use a lambda expression to find and print the maximum score in the player
		// scores
		players.keySet().stream().reduce(Integer::max).ifPresent(System.out::println);
	}

	// Method to sort and display player scores in descending order
	public static void sortbykey(HashMap<Integer, String> map) {
		// Convert the keys of the map into an ArrayList
		ArrayList<Integer> sortedKeys = new ArrayList<>(map.keySet());

		// Sort the keys in ascending order
		Collections.sort(sortedKeys);

		// Reverse the order to get a descending order
		Collections.reverse(sortedKeys);

		// Print the sorted keys along with their corresponding values
		for (Integer key : sortedKeys) {
			System.out.println("Key = " + key + ", Value = " + map.get(key));
		}

		// Ask the user to enter a key to check if it is present in the sorted keys
		System.out.println("Enter the Key you want to check if it is present or not : ");
		// Print whether the entered key is present or not
		System.out.println(sortedKeys.contains(96));

		// You can also use Lambda Expressions to print values (commented out for
		// clarity):
		// sortedKeys.values().forEach(n -> System.out.println(n));

		// The following commented-out code demonstrates alternative ways to iterate
		// over the HashMap:
		// Using keySet()
		// var keySet = map.keySet();
		// for (Integer key : keySet) {
		// System.out.println(key);
		// }

		// Using values()
		// var values = map.values();
		// for (String value : values) {
		// System.out.println(value);
		// }

		// Using entrySet()
		// for (var entry : map.entrySet()) {
		// System.out.println("Score : " + entry.getKey() + "; Name: " +
		// entry.getValue());
		// }
	}
}

