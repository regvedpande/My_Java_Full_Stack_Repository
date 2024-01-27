package com.mkpits.set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class SetIteratingThroughASet {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
         Set<String>laptops = new HashSet<String>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many Laptops you want to buy : " );
        int store = Integer.parseInt(br.readLine());

        for (int i = 0; i < store; i++) {
            
            System.out.println("Laptop Number" + i);
            laptops.add(br.readLine());
        }
        
        System.out.println("Your Laptops are : ");
        for (String string : laptops) {
            System.out.println(string);
        }
    }
}
