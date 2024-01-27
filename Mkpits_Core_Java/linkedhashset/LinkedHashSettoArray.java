package com.mkpits.linkedhashset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;

public class LinkedHashSettoArray {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        LinkedHashSet<String> lightcolour = new LinkedHashSet<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many Light Colours do you want: ");
        int store = Integer.parseInt(br.readLine());

        for (int i = 0; i < store; i++) {
            System.out.println("Enter Light Colour " +i);
            lightcolour.add(br.readLine());
        }

        System.out.println("List of Light Colours: " + lightcolour);

        Object[] photons = lightcolour.toArray(); 
  
        System.out.println("The array is:"); 

        for (int j = 0; j < photons.length; j++) 
            System.out.println(photons[j]); 
    } 
    }


