package com.mkpits.deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Spliterator;

public class DequeSpliterator {
    public static void main(String[] args) throws IOException {
        
        Deque<String> bikes = new ArrayDeque<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many Bikes you want to buy : " );
        int add = Integer.parseInt(br.readLine());

        for (int i = 0; i < add; i++) {
            
            System.out.println("Bike Name : " +i);
            bikes.add(br.readLine());

        }

        System.out.println("Your Entered petnames are : " + bikes);

        Spliterator<String> split = bikes.spliterator();
        split.forEachRemaining(System.out::println);
        
    }
}
