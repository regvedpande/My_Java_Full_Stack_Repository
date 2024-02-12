package com.mkpits.stack;

import java.util.Stack;

public class StackPractice {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        // Popping the top element
        String poppedElement = stack.pop();
        System.out.println("Popped Element: " + poppedElement);

        // Peeking at the top element
        String topElement = stack.peek();
        System.out.println("Top Element: " + topElement);

        // Checking if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is Stack Empty? " + isEmpty);

        // Searching for an element in the stack
        int position = stack.search("Banana");
        System.out.println("Position of Banana in Stack: " + position);
    }
}

