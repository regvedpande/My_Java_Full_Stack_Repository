package com.mkpits.treeset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetAccessingElements {
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        Set<String> computerPeripherals = new TreeSet<String>();
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many Computer Peripherals you need: ");
        int store = Integer.parseInt(br.readLine());

        for (int i = 0; i < store; i++) {
            System.out.println("Computer Peripheral Number " + i);
            computerPeripherals.add(br.readLine());
        }

        System.out.println("List of Stored Peripherals are: " + computerPeripherals);
    
        System.out.println("Check if the peripheral is present or not: ");
        String check = br.readLine();
        boolean isPresent = computerPeripherals.contains(check);
        System.out.println("Peripheral is present: " + isPresent);
    }
}

