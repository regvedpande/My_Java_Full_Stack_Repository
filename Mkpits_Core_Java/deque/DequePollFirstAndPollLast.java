package com.mkpits.deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class DequePollFirstAndPollLast {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        Deque<String> places = new ArrayDeque<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many places you want to add : " );
        int add = Integer.parseInt(br.readLine());

        for (int i = 0; i < add; i++) {
            
            System.out.println("Places Name : " +i);
            places.add(br.readLine());

        }

        System.out.println("Your Entered places names are : " + places);

        System.out.println("Polling First Element : " + places.pollFirst());
        System.out.println("PollingLast Element : " + places.pollLast());

        System.out.println("Your Entered places names are : " + places);
    }
}
