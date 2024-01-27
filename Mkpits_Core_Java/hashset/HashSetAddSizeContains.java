package com.mkpits.hashset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class HashSetAddSizeContains {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        HashSet<String> furniture = new HashSet<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many Furnitures you want to buy :  ");
        int store = Integer.parseInt(br.readLine());

        for (int i = 0; i < store; i++) {
            
            System.out.println("Display Panel no : " +i);
            furniture.add(br.readLine());

        }

        System.out.println("Added Furnitures are : " +furniture);
        System.out.println("Size of Furniture Items : " +furniture.size());

        System.out.println("What you want to check in the Added Furnitures : ");
        String check = br.readLine();
        System.out.println("Is the Item present in the list : " + furniture.contains(check));

        System.out.println("List of Added Furnitures : " +furniture);
        
    }
}
