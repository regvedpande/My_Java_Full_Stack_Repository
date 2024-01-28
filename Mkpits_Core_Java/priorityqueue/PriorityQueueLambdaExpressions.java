package com.mkpits.priorityqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class PriorityQueueLambdaExpressions {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        PriorityQueue<String> rivers = new PriorityQueue<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many Rivers you want to add : " );
        int add = Integer.parseInt(br.readLine());

        for (int i = 0; i < add; i++) {
            
            System.out.println("River Number : " +i);
            rivers.add(br.readLine());

        }

        System.out.println("Your List of Rivers are : " + rivers);

        System.out.println("After Iteration we get : ");
        rivers.forEach(System.out::println);
    }
}
