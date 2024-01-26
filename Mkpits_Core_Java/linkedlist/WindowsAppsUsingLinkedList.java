package com.mkpits.linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;

public class WindowsAppsUsingLinkedList {
    public static void main(String[] args) throws IOException {
        LinkedList<String> windowsapps = new LinkedList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of Windows apps to add to the beginning of the list: ");
        int numappsstarting = Integer.parseInt(br.readLine());

        for (int i = 0; i < numappsstarting; i++) {
            System.out.println("Enter Windows app to add to the beginning: ");
            windowsapps.addFirst(br.readLine().toLowerCase());
        }

        System.out.println("Windows Apps in the list after adding to the beginning: " + windowsapps);

        System.out.println("Enter the number of Windows apps to add to the end of the list: ");
        int numappsend = Integer.parseInt(br.readLine());

        for (int i = 0; i < numappsend; i++) {
            System.out.println("Enter Windows app to add to the end: ");
            windowsapps.addLast(br.readLine().toLowerCase());
        }

        System.out.println("Windows Apps in the list after adding to the end: " + windowsapps);

        System.out.println("Removing Windows app from the beginning of the list.");
        windowsapps.removeFirst();
        System.out.println("Windows Apps in the list after removing from the beginning: " + windowsapps);

        System.out.println("Removing Windows app from the end of the list.");
        windowsapps.removeLast();
        System.out.println("Windows Apps in the list after removing from the end: " + windowsapps);

        System.out.println("Get Windows app at the beginning of the list: " + windowsapps.getFirst());
        System.out.println("Get Windows app at the end of the list: " + windowsapps.getLast());

        // Lambda expression for printing each app
        System.out.println("Printing each Windows app using Lambda expression:");
        windowsapps.forEach(app -> System.out.println(app));

        // Sorting the list
        Collections.sort(windowsapps);
        System.out.println("Windows Apps in the list after sorting: " + windowsapps);
    }
}

