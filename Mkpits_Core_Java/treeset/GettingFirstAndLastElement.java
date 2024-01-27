package com.mkpits.treeset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class GettingFirstAndLastElement {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        TreeSet<String> flavours = new TreeSet<String>();
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many flavours you need: ");
        int store = Integer.parseInt(br.readLine());

        for (int i = 0; i < store; i++) {
            System.out.println("Flavours Number " + i);
            flavours.add(br.readLine());
        }


        System.out.println("Elements are : " + flavours);
        System.out.println("First Element is : " + flavours.first());
        System.out.println("Last Element is : " + flavours.last());


    }
}
