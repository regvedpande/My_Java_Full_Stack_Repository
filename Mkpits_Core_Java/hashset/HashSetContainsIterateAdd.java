package com.mkpits.hashset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class HashSetContainsIterateAdd {
    public static void main(String[] args) throws IOException {
        HashSet<String> seavehicles = new HashSet<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many Sea Vehicles you want :  ");
        int store = Integer.parseInt(br.readLine());

        for (int i = 0; i < store; i++) {
            
            System.out.println("Sea Vehicle no : " +i);
            seavehicles.add(br.readLine());

        }

        seavehicles.forEach(System.out::println);

        System.out.println("Added items are :" +seavehicles);

        System.out.println("Do you wish to add more sea vehicles in Added Items : ");
        String add = br.readLine();
        System.out.println("Is the Item present in the list : " + seavehicles.add(add));

        System.out.println("List of items : " +seavehicles);

    }
}
