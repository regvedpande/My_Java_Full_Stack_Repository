package com.mkpits.deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

/*
This Java program uses a `Deque` (implemented as a `LinkedList`) to demonstrate basic operations like adding and removing
elements at both ends, displaying the current deque, and allowing the user to interactively perform these operations through
a menu-driven console interface using `BufferedReader` for input.
 */

public class DequePractice {

    public static void main(String[] args) throws IOException {
        Deque<String> deque = new LinkedList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("\nDeque Operations:");
            System.out.println("1. Add Element at Front");
            System.out.println("2. Add Element at Rear");
            System.out.println("3. Remove Element from Front");
            System.out.println("4. Remove Element from Rear");
            System.out.println("5. Display Deque");
            System.out.println("6. Exit");

            System.out.print("Enter your choice (1-6): ");
            String input = reader.readLine();

            try {
                int choice = Integer.parseInt(input);

                switch (choice) {
                    case 1:
                        System.out.print("Enter element to add at the front: ");
                        String elementToAddFront = reader.readLine();
                        deque.addFirst(elementToAddFront);
                        System.out.println("Added at front: " + elementToAddFront);
                        break;

                    case 2:
                        System.out.print("Enter element to add at the rear: ");
                        String elementToAddRear = reader.readLine();
                        deque.addLast(elementToAddRear);
                        System.out.println("Added at rear: " + elementToAddRear);
                        break;

                    case 3:
                        if (!deque.isEmpty()) {
                            String removedFromFront = deque.removeFirst();
                            System.out.println("Removed from front: " + removedFromFront);
                        } else {
                            System.out.println("Deque is empty. Cannot remove from front.");
                        }
                        break;

                    case 4:
                        if (!deque.isEmpty()) {
                            String removedFromRear = deque.removeLast();
                            System.out.println("Removed from rear: " + removedFromRear);
                        } else {
                            System.out.println("Deque is empty. Cannot remove from rear.");
                        }
                        break;

                    case 5:
                        System.out.println("Current Deque: " + deque);
                        break;

                    case 6:
                        System.out.println("Exiting program. Goodbye!");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 6.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }
}
