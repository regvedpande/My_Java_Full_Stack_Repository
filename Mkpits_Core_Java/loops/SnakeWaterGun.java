package com.mkpits.loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SnakeWaterGun {

    public static void main(String[] args) throws NumberFormatException, IOException {
        // Variable to control the loop
        char ch = 'y';

        // Main game loop
        while (ch == 'y' || ch == 'Y') {
            // Generate a random number to represent the system's choice
            int random = (int) Math.ceil(Math.random() * 100);
            char systemInput;

            // Determine system's choice based on the random number generated
            if (random >= 1 && random < 34) {
                System.out.println("System chooses: Snake");
                systemInput = 's';
            } else if (random >= 34 && random <= 66) {
                System.out.println("System chooses: Water");
                systemInput = 'w';
            } else {
                System.out.println("System chooses: Gun");
                systemInput = 'g';
            }

            // User input
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Your Turn!");
            System.out.println("Enter your choice (s for Snake, w for Water, g for Gun):");
            
            // Convert input to lowercase for case-insensitive comparison
            String userInput = br.readLine().toLowerCase();

            // Determine the winner
            if ((systemInput == 's' && userInput.equals("w")) ||
                (systemInput == 'w' && userInput.equals("g")) ||
                (systemInput == 'g' && userInput.equals("s"))) {
                System.out.println("Congratulations! You win!");
            } else if ((userInput.equals("s") && systemInput == 'w') ||
                       (userInput.equals("w") && systemInput == 'g') ||
                       (userInput.equals("g") && systemInput == 's')) {
                System.out.println("Sorry! You lose!");
            } else {
                System.out.println("It's a draw!");
            }

            // Ask the user if they want to play again
            System.out.println("Do you want to play again? (y/n):");
            ch = br.readLine().charAt(0);
        }
    }
}


		
		