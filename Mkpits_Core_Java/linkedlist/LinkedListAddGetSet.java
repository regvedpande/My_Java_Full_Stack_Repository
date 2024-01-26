package com.mkpits.linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class LinkedListAddGetSet {
        
    public static void main(String[] args) throws NumberFormatException, IOException {
        LinkedList<String> clothes = new LinkedList<String>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many Clothes you want to Buy : ");
        int cloth = Integer.parseInt(br.readLine());

        System.out.println("What Clothes did you like : ");
        for (int i = 0; i < cloth; i++) {
            System.out.println("Cloths Choice Number : " +i);
            clothes.add(br.readLine());
        }

        System.out.println(clothes);

        System.out.println("Which Clothes choice do you wish to remove : ");
        int value = Integer.parseInt(br.readLine());;
        clothes.remove(value);

        System.out.println("Enter the clothes that you want to add in place of that");
        clothes.add(value, br.readLine());

        clothes.get(value);

        System.out.println("So you want to Exchange any option : ");
        String store = br.readLine();
        clothes.set(value, store);
        
        System.out.println("Added Cloth is " +clothes);
        

        System.out.println(clothes);
    }
}
