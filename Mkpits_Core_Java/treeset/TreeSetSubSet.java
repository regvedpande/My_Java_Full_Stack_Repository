package com.mkpits.treeset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class TreeSetSubSet {
    public static void main(String[] args) throws NumberFormatException, IOException {

        TreeSet<String> plants = new TreeSet<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("How many plants do you need: ");
        int store = Integer.parseInt(br.readLine());

        for (int i = 0; i < store; i++) {
            System.out.print("Enter plant name for plant number " +i);
            plants.add(br.readLine());
        }

        System.out.println("Your plants are: " + plants);

        TreeSet<String> anotherplants = new TreeSet<>();
        System.out.print("From which element do you want to set from: ");
        String fromelement = br.readLine();

        System.out.print("Up to which element do you want: ");
        String toelement = br.readLine();

        anotherplants = new TreeSet<>(plants.subSet(fromelement, toelement));

        System.out.println("Your range of elements are: " + anotherplants);
    }
}
