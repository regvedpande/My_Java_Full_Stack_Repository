package com.mkpits.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayConcepts {

    public static void main(String[] args) throws IOException {

        // Declaration of Array
        int[] iterate;
        int rotate[];

        // Construction of Array
        iterate = new int[10];
        rotate = new int[5];

        double price[] = new double[4];

        // Assign values to elements in the array
        price[0] = 12.4;
        price[1] = 34.8;
        price[2] = 90.78;

        // Get the length of the array
        int l = price.length;
        System.out.println("Length of price array: " + l);

        // Print elements of the array using a loop
        for (int i = 0; i < price.length; i++) {
            System.out.println("Element at index " + i + ": " + price[i]);
        }

        // Initializing an array with values
        String name[] = new String[]{"Regved", "Ayush", "Sarvesh"};
        int pinCode[] = {440034, 440030, 33214, 440024};

        // Print elements of the array using a loop
        for (int i = 0; i < pinCode.length; i++) {
            System.out.println("Pin Code at index " + i + ": " + pinCode[i]);
        }

        // Reading input from the user to populate an array
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 5 names");
        String names[] = new String[5];

        // Input: Reading names from the user
        for (int i = 0; i < names.length; i++) {
            names[i] = reader.readLine();
        }

        // Output: Printing names using a loop
        for (int i = 0; i < names.length; i++) {
            System.out.println("Name at index " + i + ": " + names[i]);
        }
    }
}

		