package com.mkpits.sortedset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.SortedSet;
import java.util.Spliterator;
import java.util.TreeSet;

public class AnotherSortedSetUsingSpliterator {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        SortedSet<String>monitorsize = new TreeSet<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many monitors you want to buy ");
        int store = Integer.parseInt(br.readLine());

        for (int i = 0; i < store; i++) {
            
            System.out.println("Monitor Number "+i);
            monitorsize.add(br.readLine());

        }

        System.out.println("Your List of Monitors are : " + monitorsize);

        System.out.println("Monitors in sorted form are : ");

        Spliterator<String> monitorgetsize = monitorsize.spliterator();
        monitorgetsize.forEachRemaining(System.out::println);

		System.out.println("Characteristics of Monitors:" + monitorgetsize.characteristics());

		System.out.println("Estimate Size of the Monitors:" + monitorgetsize.estimateSize());

		System.out.println("Exact Size of the Monitors:" + monitorgetsize.getExactSizeIfKnown());

		System.out.println("Characteristics of the Monitors :" +monitorgetsize.hasCharacteristics(2));

    }
}
