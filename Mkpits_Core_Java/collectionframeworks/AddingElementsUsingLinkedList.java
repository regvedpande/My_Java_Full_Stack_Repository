package com.mkpits.collectionframeworks;

import java.util.LinkedList;

public class AddingElementsUsingLinkedList {

	public static void main(String[] args) {

		LinkedList<String> sentence = new LinkedList<String>();
		sentence.add("Nagpur");
		sentence.add("Bangalore");
		sentence.add("Mumbai");
		sentence.add("Pune");

		sentence.add(1, "Hyderabad");
		System.out.println(sentence);

	}

}
