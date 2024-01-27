package com.mkpits.sortedset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;


public class IteratingThroughTheSortedSet {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        SortedSet<String>games = new TreeSet<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many Games you want to add : " );
        int store = Integer.parseInt(br.readLine());

        for (int i = 0; i < store; i++) {
            
            System.out.println("Game Number " + i);
            games.add(br.readLine());
        }

        System.out.println("Iterating through the sorted set : ");
        Iterator<String> sort = games.iterator();
        while (sort.hasNext()) {
            System.out.println(sort.next());
        }

    }
}
