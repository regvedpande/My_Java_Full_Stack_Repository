package com.mkpits.stack;

import java.util.Stack;

public class CheckingEmptinessInStack {

	public static void main(String[] args) {

		Stack<String> holyslogans = new Stack<String>();
		holyslogans.push("Jai Shree Ram");
		holyslogans.push("Jai Shree Krishna");
		holyslogans.push("Om Namah Shivaya");

		// Tests if this vector has no components.

		System.out.println("Checking if the stack is empty or not : " + holyslogans.isEmpty());

	}

}
