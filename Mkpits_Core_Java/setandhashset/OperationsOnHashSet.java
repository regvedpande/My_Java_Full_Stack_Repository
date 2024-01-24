package com.mkpits.setandhashset;

import java.util.HashSet;
import java.util.Iterator;

public class OperationsOnHashSet {

	public static void main(String[] args) {

		HashSet<String> grocerieslist = new HashSet<String>();

		// Adding Element in Hash Set
		grocerieslist.add("Tomato");
		grocerieslist.add("Egg Plant");
		grocerieslist.add("Lettuce");
		grocerieslist.add("Onions");
		grocerieslist.add("Pickles");
		grocerieslist.add("KetchUp");

		System.out.println(grocerieslist);

		// Removing Element in Hash Set

		grocerieslist.remove("KetchUp");

		System.err.println(grocerieslist);

		// Iterating in Hash Set

		Iterator list = grocerieslist.iterator();

		while (list.hasNext()) {
			System.out.println(list.next());

		}

		// Returns the Hash Code value of the Set
		System.out.println(grocerieslist.hashCode());

	}

}
