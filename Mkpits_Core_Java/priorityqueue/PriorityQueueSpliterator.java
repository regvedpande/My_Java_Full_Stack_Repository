package com.mkpits.priorityqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Spliterator;

public class PriorityQueueSpliterator {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        PriorityQueue<String> airplanes = new PriorityQueue<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many airplanes you want to add : " );
        int add = Integer.parseInt(br.readLine());

        for (int i = 0; i < add; i++) {
            
            System.out.println("Airplane Number : " +i);
            airplanes.add(br.readLine());

        }

        System.out.println("Your List of Galaxies are : " + airplanes);

        Spliterator<String> iterate = airplanes.spliterator();
        iterate.forEachRemaining(System.out::println);

    }
}
