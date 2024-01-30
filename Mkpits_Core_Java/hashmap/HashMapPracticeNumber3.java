package com.mkpits.hashmap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class HashMapPracticeNumber3 {

    public static void main(String[] args) throws NumberFormatException, IOException {

        HashMap<String, String> nameAndTheirZodiacSigns = new HashMap<String, String>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many Names you want to add : ");
        int store = Integer.parseInt(br.readLine());

        for (int i = 1; i <= store; i++) {

            System.out.println("Enter Name :");
            String name = br.readLine();

            System.out.println("Enter Zodiac Sign :");
            String zodiacsign = br.readLine();

            nameAndTheirZodiacSigns.put(name, zodiacsign);
        }

        System.out.println("HashMap : " + nameAndTheirZodiacSigns);

        System.out.println("Do you wish to remove any Name and Zodiac Sign : ");

        System.out.println("Enter key for the element to remove: ");
        String removeKey = br.readLine();
        nameAndTheirZodiacSigns.containsKey(removeKey);

        System.out.println("Updated HashMap : " + nameAndTheirZodiacSigns);
    }
}

