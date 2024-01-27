package com.mkpits.sortedset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetRemoving {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        SortedSet<String>pincodes = new TreeSet<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many Pin Codes you want to add : " );
        int store = Integer.parseInt(br.readLine());

        for (int i = 0; i < store; i++) {
            
            System.out.println("PinCode Number " + i);
            pincodes.add(br.readLine());

        }

        System.out.println("Your Sorted List of Pin Codes are : " + pincodes);

        System.out.println("Do you wish to remove any PinCode : ");
        String remove = br.readLine();
        System.out.println("Is the PinCode you entered got removed : " + pincodes.remove(remove));

        System.out.println("Your Sorted List of Pin Codes after removal are : " + pincodes);

    }
}
