package com.mkpits.hashset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class IteratingThroughHashSet {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        HashSet<Integer> ludo = new HashSet<Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many Ludo Probabilities you want to add :  ");
        int add = Integer.parseInt(br.readLine());

        for (int i = 0; i < add; i++) {
            

            System.out.println("Enter" +i+ "Probability : " );
            ludo.add(Integer.parseInt(br.readLine()));

        }

        System.out.println("Added Ludo Probabilities are : ");
        ludo.forEach(System.out::println);
        
    }
}
