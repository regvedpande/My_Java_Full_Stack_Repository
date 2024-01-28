package com.mkpits.priorityqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class PriorityQueuePeek {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        PriorityQueue<String> festival = new PriorityQueue<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many Festivals you want to add : " );
        int add = Integer.parseInt(br.readLine());

        for (int i = 0; i < add; i++) {
            
            System.out.println("Festival Number : " +i);
            festival.add(br.readLine());

        }

        System.out.println("Your List of Festivals are : " + festival);

        System.out.println("Peeked Element : " + festival.peek());
    }
}
