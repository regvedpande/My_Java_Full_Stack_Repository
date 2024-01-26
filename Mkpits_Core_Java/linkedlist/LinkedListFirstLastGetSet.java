package com.mkpits.linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class LinkedListFirstLastGetSet {
    public static void main(String[] args) throws IOException {
        LinkedList<String> planets = new LinkedList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many planets do you want to add to the list: ");
        int planetsrange = Integer.parseInt(br.readLine());

        for (int i = 0; i < planetsrange; i++) {
            System.out.println("Planet " +i);
            planets.add(br.readLine());
        }

        System.out.println("Planets in the list: " + planets);

        System.out.println("First planet: " + planets.getFirst());
        System.out.println("Last planet: " + planets.getLast());

        System.out.println("Enter the index to get a planet: ");
        int getIndex = Integer.parseInt(br.readLine());
        System.out.println("Planet at index " + getIndex );

        System.out.println("Enter the index to set a planet: ");
        int setIndex = Integer.parseInt(br.readLine());
        planets.set(setIndex, br.readLine());
        System.out.println("Updated list of planets: " + planets);
    }
}
