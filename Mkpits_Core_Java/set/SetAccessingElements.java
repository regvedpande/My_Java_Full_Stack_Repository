package com.mkpits.set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class SetAccessingElements {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        Set<String>cities = new HashSet<String>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many Cities you want to add : " );
        int store = Integer.parseInt(br.readLine());

        for (int i = 0; i < store; i++) {
            
            System.out.println("City Number : " +i);
            cities.add(br.readLine());
        }

        System.out.println("Your List of Cities are : " +cities);

        System.out.println("Enter the City amongst the set above that you want to check if it is present or not : ");
        String check = br.readLine();
        System.out.println(cities.contains(check));

       
}
}
