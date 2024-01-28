package com.mkpits.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueLambdaExpressions {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
         Queue<String>weathers = new PriorityQueue<String>();
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("How many weather you want to add in the Queue : " );
            int add = Integer.parseInt(br.readLine());
    
            for (int i = 0; i < add; i++) {
                
               System.out.println("Weather Number : " +i);
               weathers.add(br.readLine());

            }
    
            System.out.println("Your Icecream names are : " + weathers);

            System.out.println("Weathers in sorted form are : ");
            weathers.forEach((System.out::println));
    
    }
}
