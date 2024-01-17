package com.mkpits.collectionframeworks;



// Arrays

// Fixed size: Once you create an array, you can't change its size.
// Not recommended for memory usage: Arrays can be less memory-efficient than collections because they allocate memory for all elements at once, even if you don't use all of them.
// Not recommended for performance: Arrays can be slower than collections for some operations, such as adding or removing elements.
// Can only hold homogeneous data types: All elements in an array must be of the same data type, such as all integers or all strings.
// No underlying data structure: Arrays don't have an underlying data structure, so you don't have access to ready-made methods for common operations.
// Can hold both primitive and object types: Arrays can store both primitive data types (like integers and booleans) and object types (like custom classes).

// Collections

// Growable size: You can add or remove elements from a collection as needed.
// Recommended for memory usage: Collections are more memory-efficient than arrays because they only allocate memory for the elements you actually use.
// Recommended for performance: Collections are generally faster than arrays for most operations.
// Can hold both homogeneous and heterogeneous data types: Some collections can hold elements of different data types.
// Based on data structures: Collections are implemented using underlying data structures such as linked lists or trees, which provide ready-made methods for common operations.
// Can only hold object types: Collections cannot store primitive data types directly.

import java.util.Arrays;
import java.util.ArrayList;

public class DifferenceBetweenArrayAndCollection {
    
//Array Usage   
int[] numbers = new int[5]; // Array of 5 integers
numbers[0] = 10;
numbers[1] = 20;
System.out.println(numbers[2]); // Accessing elements

//Collection Usage
ArrayList<String> names = new ArrayList<>(); // Collection of strings
names.add("Alice");
names.add("Bob");

names.remove(0); // Removing elements
System.out.println(names.size()); // Checking size

}
