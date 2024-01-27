package com.mkpits.hashset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class HashSetSize {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        HashSet<Integer> numbers = new HashSet<Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many Numbers you want to add :  ");
        int add = Integer.parseInt(br.readLine());

        for (int i = 0; i < add; i++) {
            

            System.out.println("Enter" +i+ "Number : " );
            numbers.add(Integer.parseInt(br.readLine()));
           
            
        }

        System.out.println("Added Numbers are :" +numbers);
        System.out.println("Size of the Added Numbers are : " +numbers.size());
    }
}
