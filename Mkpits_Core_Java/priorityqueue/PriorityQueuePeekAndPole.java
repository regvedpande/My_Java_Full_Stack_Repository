package com.mkpits.priorityqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class PriorityQueuePeekAndPole {
    public static void main(String[] args) throws IOException {
        
        PriorityQueue<String> places = new PriorityQueue<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many places you want to add : " );
        int add = Integer.parseInt(br.readLine());

        for (int i = 0; i < add; i++) {
            
            System.out.println("Place Number : " +i);
            places.add(br.readLine());

        }

        System.out.println("Your List of Places are : " + places);
        System.out.println("Using Peek : " + places.peek());
        System.out.println("Using Poll we get :" + places.poll());
        System.out.println("Your Updated Places are : " + places);
        
    }
}
