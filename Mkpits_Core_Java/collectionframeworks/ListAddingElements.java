package com.mkpits.collectionframeworks;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListAddingElements {

	public static void main(String[] args) throws IOException {

		List<String> fact = new ArrayList<String>();
		fact.add(0, "Mount");
		fact.add(1, "Everest");
		fact.add(2, "is");
		fact.add(3, "Highest Peak");

		fact.add(3, "the");

		System.out.println(fact);

	}
}