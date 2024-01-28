package com.mkpits.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueToArray {
    public static void main(String[] args) throws IOException {
        
        Queue<String> carcompanies = new PriorityQueue<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many Cars Companies do you want to add : ");
        int store = Integer.parseInt(br.readLine());

        for (int i = 0; i < store; i++) {
            System.out.println("Enter Car Company Number " +i);
            carcompanies.add(br.readLine());
        }

        String[] carsArray = carcompanies.toArray(new String[0]);

        System.out.println("Array of Car Companies: " + Arrays.toString(carsArray));

    }
}
