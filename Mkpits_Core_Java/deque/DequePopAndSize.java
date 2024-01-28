package com.mkpits.deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class DequePopAndSize {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        Deque<String> computerscience = new ArrayDeque<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many computer science subjects you want to choose : " );
        int add = Integer.parseInt(br.readLine());

        for (int i = 0; i < add; i++) {
            
            System.out.println("Shoe Name : " +i);
            computerscience.add(br.readLine());

        }

        System.out.println("Your Entered Computer Science subjects are : " + computerscience);

        System.out.println("Removing subject as i am not interested in them : " +computerscience.pop());

        System.out.println("Size of your Computer Science subjects are : " + computerscience.size());

        System.out.println("Your Entered Computer Science subjects are : " + computerscience);


    }
}
