package com.mkpits.linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class LinkedListAddGet {
    public static void main(String[] args) throws IOException {

        LinkedList<String> wildanimals = new LinkedList<String>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of Wild Animals that you want to add : ");
        int storeanimals = Integer.parseInt(br.readLine());

        System.out.println("Enter the Names of Wild Animals one by one: ");
        for (int i = 0; i < storeanimals; i++) {
            System.out.println("Wild Animal Number " + i + ":");
            wildanimals.add(br.readLine());
        }

        System.out.println("Wild Animals are : " + wildanimals);

        wildanimals.forEach(wild -> System.out.println(wild));
        System.out.println(wildanimals.getFirst() + "is First " + wildanimals.getLast() + "is Last");

    }
}

