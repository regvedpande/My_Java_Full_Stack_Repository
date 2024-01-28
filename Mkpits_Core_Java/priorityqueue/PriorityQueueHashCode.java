package com.mkpits.priorityqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class PriorityQueueHashCode {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
          
        PriorityQueue<String> vehicles = new PriorityQueue<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many Vehicles you want to buy :  ");
        int add = Integer.parseInt(br.readLine());

        for (int i = 0; i < add; i++) {
            System.out.println("Vehicle Number: " + i);
            vehicles.add(br.readLine());
        }

        System.out.println("List of your Vehicles are : " + vehicles);
        System.out.println("Hash Code of your Vehicles are: " + vehicles.hashCode());

    }
}
