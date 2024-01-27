package com.mkpits.sortedset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetAdd {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        SortedSet<String>emotions = new TreeSet<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the list of Emotions you are feeling : ");
        int store = Integer.parseInt(br.readLine());

        for (int i = 0; i < store; i++) {
            
            System.out.println("Emotions Number "+i);
            emotions.add(br.readLine());
        }

        System.out.println("Your Sorted List of Emotions are : " +emotions);
        
    }
}
