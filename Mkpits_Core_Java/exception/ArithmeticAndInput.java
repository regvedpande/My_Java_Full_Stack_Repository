package com.mkpits.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticAndInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter numerator: ");
            int numerator = scanner.nextInt();
            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();

            int result = numerator / denominator;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter integers.");
        } finally {
            scanner.close(); // Always close the scanner
        }
    }
}
