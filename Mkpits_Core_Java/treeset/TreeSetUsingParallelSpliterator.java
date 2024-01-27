package com.mkpits.treeset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Spliterator;
import java.util.TreeSet;

public class TreeSetUsingParallelSpliterator {
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        TreeSet<String> bikes = new TreeSet<String>();
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many bikes you want to add : ");
        int store = Integer.parseInt(br.readLine());

        for (int i = 0; i < store; i++) {
            
            System.out.println("Bike Number" +i);
            bikes.add(br.readLine());

        }

        System.out.println("List of Bikes are : " +bikes);

        Spliterator<String>split = bikes.spliterator();
        System.out.println("Bikes are : ");
        split.forEachRemaining(System.out::println);

        Spliterator<String>parallelsplit = bikes.spliterator();
        System.out.println("Another instance of Bikes are ");
        parallelsplit.trySplit().forEachRemaining(System.out::println);

        /*Perform parallel traversal using forEachRemaining 
          on a split Spliterator in a TreeSet.*/
}
}
