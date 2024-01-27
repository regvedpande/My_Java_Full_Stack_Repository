package com.mkpits.treeset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetIsEmpty {
    public static void main(String[] args) throws IOException {

        Set<String> lengths = new TreeSet<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of lengths you want to add : ");
        int store = Integer.parseInt(br.readLine());

        for (int i = 0; i < store; i++) {
            System.out.println("Length Preferences " + i);
            lengths.add(br.readLine());
            System.out.println("Checking if the set is empty or not : " + lengths.isEmpty());
        }

    }
}

