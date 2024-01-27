package com.mkpits.sortedset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetSubSet {
    public static void main(String[] args) throws NumberFormatException, IOException {

        SortedSet<String> weapons = new TreeSet<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of weapons you want to add: ");
        int store = Integer.parseInt(br.readLine());

        for (int i = 0; i < store; i++) {
            System.out.println("Weapon Number " + (i + 1));
            weapons.add(br.readLine());
        }

        System.out.println("Your Sorted List of Weapons are: " + weapons);

        System.out.println("Enter the first Element: ");
        String element1 = br.readLine();

        System.out.println("Enter the last Element: ");
        String element2 = br.readLine();

        SortedSet<String> sort = weapons.subSet(element1, element2);
        System.out.println("Range of Set is " + sort);
    }
}
