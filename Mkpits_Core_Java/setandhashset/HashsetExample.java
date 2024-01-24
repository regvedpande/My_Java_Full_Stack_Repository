package com.mkpits.setandhashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetExample {

	public static void main(String[] args) {

		HashSet<String> numbers = new HashSet<String>();
		numbers.add("Ferrari");
		numbers.add("Lamborghini");
		numbers.add("Pagani");

		numbers.add("Ferrari");

		System.out.println(numbers.contains("Ferrari"));

		for (int i = 0; i < numbers.size(); i++) {

			if (numbers.contains("Lamborghini")) {

				System.out.println(numbers.remove("Lamborghini"));

			} else {

				System.out.println("Lamborghini is not Present");
			}
		}

		System.out.println("After Removal : " + numbers);

		System.out.println("Size of the Set : " + numbers.size());

		// Using Iterator
		Iterator<String> list = numbers.iterator();

		while (list.hasNext()) {
			System.out.println(list.next());

		}
	}

}
