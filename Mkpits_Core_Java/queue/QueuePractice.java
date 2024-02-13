package com.mkpits.queue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/*
This Java program implements a simple interactive console-based application for managing a queue of computer manufacturers.
Users can enqueue manufacturers (Apple, Dell, HP), dequeue the front of the queue, display the current queue, and exit the 
program based on their input. The program uses a `Queue` (implemented with `LinkedList`) to perform these basic queue operations. 
 */
public class QueuePractice {

    public static void main(String[] args) throws IOException {
        Queue<String> manufacturerQueue = new LinkedList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            System.out.println("\nComputer Manufacturer Queue Operations:");
            System.out.println("1. Enqueue Apple");
            System.out.println("2. Enqueue Dell");
            System.out.println("3. Enqueue HP");
            System.out.println("4. Dequeue Manufacturer");
            System.out.println("5. Display Manufacturer Queue");
            System.out.println("6. Exit");

            System.out.print("Enter your choice (1-6): ");
            String choice = reader.readLine();

            switch (choice) {
                case "1":
                    manufacturerQueue.offer("Apple");
                    System.out.println("Enqueued: Apple");
                    break;

                case "2":
                    manufacturerQueue.offer("Dell");
                    System.out.println("Enqueued: Dell");
                    break;

                case "3":
                    manufacturerQueue.offer("HP");
                    System.out.println("Enqueued: HP");
                    break;

                case "4":
                    String dequeuedManufacturer = manufacturerQueue.poll();
                    if (dequeuedManufacturer != null) {
                        System.out.println("Dequeued: " + dequeuedManufacturer);
                    } else {
                        System.out.println("Manufacturer queue is empty. Cannot dequeue.");
                    }
                    break;

                case "5":
                    System.out.println("Current Manufacturer Queue: " + manufacturerQueue);
                    break;

                case "6":
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        }
    }
}
