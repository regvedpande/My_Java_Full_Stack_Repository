package com.mkpits.arraylist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayListAddGetSet {
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        ArrayList<Integer> luckynumbers = new ArrayList<Integer>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("How many Lucky Numbers you want to add : ");

        int store  = Integer.parseInt(br.readLine());

        System.out.println("Your Lucky Numbers are : ");

        for (int i = 0; i < store; i++) {
            
            luckynumbers.add(Integer.parseInt(br.readLine()));
            
        }

      
   
        System.out.println("Wrong Lucky Number at  index 2 is :" +luckynumbers.get(2));
        System.out.println("Replacing Wrong Lucky Number and setting '9' as lucky number at index 2 : " + luckynumbers.set(2, 9));
        System.out.println("Lucky Numbers are : " + luckynumbers);
       

    }
}
