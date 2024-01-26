package com.mkpits.linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class LinkedListEveryBasicConcepts {
    public static void main(String[] args) throws IOException {
        LinkedList<String> indiastates = new LinkedList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of Indian states to add to the beginning of the list: ");
        int numstatebeginning = Integer.parseInt(br.readLine());

        for (int i = 0; i < numstatebeginning; i++) {
            System.out.println("Enter Indian state to add to the beginning: ");
            indiastates.addFirst(br.readLine());
        }

        System.out.println("Indian States in the list after adding to the beginning: " + indiastates);

        System.out.println("Enter the number of Indian states to add to the end of the list: ");
        int numstateend = Integer.parseInt(br.readLine());

        for (int i = 0; i < numstateend; i++) {
            System.out.println("Enter Indian state to add to the end: ");
            indiastates.addLast(br.readLine());
        }

        System.out.println("Indian States in the list after adding to the end: " + indiastates);

        System.out.println("Removing Indian state from the beginning of the list.");
        indiastates.removeFirst();
        System.out.println("Indian States in the list after removing from the beginning: " + indiastates);

        System.out.println("Removing Indian state from the end of the list.");
        indiastates.removeLast();
        System.out.println("Indian States in the list after removing from the end: " + indiastates);

        System.out.println("Get Indian state at the beginning of the list: " + indiastates.getFirst());
        System.out.println("Get Indian state at the end of the list: " + indiastates.getLast());
    }
}

