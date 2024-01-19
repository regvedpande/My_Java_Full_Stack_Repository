package com.mkpits.collectionframeworks;

import java.util.ArrayList;
import java.util.List;

public class ListUpdatingElements {

	public static void main(String[] args) {

		List<String> fact = new ArrayList<String>();
		fact.add(0, "Mount");
		fact.add(1, "Everest");
		fact.add(2, "is");
		fact.add(3, "Highest Peak");

		// it adds the elements to that index and push forward the existing one
		fact.add(3, "the");

		System.out.println("Before : " + fact);

		// It updates the index element
		fact.set(3, "Highest Ever");

		System.out.println("After : " + fact);

	}

}
