package com.mkpits.hashmap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class HashMapKeySet {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        HashMap<String, Integer> nameandpoints = new HashMap<String, Integer>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of entries: ");
        int range = Integer.parseInt(br.readLine());

        System.out.println("Enter the points and Name : ");

        for (int i = 0; i < range; i++) {
            System.out.println("Enter name: ");
            String name = br.readLine();

            System.out.println("Enter points: ");
            int points = Integer.parseInt(br.readLine());

            nameandpoints.put(name, points);
        }

        System.out.println("Printing HashMap entries:");
        
        for (String name : nameandpoints.keySet()) {
            System.out.println("Name: " + name + " Points: " + nameandpoints.get(name));
        }
    }
}
