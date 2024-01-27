package com.mkpits.treeset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetRemovingSpecificElement {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        Set<String> bigpharma = new TreeSet<String>();
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many Pharma items you want to buy :  ");
        int store = Integer.parseInt(br.readLine());

        for (int i = 0; i < store; i++) {
            System.out.println("Pharma Item Preference " + i);
            bigpharma.add(br.readLine());
        }

        bigpharma.removeIf(item -> item.equals("earbuds"));

        System.out.println("After Removing Specific Element we have " +bigpharma);

    }
}
