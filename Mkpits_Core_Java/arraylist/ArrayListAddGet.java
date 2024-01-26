package com.mkpits.arraylist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayListAddGet {
    
    public static void main(String[] args) throws IOException {

        ArrayList<String> watchcompanies = new ArrayList<String>();
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many watchmaker names you want to add : ");
        Integer names = Integer.parseInt(br.readLine());
       
        System.out.println("Enter the Watchmaker Names : ");

        for (int i = 0; i < names; i++) {
            
            watchcompanies.add(br.readLine());

        }

        System.out.println("Names of Watchmakers are : " + watchcompanies);
        
        System.out.println("Getting the watchmaker from second index : " + watchcompanies.get(2));
    }
}
