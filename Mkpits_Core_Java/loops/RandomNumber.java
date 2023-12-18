package com.mkpits.loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RandomNumber {

    public static void main(String[] args) throws NumberFormatException, IOException {
        // Initialize BufferedReader to read user input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Generate a random number between 0 and 99
        int random = (int) Math.floor(Math.random() * 100);

        // Initialize the attempt counter
        int attempt;

        // Allow the user 10 attempts to guess the random number
        for (attempt = 0; attempt < 10; attempt++) {
            System.out.println("Enter the Number");

            // Read the user's input as an integer
            int n = Integer.parseInt(br.readLine());

            // Check if the user's guess is greater than the random number
            if (n > random) {
                System.out.println("Value is Greater than System Value");
            }

            // Check if the user's guess is equal to the random number
            if (n == random) {
                System.out.println("Congratulations You Win");
                // Exit the loop if the guess is correct
                break;
            }

            // Check if the user's guess is less than the random number
            if (n < random) {
                System.out.println("Value is Less than Default Value");
            }
        }

        // Display the number of attempts it took for the user to guess correctly
        System.out.println("Attempt took by you is " + attempt);
    }
}

	}