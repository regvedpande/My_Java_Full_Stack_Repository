package com.mkpits.hashset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class HashSetContainsSizeIterate {
    
    public static void main(String[] args) throws IOException {
        
         HashSet<String> pets = new HashSet<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many pets you want to adapt :  ");
        int store = Integer.parseInt(br.readLine());

        for (int i = 0; i < store; i++) {
            
            System.out.println("Pet no : " +i);
            pets.add(br.readLine());

        }

        System.out.println("Added display panels are :" +pets);

        System.out.println("Enter the pet you want check ");
        String check = br.readLine();
        System.out.println("Is the pet present : " + pets.contains(check));

        System.out.println("List of Pets : " +pets);
    }
}
