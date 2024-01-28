package com.mkpits.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueAdd {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        Queue<String>names = new PriorityQueue<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many names you want to add in the Queue : " );
        int add = Integer.parseInt(br.readLine());

        for (int i = 0; i < add; i++) {
            
            System.out.println("Name Number : " +i);
            names.add(br.readLine());
        }

        System.out.println("Your Entered names are : " +names);
        
    }
}
