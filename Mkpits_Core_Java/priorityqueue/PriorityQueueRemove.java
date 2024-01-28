package com.mkpits.priorityqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class PriorityQueueRemove {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        PriorityQueue<String> medals = new PriorityQueue<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many Medals you want to add : " );
        int add = Integer.parseInt(br.readLine());

        for (int i = 0; i < add; i++) {
            
            System.out.println("Medal Number : " +i);
            medals.add(br.readLine());

        }

        System.out.println("Your Medals are : " + medals);

        System.out.println("Do You wish to remove any Medal that you do not like : ");
        String store  = br.readLine();
        medals.remove(store);

        System.out.println("Your Updated List of Medals are :" +medals);
    }
}
