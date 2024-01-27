package com.mkpits.linkedhashset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Iterator;


public class LinkedHashSetUsingIterator {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        LinkedHashSet<String> food = new LinkedHashSet<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many food items you want to buy : ");
        int buy = Integer.parseInt(br.readLine());

        for (int i = 0; i < buy; i++) {
            System.out.println("Item Number One : " +i );
            food.add(br.readLine());
        }

        System.out.println("List of Food Items are : " + food);

        Iterator<String> iterator = food.iterator();
        
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
