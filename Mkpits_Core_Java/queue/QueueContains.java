package com.mkpits.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueContains {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        Queue<String>fooditems = new PriorityQueue<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many food items you want to add in the Queue : " );
        int add = Integer.parseInt(br.readLine());

        for (int i = 0; i < add; i++) {
            
            System.out.println("Food Item Number : " +i);
            fooditems.add(br.readLine());
        }

        System.out.println("Your Entered names are : " + fooditems);

        System.out.println("Enter the Item that you want to check : ");
        String check = br.readLine();
        System.out.println("Is it equal : " + fooditems.contains(check));

    }
}
