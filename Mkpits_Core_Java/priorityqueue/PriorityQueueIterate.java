package com.mkpits.priorityqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueIterate {
    public static void main(String[] args) throws NumberFormatException, IOException {

        PriorityQueue<String> galaxies = new PriorityQueue<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many galaxies you want to add : " );
        int add = Integer.parseInt(br.readLine());

        for (int i = 0; i < add; i++) {
            
            System.out.println("Galaxy Number : " +i);
            galaxies.add(br.readLine());

        }

        System.out.println("Your List of Galaxies are : " + galaxies);

        System.out.println("Iterating Galaxies we get : ");
        Iterator<String>iterate = galaxies.iterator();
        while (iterate.hasNext()) {
            System.out.println(iterate.next());
        }
    }
}
