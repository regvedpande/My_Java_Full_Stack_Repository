package com.mkpits.wrapper;

import java.util.Scanner;

public class IntegerSumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first integer:");
        int num1 = scanner.nextInt();
        System.out.println("Enter second integer:");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);
    }
}
