package com.mkpits.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Spliterator;

public class QueueSpliterator {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
         Queue<String>weapons = new PriorityQueue<String>();
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("How many Weapons you want to add in the Queue : " );
            int add = Integer.parseInt(br.readLine());
    
            for (int i = 0; i < add; i++) {
                
               System.out.println("Weapon Number : " +i);
               weapons.add(br.readLine());

            }
    
            System.out.println("Your Weapons names are : " + weapons);

            System.out.println("Using Spliterator we have :");
            Spliterator<String> split = weapons.spliterator();
            split.forEachRemaining(System.out::println);

    }
}
