package com.mkpits.arraydeque;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeExample {

    public static void main(String[] args) {

        // Creating an ArrayDeque
        ArrayDeque<String> colors = new ArrayDeque<>();

        // Adding elements (as a stack and a queue)
        colors.push("Red");       // Add to the front (like a stack)
        colors.offerFirst("Blue"); // Also adds to the front
        colors.offer("Green");    // Add to the end (like a queue)
        colors.addLast("Yellow");  // Also adds to the end

        System.out.println("ArrayDeque: " + colors);

        // Accessing elements:
        System.out.println("First element (peek): " + colors.peek());  // View without removing
        System.out.println("Last element (peekLast): " + colors.peekLast());  

        // Removing elements 
        System.out.println("Removing from front (pop): " + colors.pop());
        System.out.println("Removing from end (pollLast): " + colors.pollLast());

        System.out.println("ArrayDeque after removals: " + colors);

        // Iterating over the ArrayDeque
        System.out.println("\nIterating using an iterator:");
        Iterator<String> iterator = colors.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
