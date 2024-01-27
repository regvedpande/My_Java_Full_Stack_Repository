package com.mkpits.hashset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class HashSetAddIterateContains {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        HashSet<String> displaypanels = new HashSet<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many display panels you want to add to the cart :  ");
        int store = Integer.parseInt(br.readLine());

        for (int i = 0; i < store; i++) {
            
            System.out.println("Display Panel no : " +i);
            displaypanels.add(br.readLine());

        }

        System.out.println("Added display panels are :" +displaypanels);

        System.out.println("Enter the display panel to check in Added Items : ");
        String check = br.readLine();
        System.out.println("Is the Item present in the list : " + displaypanels.contains(check));

        System.out.println("List of items : " +displaypanels);
    }
}
