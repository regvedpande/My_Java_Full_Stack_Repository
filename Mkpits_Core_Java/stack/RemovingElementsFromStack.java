package com.mkpits.stack;

import java.util.Stack;

public class RemovingElementsFromStack {

	public static void main(String[] args) {

		Stack<String> religiousplaces = new Stack<String>();
		religiousplaces.push("Ayodhya");
		religiousplaces.push("Mathura");
		religiousplaces.push("Varanasi");
		religiousplaces.push("Mount Kailash");
		religiousplaces.push("Vaishno Devi");

		System.out.println("Before Pop : " + religiousplaces);

		/*
		 * To pop an element from the stack, we can use the pop() method. The element is
		 * popped from the top of the stack and is removed from the same.
		 */

		System.out.println("Using Pop : " + religiousplaces.pop());

		System.out.println("After Using Pop : " + religiousplaces);

	}

}
