package com.mkpits.linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class AddAllinLinkedList {
    public static void main(String[] args) throws IOException {
        LinkedList<String> fruits = new LinkedList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many fruits do you want to add to the list: ");
        int quantity = Integer.parseInt(br.readLine());

        for (int i = 0; i < quantity; i++) {
            System.out.println("Fruit " +i);
            fruits.add(br.readLine());
        }

        System.out.println("Fruits in the list: " + fruits);

        System.out.println("Enter the index to add a fruit: ");
        int index = Integer.parseInt(br.readLine());

        System.out.println("Enter the fruit to add at index " + index + ": ");
        fruits.add(index, br.readLine());

        System.out.println("Updated list of fruits: " + fruits);
    }
}

