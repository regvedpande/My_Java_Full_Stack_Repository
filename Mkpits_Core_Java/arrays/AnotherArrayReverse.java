package com.mkpits.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnotherArrayReverse {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number : ");
        int n = Integer.parseInt(br.readLine());

        int reversedNumber = 0;
        int tempNumber;
        int count = 0;

        // Reverse the number initially
        while (n > 0) {
            reversedNumber = reversedNumber * 10 + n % 10;
            n /= 10;
        }

        // Repeat the process 4 times
        while (count < 4) {
            tempNumber = reversedNumber;
            reversedNumber = 0;

            // Move the last digit to the front
            while (tempNumber > 0) {
                reversedNumber = reversedNumber * 10 + tempNumber % 10;
                tempNumber /= 10;
            }

            System.out.println("Modified Number: " + reversedNumber);
            count++;
        }
    }
}
