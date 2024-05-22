package com.mkpits.loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExitControlLoop {
    //while loop
    public static void main(String[] args) throws NumberFormatException, IOException {
        int a = 9;
        while (a == 9) { 
            System.out.println("This is your Answer");
            break;
        }

        // For Loop
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number that you want to print repeatedly: ");
        int store = Integer.parseInt(br.readLine());

        for (int i = 0; i < store; i++) {
            System.out.println("Earth 🌎");
        }
    }
}
