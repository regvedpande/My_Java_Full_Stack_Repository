package com.mkpits.linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class LinkedListObjecttoArray {
    public static void main(String[] args) throws IOException {

        LinkedList<String> apexpredators = new LinkedList<String>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many Apex Predators you want to add the List : ");
        int store = Integer.parseInt(br.readLine());

        for (int i = 0; i < store; i++) {
            System.out.println("Apex Predator " +i);
            apexpredators.add(br.readLine());
        }

        Object[] toarray = apexpredators.toArray();
        System.out.println("LinkedList as Array we get ");

        for (Object predator : toarray) {
            System.out.println(predator);
        }
    }
}

