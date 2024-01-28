package com.mkpits.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueHashCode {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        Queue<String>bodyparts = new PriorityQueue<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many Body Parts you want to check  : " );
        int add = Integer.parseInt(br.readLine());

        for (int i = 0; i < add; i++) {
            
        System.out.println("Body Part Number : " +i);
           bodyparts.add(br.readLine());
        }

        System.out.println("Your Entered names are : " + bodyparts);
        System.out.println("HashCode of Body Parts are : " + bodyparts.hashCode());
    }
}
