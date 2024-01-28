package com.mkpits.deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class DequeAdd {
    public static void main(String[] args) throws NumberFormatException, IOException {

        Deque<Integer> ages = new ArrayDeque<Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many ages you want to add : " );
        int add = Integer.parseInt(br.readLine());

        for (int i = 0; i < add; i++) {
            
            System.out.println("Age Number : " +i);
            ages.add(Integer.parseInt(br.readLine()));

        }

        System.out.println("Your Entered ages are : " + ages);



    }
}
