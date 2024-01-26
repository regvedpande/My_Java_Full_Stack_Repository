package com.mkpits.linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class LinkedListGetRemove {
    public static void main(String[] args) throws IOException {

        LinkedList<String> perfumes = new LinkedList<String>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of Perfumes that you want to Buy : ");
        int number = Integer.parseInt(br.readLine());

        System.out.println("Enter the perfumes that you like : ");

        for (int i = 0; i < number; i++) {
            System.out.println("Perfume Number " + i + ":");
            perfumes.add(br.readLine());
        }

        System.out.println("List of Perfumes are : " + perfumes);

        System.out.println("Which perfume amongst the list you don't like : ");
        perfumes.remove(br.readLine());

        System.out.println("Do You wish to add any other Perfume in exchange of that : ");
        String add = br.readLine();
        perfumes.add(add);

      System.out.println(perfumes);
        

    }
}