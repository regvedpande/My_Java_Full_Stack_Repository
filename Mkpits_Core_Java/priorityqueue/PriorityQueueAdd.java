package com.mkpits.priorityqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class PriorityQueueAdd {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        PriorityQueue<String> ecommerce = new PriorityQueue<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many E - Commerce Companies you want to add : " );
        int add = Integer.parseInt(br.readLine());

        for (int i = 0; i < add; i++) {
            
            System.out.println("E Commerce Company Number : " +i);
            ecommerce.add(br.readLine());

        }

        System.out.println("Your E Commerce Companies are : " + ecommerce);
    }
}
