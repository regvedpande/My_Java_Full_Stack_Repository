package com.mkpits.array;

import java.util.Arrays;

public class SortedArray {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 4};
        Arrays.sort(numbers);

        System.out.println("Sorted array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
