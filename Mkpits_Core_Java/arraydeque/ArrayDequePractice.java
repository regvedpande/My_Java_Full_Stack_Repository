package com.mkpits.arraydeque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

/*
This Java program utilizes `ArrayDeque` to implement a menu-driven console interface, allowing users to perform operations such as 
adding and removing elements at both ends of the deque. The program displays the current state of the `ArrayDeque` and continues to 
execute until the user chooses to exit, providing an interactive demonstration of basic `ArrayDeque` operations using `BufferedReader` for user input.
 */

public class ArrayDequePractice {

    public static void main(String[] args) throws IOException {
        Deque<String> arrayDeque = new ArrayDeque<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("\nArrayDeque Operations:");
            System.out.println("1. Add Element at Front");
            System.out.println("2. Add Element at Rear");
            System.out.println("3. Remove Element from Front");
            System.out.println("4. Remove Element from Rear");
            System.out.println("5. Display ArrayDeque");
            System.out.println("6. Exit");

            System.out.print("Enter your choice (1-6): ");
            String input = reader.readLine();

            try {
                int choice = Integer.parseInt(input);

                switch (choice) {
                    case 1:
                        System.out.print("Enter element to add at the front: ");
                        String elementToAddFront = reader.readLine();
                        arrayDeque.addFirst(elementToAddFront);
                        System.out.println("Added at front: " + elementToAddFront);
                        break;

                    case 2:
                        System.out.print("Enter element to add at the rear: ");
                        String elementToAddRear = reader.readLine();
                        arrayDeque.addLast(elementToAddRear);
                        System.out.println("Added at rear: " + elementToAddRear);
                        break;

                    case 3:
                        if (!arrayDeque.isEmpty()) {
                            String removedFromFront = arrayDeque.removeFirst();
                            System.out.println("Removed from front: " + removedFromFront);
                        } else {
                            System.out.println("ArrayDeque is empty. Cannot remove from front.");
                        }
                        break;

                    case 4:
                        if (!arrayDeque.isEmpty()) {
                            String removedFromRear = arrayDeque.removeLast();
                            System.out.println("Removed from rear: " + removedFromRear);
                        } else {
                            System.out.println("ArrayDeque is empty. Cannot remove from rear.");
                        }
                        break;

                    case 5:
                        System.out.println("Current ArrayDeque: " + arrayDeque);
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
