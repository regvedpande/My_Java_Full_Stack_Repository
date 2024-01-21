package com.mkpits.loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeNumber {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number : ");
        int store = Integer.parseInt(br.readLine());

        int reversedNumber = 0;

        while (store != 0) {
            int remainder = store % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            store = store/10;
        }

        if (reversedNumber == store) {
            System.out.println("Number is Palindrome Number");
        } else {
            System.out.println("Number is not Palindrome Number");
        }
    }
}
