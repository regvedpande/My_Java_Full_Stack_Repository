package com.mkpits.set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class SetRemovingEelements {
    public static void main(String[] args) throws NumberFormatException, IOException {
         Set<String>touristattractions = new HashSet<String>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many Tourist Attractions you want to add : " );
        int store = Integer.parseInt(br.readLine());

        for (int i = 0; i < store; i++) {
            
            System.out.println("Tourist Attraction Number : " +i);
            touristattractions.add(br.readLine());
        }

        System.out.println("Your choice of Tourist Attractions are : " +touristattractions);

        System.out.println("Is there any Tourist Attraction you want to remove : ");
        String remove = br.readLine();
        System.out.println("Your Removed Tourist Attraction is : " + touristattractions.remove(remove));
        System.out.println(touristattractions);

    }
}
