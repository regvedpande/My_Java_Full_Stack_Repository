package com.mkpits.stack;

import java.util.Stack;

public class AccessingElementsInStack {

	public static void main(String[] args) {

		Stack<String> fact = new Stack<String>();
		fact.push("India");
		fact.push("is");
		fact.push("the");
		fact.push("Birthplace");
		fact.push("of");
		fact.push("Lord Rama");

		System.out.println("Before Peek : " + fact);

		/*
		 * To retrieve or fetch the first element of the Stack or the element present at
		 * the top of the Stack, we can use peek() method.
		 */

		System.out.println("Using Peek : " + fact.peek());

		System.out.println("Element at top of the Stack is : " + fact.peek());
	}

}
