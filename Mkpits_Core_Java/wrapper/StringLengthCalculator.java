package com.mkpits.wrapper;

import java.util.Scanner;

public class StringLengthCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        int length = input.length();
        System.out.println("Length of the string: " + length);
    }
}