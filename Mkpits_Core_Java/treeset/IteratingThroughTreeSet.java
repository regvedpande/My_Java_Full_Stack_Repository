package com.mkpits.treeset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class IteratingThroughTreeSet {
    public static void main(String[] args) throws NumberFormatException, IOException {
        Set<String> musiccategory = new TreeSet<String>();
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many Music Categories you want to add :  ");
        int store = Integer.parseInt(br.readLine());

        for (int i = 0; i < store; i++) {
            System.out.println("Music Category Preference " + i);
            musiccategory.add(br.readLine());
        }

        
        Iterator<String> list = musiccategory.iterator();
        System.out.println("Iterating : ");

        while (list.hasNext()) {
           String category = list.next();
            System.out.println(category);
        }

    }
}
