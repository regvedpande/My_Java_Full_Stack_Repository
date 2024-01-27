package com.mkpits.linkedhashset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;

public class LinkedHashSetAddToArrayIterate {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        LinkedHashSet<Integer> pens = new LinkedHashSet<Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many Pens you want to buy : ");
        int store = Integer.parseInt(br.readLine());

        for (int i = 0; i < store; i++) {
            System.out.println("Pens Number : " +i );
            pens.add(Integer.parseInt(br.readLine()));
        }

        System.out.println("Pens are : " +pens);

        //Here i have Declared and Initialised the Array as Integer
        Integer[] list = pens.toArray(new Integer[0]);

        System.out.println("The array is:");

        for (int j = 0; j < list.length; j++) {
            System.out.println(list[j]);
    }
}
}
