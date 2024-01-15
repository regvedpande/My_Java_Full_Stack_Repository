package com.mkpits.loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactorialUsingDecrement {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number: ");
        int number = Integer.parseInt(br.readLine());
        int factorial = 1;

        for (int i = number; i >= 1; i--) {
            factorial = factorial * i;
        }

        System.out.println("Factorial is: " + factorial);
    }
}

