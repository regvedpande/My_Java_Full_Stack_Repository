package com.mkpits.deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class DequeAddFirstAndAddLast {
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        Deque<String> sports = new ArrayDeque<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many sports you want to add : " );
        int add = Integer.parseInt(br.readLine());

        for (int i = 0; i < add; i++) {
            
            System.out.println("Sports Name : " +i);
            sports.add(br.readLine());

        }

        System.out.println("Your Entered sports names are : " + sports);

        System.out.println("Do you wish to anything first : ");
        String firstname  = br.readLine();
        sports.addFirst(firstname);

        System.out.println("Do you wish to anything last : ");
        String lastname  = br.readLine();
        sports.addLast(lastname);

        System.out.println("Your updated sports  are : " +sports);
    }
}
