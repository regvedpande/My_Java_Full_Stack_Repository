package com.mkpits.linkedhashset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;

public class LinkedHashSetClear {
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        LinkedHashSet<String> height = new LinkedHashSet<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of people you want add Height for : ");
        int store = Integer.parseInt(br.readLine());

        for (int i = 0; i < store; i++) {
            System.out.println("Height of Person : " +i );
            height.add(br.readLine());
        }

        height.clear();
        System.out.println("Cancelling Height of all the people : " +height);


    }
}
