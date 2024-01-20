package com.mkpits.collectionframeworks;

import java.util.LinkedList;

public class AccessingElementsUsingLinkedList {

	public static void main(String[] args) {

		LinkedList<String> access = new LinkedList<String>();
		access.add("Ducati");
		access.add("Kawasaki");
		access.add("KTM");
		access.add("Triumph");

		access.set(1, "Harley Davidson");
		System.out.println(access);

	}

}
