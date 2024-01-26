package com.mkpits.linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;

public class AnotherLinkedListUsingLambdaExpressions {
    public static void main(String[] args) throws IOException {
        LinkedList<String> mosquitokillercompanies = new LinkedList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of Mosquito Killer companies to add to the beginning of the list: ");
        int numcompaniesstarting = Integer.parseInt(br.readLine());

        for (int i = 0; i < numcompaniesstarting; i++) {
            System.out.println("Enter Mosquito Killer company to add to the beginning: ");
            mosquitokillercompanies.addFirst(br.readLine());
        }

        System.out.println("Mosquito Killer Companies in the list after adding to the beginning: " + mosquitokillercompanies);

        System.out.println("Enter the number of Mosquito Killer companies to add to the end of the list: ");
        int numcompaniesend = Integer.parseInt(br.readLine());

        for (int i = 0; i < numcompaniesend; i++) {
            System.out.println("Enter Mosquito Killer company to add to the end: ");
            mosquitokillercompanies.addLast(br.readLine());
        }

        System.out.println("Mosquito Killer Companies in the list after adding to the end: " + mosquitokillercompanies);

        System.out.println("Removing Mosquito Killer company from the beginning of the list.");
        mosquitokillercompanies.removeFirst();
        System.out.println("Mosquito Killer Companies in the list after removing from the beginning: " + mosquitokillercompanies);

        System.out.println("Removing Mosquito Killer company from the end of the list.");
        mosquitokillercompanies.removeLast();
        System.out.println("Mosquito Killer Companies in the list after removing from the end: " + mosquitokillercompanies);

        System.out.println("Get Mosquito Killer company at the beginning of the list: " + mosquitokillercompanies.getFirst());
        System.out.println("Get Mosquito Killer company at the end of the list: " + mosquitokillercompanies.getLast());

        // Lambda expression for printing each company
        System.out.println("Printing each Mosquito Killer company using Lambda expression:");
        mosquitokillercompanies.forEach(company -> System.out.println(company));

        // Sorting the list
        Collections.sort(mosquitokillercompanies);
        System.out.println("Mosquito Killer Companies in the list after sorting: " + mosquitokillercompanies);
    }
}
