package com.mkpits.priorityqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class PriorityQueueToArray {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        PriorityQueue<String> emotions = new PriorityQueue<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many Emotions are you feeling right now: ");
        int add = Integer.parseInt(br.readLine());

        for (int i = 0; i < add; i++) {
            System.out.println("Emotion Number: " + i);
            emotions.add(br.readLine());
        }

        System.out.println("Your List of Emotions are: " + emotions);

        String[] arrayEmotions = emotions.toArray(new String[0]);

        System.out.println("Priority Queue to Array is: " + arrayEmotions);
    }

    }

