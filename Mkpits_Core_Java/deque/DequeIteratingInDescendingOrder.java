package com.mkpits.deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeIteratingInDescendingOrder {

    public static void main(String[] args) throws NumberFormatException, IOException {
        
        Deque<String> shoenames = new ArrayDeque<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many shoes you want to buy : " );
        int add = Integer.parseInt(br.readLine());

        for (int i = 0; i < add; i++) {
            
            System.out.println("Shoe Name : " +i);
            shoenames.add(br.readLine());

        }

        System.out.println("Your Entered shoenames are : " + shoenames);

        System.out.println("Iterating Shoe Names in descending order : ");
        Iterator<String> iterate = shoenames.descendingIterator();
        while (iterate.hasNext()) {
        System.out.println(iterate.next());
}
    }
        
}
