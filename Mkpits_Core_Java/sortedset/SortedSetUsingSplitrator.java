package com.mkpits.sortedset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.SortedSet;
import java.util.Spliterator;
import java.util.TreeSet;

public class SortedSetUsingSplitrator {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        SortedSet<String>desserts = new TreeSet<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many desserts you want to buy ");
        int store = Integer.parseInt(br.readLine());

        for (int i = 0; i < store; i++) {
            
            System.out.println("Desserts Number "+i);
            desserts.add(br.readLine());

        }

        System.out.println("Your List of Desserts are : " + desserts);

        System.out.println("Deserts in sorted form are : ");
        Spliterator<String> split = desserts.spliterator();
        split.forEachRemaining(System.out::println);

    }
}
