package com.mkpits.collectionframeworks;

import java.util.Arrays; 

 // Demonstrating Collections Framework:

//  Limitations of Arrays:

//  Fixed size: Once created, the size of an array cannot be changed.
//  Homogeneous elements: Arrays can only store elements of the same data type.
//  Limited operations: Basic operations like adding, removing, searching, and sorting require manual coding.
//  Benefits of Collections Framework:
 
//  Resizable: Collections can grow or shrink dynamically to accommodate your data needs.
//  Heterogeneous elements: Collections can store elements of different data types.
//  Ready-made methods: The framework provides built-in methods for common operations, saving you time and effort.
//  Variety of collection types: Choose from options like lists, sets, and maps, each with unique strengths and functionalities.

public class BasicProgramToExplainBehaviourofArray {

    public static void main(String[] args) {

        // **Demonstrating Arrays:**

        // Declare and initialize a fixed-size array of integers
        int[] numbers = {1, 4, 2, 8};

        // Access elements using index
        System.out.println("First element: " + numbers[0]);

        // Modify an element
        numbers[2] = 7;

        // Iterate through the array using a for-each loop (preferred for clarity)
        System.out.println("Array elements:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Print array contents using Arrays.toString() for convenience
        System.out.println("Array as string: " + Arrays.toString(numbers));

       
    }
}
