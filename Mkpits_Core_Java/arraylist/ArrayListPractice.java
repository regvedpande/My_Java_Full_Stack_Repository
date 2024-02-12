package com.mkpits.arraylist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class ArrayListPractice {
    public static void main(String[] args) throws NumberFormatException, IOException {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the amount of Numbers you want to add : ");
        int store = Integer.parseInt(br.readLine());
        for (int i = 0; i < store; i++) {
            System.out.println("Enter Number : " + (i + 1));
            int storage = Integer.parseInt(br.readLine());
            numbers.add(storage);
        }
        System.out.println("Your Numbers are : " + numbers);

        ArrayList<Integer> anothernumbers = new ArrayList<Integer>();
        System.out.println("Enter the amount of Numbers you want to add another time : ");
        int anotherstore = Integer.parseInt(br.readLine());
        for (int i = 0; i < anotherstore; i++) {
            System.out.println("Enter Number : " + (i + 1));
            int anotherStorage = Integer.parseInt(br.readLine());
            anothernumbers.add(anotherStorage);
        }

        anothernumbers.retainAll(numbers);
        System.out.println("Common Numbers: " + anothernumbers);
        
        ArrayList<Integer> intersection = new ArrayList<>(new HashSet<>(anothernumbers));
        System.out.println("Unique Common Numbers: " + intersection);

        /*If there are at least two elements in the common set, sort them in descending order and retrieve the
         second element to find the second-largest; otherwise, print a message indicating there are not enough elements to determine the second-largest.*/
        if (intersection.size()>=2) {
            Collections.sort(intersection, Collections.reverseOrder());
            int secondlargest = intersection.get(1);
            System.out.println("Second Largest Element is : " +secondlargest);
        } else {
            System.out.println("Insufficient Elements to find Second Largest");
        }
    }
}
