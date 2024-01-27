package com.mkpits.treeset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Spliterator;
import java.util.TreeSet;

public class TreeSetUsingSpliterator {
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        TreeSet<String> malls = new TreeSet<String>();
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many Malls you want to add : ");
        int store = Integer.parseInt(br.readLine());

        for (int i = 0; i < store; i++) {
            
            System.out.println("Mall Number" +i);
            malls.add(br.readLine());

        }

        System.out.println("List of Malls are : " +malls);

        Spliterator<String>split = malls.spliterator();
        System.out.println("Malls are : ");

        split.forEachRemaining(System.out::println);

        /*Note : Spliterator in Java is a tool for efficiently splitting and iterating over 
        elements in parallel, supporting parallel processing of data structures. */

    }
}
