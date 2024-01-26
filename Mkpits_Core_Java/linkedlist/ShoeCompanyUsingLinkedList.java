package com.mkpits.linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;

public class ShoeCompanyUsingLinkedList {
    public static void main(String[] args) throws IOException {
        LinkedList<String> shoecompanies = new LinkedList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of shoe companies to add to the beginning of the list: ");
        int numcompaniesstarting = Integer.parseInt(br.readLine());

        for (int i = 0; i < numcompaniesstarting; i++) {
            System.out.println("Enter shoe company to add to the beginning: ");
            shoecompanies.addFirst(br.readLine().toLowerCase());
        }

        System.out.println("Shoe Companies in the list after adding to the beginning: " + shoecompanies);

        System.out.println("Enter the number of shoe companies to add to the end of the list: ");
        int numcompaniesend = Integer.parseInt(br.readLine());

        for (int i = 0; i < numcompaniesend; i++) {
            System.out.println("Enter shoe company to add to the end: ");
            shoecompanies.addLast(br.readLine().toLowerCase());
        }

        System.out.println("Shoe Companies in the list after adding to the end: " + shoecompanies);

        System.out.println("Removing shoe company from the beginning of the list.");
        shoecompanies.removeFirst();
        System.out.println("Shoe Companies in the list after removing from the beginning: " + shoecompanies);

        System.out.println("Removing shoe company from the end of the list.");
        shoecompanies.removeLast();
        System.out.println("Shoe Companies in the list after removing from the end: " + shoecompanies);

        System.out.println("Get shoe company at the beginning of the list: " + shoecompanies.getFirst());
        System.out.println("Get shoe company at the end of the list: " + shoecompanies.getLast());

        // Lambda expression for printing each company
        System.out.println("Printing each shoe company using Lambda expression:");
        shoecompanies.forEach(company -> System.out.println(company));

        // Sorting the list
        Collections.sort(shoecompanies);
        System.out.println("Shoe Companies in the list after sorting: " + shoecompanies);
    }
}

