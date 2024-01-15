package com.mkpits.loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class LengthofNumberUsingWhileLoop {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number : ");
        int number = Integer.parseInt(br.readLine());

        // Creating a copy of the original number for processing
        int store = number;

        // Initializing a variable to store the length of the number
        int length = 0;

        // Using a while loop to calculate the length of the number
        while (store != 0) {
            // Dividing the number by 10 to remove the last digit
            store = store / 10;
            
            // Incrementing the length variable
            length = length + 1;
        }

        System.out.println("Length of the Number is " +length);

    }
}
