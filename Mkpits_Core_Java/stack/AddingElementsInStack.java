package com.mkpits.stack;

import java.util.Stack;

public class AddingElementsInStack {
	public static void main(String[] args) {

		/*
		 * In order to add an element to the stack, we can use the push() method. This
		 * push() operation place the element at the top of the stack
		 */

		Stack<String> elements1 = new Stack<String>();
		elements1.push("Jai");
		elements1.push("Shree");
		elements1.push("Ram !");

		Stack<String> elements2 = new Stack<String>();
		elements2.push("Ayodhya");
		elements2.push("is the");
		elements2.push("Birthplace");
		elements2.push("of Lord Rama");

		System.out.println(elements1);
		System.out.println(elements2);

	}
}
