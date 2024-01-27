package com.mkpits.hashset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class HashSetAdd {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        HashSet<String> fastfood = new HashSet<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many items you want to add to the cart :  ");
        int store = Integer.parseInt(br.readLine());

        for (int i = 0; i < store; i++) {
            
            System.out.println("Enter Fast Food item no : " +i);
            fastfood.add(br.readLine());

        }

        System.out.println("Added items are :" +fastfood);

    }
}
