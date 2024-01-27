package com.mkpits.sortedset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTailSet {
    public static void main(String[] args) throws NumberFormatException, IOException {

        SortedSet<String> flowers = new TreeSet<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of flowers you want to add: ");
        int store = Integer.parseInt(br.readLine());

        for (int i = 0; i < store; i++) {
            System.out.println("Flower Number " + i);
            flowers.add(br.readLine());
        }

        System.out.println("Your Sorted List of Flowers are: " + flowers);

        System.out.println("Enter the tail element: ");
        String element = br.readLine();

        SortedSet<String> sort = flowers.tailSet(element);
        System.out.println("Range of flower the entered element is " + sort);
    }
}

