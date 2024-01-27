package com.mkpits.sortedset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetContainsAllHashCode {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        SortedSet<String>cakeflavours = new TreeSet<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many cake flavours you want to add : " );
        int store = Integer.parseInt(br.readLine());

        for (int i = 0; i < store; i++) {
            
            System.out.println("Cake Number " + i);
            cakeflavours.add(br.readLine());

        }

        System.out.println("Your Sorted List of cakes are  : " +cakeflavours);


        SortedSet<String>anothercakeflavours = new TreeSet<String>();
        System.out.println("How many cake flavours you want to add anothertime : " );
        int anotherstore = Integer.parseInt(br.readLine());

        for (int i = 0; i < anotherstore; i++) {
            
            System.out.println("Cake Number " + i);
            anothercakeflavours.add(br.readLine());

        }

        System.out.println("Adding All Cakes : " + cakeflavours.addAll(anothercakeflavours));
        System.out.println("All Cakes are : " +cakeflavours);
        System.out.println("Hash Code of Cake are : " + cakeflavours.hashCode());
        
    }
}
