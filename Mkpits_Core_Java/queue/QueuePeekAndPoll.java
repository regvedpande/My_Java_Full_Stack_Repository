package com.mkpits.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class QueuePeekAndPoll {
    public static void main(String[] args) throws NumberFormatException, IOException {

        Queue<String> values = new LinkedList<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many values you want to add in the Queue : ");
        int add = Integer.parseInt(br.readLine());

        for (int i = 0; i < add; i++) {
            System.out.println("Name Number : " + i);
            values.add(br.readLine());
        }

        System.out.println("Your Entered names are : " + values);

        System.out.println("Retrieved value (peek) is : " + values.peek());

        String removedvalue = values.poll();
        System.out.println("After removing first value : " +removedvalue);
        System.out.println("Updated values are : " + values);
    }
}
