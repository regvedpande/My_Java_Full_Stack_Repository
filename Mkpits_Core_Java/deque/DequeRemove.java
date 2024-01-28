package com.mkpits.deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class DequeRemove {
    public static void main(String[] args) throws IOException {
        Deque<String> petnames = new ArrayDeque<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many petnames you want to add : " );
        int add = Integer.parseInt(br.readLine());

        for (int i = 0; i < add; i++) {
            
            System.out.println("Pet Name : " +i);
            petnames.add(br.readLine());

        }

        System.out.println("Your Entered petnames are : " + petnames);

        System.out.println("Do you wish to remove any pet name that you do not like : ");
        String name  = br.readLine();
        petnames.remove(name);

        System.out.println("Your Updated Pet Names are : " +petnames);
        
    }
}
