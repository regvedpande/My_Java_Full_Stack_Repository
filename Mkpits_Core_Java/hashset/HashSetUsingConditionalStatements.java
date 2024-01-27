package com.mkpits.hashset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class HashSetUsingConditionalStatements {
      
        public static void main(String[] args) throws NumberFormatException, IOException {
        
        HashSet<Integer> colourlightbulbs = new HashSet<Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How Colour Light Bulbs you want to add :  ");
        int add = Integer.parseInt(br.readLine());

        for (int i = 0; i < add; i++) {
            

            System.out.println("Colour Light Bulb Number : ");
            colourlightbulbs.add(Integer.parseInt(br.readLine()));

        }

        System.out.println("Colour Light Bulbs are : ");
        colourlightbulbs.forEach(System.out::println);

        for (int i = 0; i < add; i++) {
            
            if (colourlightbulbs.contains(i)) {
                
                System.out.println(i+ "is present in the set");
            } else {
                System.out.println(i+ "is not present in the set");
            }
        }
        
    }
}
