package com.mkpits.hashset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class HashSetIterateAddSizeContainsConditional {
    public static void main(String[] args) throws NumberFormatException, IOException {
        HashSet<String> chemical = new HashSet<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many number of Chemicals you want to buy :  ");
        int store = Integer.parseInt(br.readLine());

        for (int i = 0; i < store; i++) {
            
            System.out.println("Chemical no : " +i);
            chemical.add(br.readLine());

        }

        System.out.println("Added display panels are :" +chemical);

        System.out.println("Do you wish to add any Chemical in the List : ");
        String addon = br.readLine();
        System.out.println("Added Chemical : " + chemical.add(addon));

        System.out.println("Number of Chemical Items Added : " +chemical.size());

        System.out.println("Check any Chemical Item : ");
        String check = br.readLine();
        System.out.println("Is the Item present in the list : " + chemical.contains(check));

        for (String item : chemical) {
            if (chemical.contains(item)) {
                System.out.println(item + " is Present");
            } else {
                System.out.println(item + " is not Present");
            }
        }
        System.out.println("List of items : " +chemical);
    }
}
