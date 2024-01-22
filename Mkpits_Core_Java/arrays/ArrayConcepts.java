package com.mkpits.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArrayConcepts {

    public static void main(String[] args) {
        // Declaration of Array
        int[] iterate = new int[10];
        System.out.println(iterate);

        int rotate[] = new int[10];
        System.out.println(rotate);

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

        // Enhanced for loop (for-each loop) for array traversal
        System.out.println("Using enhanced for loop to print names:");
        for (String n : name) {
            System.out.println(n);
        }

        // Arrays class utility methods
        int[] numbers = {5, 1, 9, 3, 7};
        Arrays.sort(numbers); // Sort the array in ascending order
        System.out.println("Sorted numbers: " + Arrays.toString(numbers));

        // Multidimensional array
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Printing elements of the 2D array:");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        // Dynamic initialization of array
        int dynamicSize = 3;
        int[] dynamicArray = new int[dynamicSize];
        System.out.println("Enter " + dynamicSize + " elements for dynamicArray:");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            for (int i = 0; i < dynamicSize; i++) {
                dynamicArray[i] = Integer.parseInt(reader.readLine());
            }

            // Output: Printing dynamicArray using a loop
            System.out.println("Elements in dynamicArray:");
            for (int i : dynamicArray) {
                System.out.print(i + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

		
		