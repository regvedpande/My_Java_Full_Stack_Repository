package com.mkpits.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueRemove {
    
        
        public static void main(String[] args) throws NumberFormatException, IOException {
        
            Queue<String>places = new PriorityQueue<String>();
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("How many places you want to add in the Queue : " );
            int add = Integer.parseInt(br.readLine());
    
            for (int i = 0; i < add; i++) {
                
               System.out.println("Place Number : " +i);
               places.add(br.readLine());

            }
    
            System.out.println("Your Places names are : " + places);
            
            System.out.println("Do you wish to remove any Places from the List : ");
            String remove  = br.readLine();
            places.remove(remove);

            System.out.println("After Removing Places we have : " + places);

            System.out.println("Removing First Element : " + places.poll());

            System.out.println("After removing Places from the front we have : " + places);

            
        }
    }

