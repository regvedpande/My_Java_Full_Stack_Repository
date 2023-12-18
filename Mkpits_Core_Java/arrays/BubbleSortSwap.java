package com.mkpits.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BubbleSortSwap {

    public static void main(String[] args) throws NumberFormatException, IOException {
   
        int nums[] = new int[5];
        
     
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Prompt the user to enter 5 numbers
        System.out.println("Enter 5 Numbers:");

        // Read 5 numbers and store them in the array
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(reader.readLine());
        }
        

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        // Display the sorted array
        System.out.println("Sorted Numbers:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}