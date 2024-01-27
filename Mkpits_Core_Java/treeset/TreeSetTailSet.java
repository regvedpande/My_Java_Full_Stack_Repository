package com.mkpits.treeset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class TreeSetTailSet {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        TreeSet<String> planets = new TreeSet<String>();
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many Planets you want to add : ");
        int store = Integer.parseInt(br.readLine());

        for (int i = 0; i < store; i++) {
            
            System.out.println("Planet Number" +i);
            planets.add(br.readLine());

        }

        System.out.println("List of Stored Years are : " +planets);

        System.out.println("From which planet you want the list from : ");
        String element = br.readLine();

        TreeSet<String> rangeplanets = (TreeSet<String>)planets.tailSet(element);
        System.out.println("Your Range is : " + rangeplanets);
    }
}
