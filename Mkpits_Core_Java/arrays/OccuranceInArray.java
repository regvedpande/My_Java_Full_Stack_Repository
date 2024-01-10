package com.mkpits.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OccuranceInArray {

    public static void main(String[] args) throws NumberFormatException, IOException {
        int[] numbers = {1, 2, 2, 3, 3, 3, 4, 4, 5, 5};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the element you want to check occurrence of: ");
        int searchElement = Integer.parseInt(br.readLine());

        int occurrence = getOccurrence(numbers, searchElement);

        System.out.println("Occurrences of " + searchElement + ": " + occurrence);
    }

    public static int getOccurrence(int[] numbers, int searchElement) {
        int occurrence = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchElement) {
                occurrence++;
            }
        }
        return occurrence;
    }
}








}
