package com.mkpits.hashset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class HashSetContains {
    public static void main(String[] args) throws NumberFormatException, IOException {
        HashSet<String> smartphones = new HashSet<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many smartphones you want to add to the cart :  ");
        int store = Integer.parseInt(br.readLine());

        for (int i = 0; i < store; i++) {
            
            System.out.println("Smartphone no : " +i);
            smartphones.add(br.readLine());

        }

        System.out.println("Added items are :" +smartphones);

        System.out.println("Enter the smartphone name to check if it is present in Added Items : ");
        String check = br.readLine();
        System.out.println("Is the Item present in the list : " + smartphones.contains(check));

        System.out.println("List of items : " +smartphones);

    }
}
