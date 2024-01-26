package com.mkpits.linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class LinkedListUsingConditionalStatement {
    public static void main(String[] args) throws IOException {
        LinkedList<String> gamingConsoles = new LinkedList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("How many gaming consoles do you want to add to the list: ");
        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            System.out.println("Gaming Console " + (i + 1) + ": ");
            gamingConsoles.add(br.readLine());
        }

        System.out.println("Gaming Consoles in the list: " + gamingConsoles);

        System.out.println("First gaming console: " + gamingConsoles.getFirst());
        System.out.println("Last gaming console: " + gamingConsoles.getLast());

        System.out.println("Enter the index to get a gaming console: ");
        int getIndex = Integer.parseInt(br.readLine());
        if (getIndex >= 0 && getIndex < gamingConsoles.size()) {
            System.out.println("Gaming console at index " + getIndex + ": " + gamingConsoles.get(getIndex));
        } else {
            System.out.println("Invalid index");
        }

        System.out.println("Enter the index to set a gaming console: ");
        int setIndex = Integer.parseInt(br.readLine());

        if (setIndex >= 0 && setIndex < gamingConsoles.size()) {
            System.out.println("Enter the new gaming console for index " + setIndex + ": ");
            gamingConsoles.set(setIndex, br.readLine());
            System.out.println("Updated list of gaming consoles: " + gamingConsoles);
        } else {
            System.out.println("Invalid index");
        }
    }
}



