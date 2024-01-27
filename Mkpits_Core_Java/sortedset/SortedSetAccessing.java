package com.mkpits.sortedset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetAccessing {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        SortedSet<String>shoecompanies = new TreeSet<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many Shoes Companies you want to add : ");
        int store = Integer.parseInt(br.readLine());

        for (int i = 0; i < store; i++) {
            
            System.out.println("Shoe Company Number " +i);
            shoecompanies.add(br.readLine());

        }

        System.out.println("Your Sorted List of Shoe Companies are : " + shoecompanies);

        System.out.println("Enter the Shoe company you like : ");
        String access = br.readLine();
        System.out.println("Shoe List contains the mentioned Shoe : " + shoecompanies.contains(access));
  
    }
}
