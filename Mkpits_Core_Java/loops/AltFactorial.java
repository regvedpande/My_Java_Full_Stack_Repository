package com.mkpits.loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AltFactorial {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number that you want factorial of : " );
        int Store = Integer.parseInt(br.readLine());
        
        int factorial = 1;
        for (int i = 1; i <= Store; i++) {
            factorial *= i;
        }
        System.out.println("The factorial of " + Store + " is " + factorial);
    }
}
