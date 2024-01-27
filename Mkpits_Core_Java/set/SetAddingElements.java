package com.mkpits.set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class SetAddingElements {
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        Set<String>birds = new HashSet<String>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many Birds you want to add : " );
        int store = Integer.parseInt(br.readLine());

        for (int i = 0; i < store; i++) {
            
            System.out.println("Bird Number : " +i);
            birds.add(br.readLine());
        }
        
        System.out.println("Your Sets of Birds are : " );
        for (String string : birds) {
            System.out.println(string);
        }

    }
}
