package com.mkpits.priorityqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;


/*
This Java program employs a `PriorityQueue` to implement a console-based interactive application, enabling users to add elements with
priorities, remove the highest-priority element, and view the current state of the priority queue. The program continues executing until
the user chooses to exit, providing a hands-on demonstration of basic `PriorityQueue` operations using `BufferedReader` for user input.
 */
public class PriorityQueuePractice {

    public static void main(String[] args) throws IOException {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("\nPriorityQueue Operations:");
            System.out.println("1. Add Element with Priority");
            System.out.println("2. Remove Highest-Priority Element");
            System.out.println("3. Display PriorityQueue");
            System.out.println("4. Exit");

            System.out.print("Enter your choice (1-4): ");
            String input = reader.readLine();

            try {
                int choice = Integer.parseInt(input);

                switch (choice) {
                    case 1:
                        System.out.print("Enter element to add with priority: ");
                        String elementToAdd = reader.readLine();
                        priorityQueue.offer(elementToAdd);
                        System.out.println("Added: " + elementToAdd);
                        break;

                    case 2:
                        if (!priorityQueue.isEmpty()) {
                            String removedElement = priorityQueue.poll();
                            System.out.println("Removed: " + removedElement);
                        } else {
                            System.out.println("PriorityQueue is empty. Cannot remove.");
                        }
                        break;

                    case 3:
                        System.out.println("Current PriorityQueue: " + priorityQueue);
                        break;

                    case 4:
                        System.out.println("Exiting program. Goodbye!");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }
}
