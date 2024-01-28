package com.mkpits.deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class DequeOfferFirstAndLast {
    public static void main(String[] args) throws NumberFormatException, IOException {
        Deque<String> engineeringminors = new ArrayDeque<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many engineering minor you want to select : " );
        int add = Integer.parseInt(br.readLine());

        for (int i = 0; i < add; i++) {
            
            System.out.println("Engineering Minor Choice : " +i);
            engineeringminors.add(br.readLine());

        }

        System.out.println("Your preferences are : " + engineeringminors);

        System.out.println("Do you wish to add to the head of the Queue : ");
        String firstname  = br.readLine();
        engineeringminors.offerFirst(firstname);

        System.out.println("Do you wish to add to the tail of the Queue  : ");
        String lastname  = br.readLine();
        engineeringminors.offerLast(lastname);

        System.out.println("Your updated sports  are : " +engineeringminors);
        
    }
}
