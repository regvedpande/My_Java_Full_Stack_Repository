package com.mkpits.priorityqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueComparator {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        PriorityQueue<String> stars = new PriorityQueue<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many Stars you want to add : " );
        int add = Integer.parseInt(br.readLine());

        for (int i = 0; i < add; i++) {
            
            System.out.println("Star Number : " +i);
            stars.add(br.readLine());

        }

        System.out.println("Your List of Stars are : " + stars);

        /*In the line Comparator<? super String> compare = stars.comparator();, using ? super String is more general than just String. 
        This wildcard (? super String) allows the comparator to handle not only String objects but also any superclass of String. */
        Comparator<? super String>compare = stars.comparator();
        if (compare == null) {
            compare = Comparator.naturalOrder();
        }
        System.out.println("Comparator : " +compare);

    }
}
