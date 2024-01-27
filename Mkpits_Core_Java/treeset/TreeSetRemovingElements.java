package com.mkpits.treeset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetRemovingElements {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        Set<String> chocolates = new TreeSet<String>();
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many chocolates you want to buy ");
        int store = Integer.parseInt(br.readLine());

        for (int i = 0; i < store; i++) {
            System.out.println("Chocolate Preference " + i);
            chocolates.add(br.readLine());
        }


        System.out.println("Do you wish to remove any chocolate : ");
        String preference = br.readLine();
        System.out.println("List of Stored Peripherals are: " + chocolates.remove(preference));

        System.out.println("Your updated Preference for Chocolates : "+ chocolates);
        
    }
}
