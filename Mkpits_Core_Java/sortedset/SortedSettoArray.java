package com.mkpits.sortedset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSettoArray {
    public static void main(String[] args) throws NumberFormatException, IOException {

        SortedSet<String> guest = new TreeSet<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of guests you want to invite to the wedding: ");
        int store = Integer.parseInt(br.readLine());

        for (int i = 0; i < store; i++) {
            System.out.println("Guest Number " + (i + 1));
            guest.add(br.readLine());
        }

        System.out.println("Your Sorted List of Guests are: " + guest);

        String[] convert = guest.toArray(new String[0]);
        System.out.println("Your Arrays are : " +Arrays.toString(convert));
    }
}

