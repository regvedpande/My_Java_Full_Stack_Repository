package com.mkpits.set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class SetAccessingAddingIterating {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        Set<String>seasons = new HashSet<String>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many Seasons you want to add : " );
        int store = Integer.parseInt(br.readLine());

        for (int i = 0; i < store; i++) {
            
            System.out.println("Season Number" + i);
            seasons.add(br.readLine());
        }

        System.out.println("Your Seasons are : " +seasons);

        System.out.println("Check if the Particular Season is present or not : ");
        String check = br.readLine();
        System.out.println("Is Present : " + seasons.contains(check));

        seasons.forEach(System.out::println);


    }
}
