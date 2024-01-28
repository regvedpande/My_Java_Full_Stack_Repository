package com.mkpits.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class QueueContainsAllEquals {
    public static void main(String[] args) throws NumberFormatException, IOException {
        Queue<String>names = new LinkedList<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many names you want to add in the Queue : " );
        int add = Integer.parseInt(br.readLine());

        for (int i = 0; i < add; i++) {
            
            System.out.println("Name Number : " +i);
            names.add(br.readLine());
        }

        System.out.println("Your Entered names are : " +names);


        Queue<String>anothernames = new LinkedList<String>();
        System.out.println("How many names you want to add in the Queue this time : " );
        int otheradd = Integer.parseInt(br.readLine());

        for (int i = 0; i < otheradd; i++) {
            
            System.out.println("Name Number : " +i);
            anothernames.add(br.readLine());
        }


        System.out.println("Check if they are equal :"+ names.equals(anothernames));
       
    }
}
