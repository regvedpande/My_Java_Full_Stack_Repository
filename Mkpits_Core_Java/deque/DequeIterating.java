package com.mkpits.deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeIterating {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        Deque<String> perfumenames = new ArrayDeque<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many perfumes you want to buy : " );
        int add = Integer.parseInt(br.readLine());

        for (int i = 0; i < add; i++) {
            
            System.out.println("Perfume Name : " +i);
            perfumenames.add(br.readLine());

        }

        System.out.println("Your Entered petnames are : " + perfumenames);

        System.out.println("Iterating Perfume Names : ");
        Iterator<String> iterate = perfumenames.iterator();
        while (iterate.hasNext()) {
            System.out.println(iterate.next());
        }

    }
}
