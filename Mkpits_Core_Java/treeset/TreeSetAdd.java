package com.mkpits.treeset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetAdd {
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        Set<String> years = new TreeSet<String>();
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many years you want to add : ");
        int store = Integer.parseInt(br.readLine());

        for (int i = 0; i < store; i++) {
            
            System.out.println("Year Number" +i);
            years.add(br.readLine());

        }

        System.out.println("List of Stored Years are : " +years);

    }
}
