package com.mkpits.deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class DequePeekFirstAndLast {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        Deque<String> festivals = new ArrayDeque<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many festivals you want to add : " );
        int add = Integer.parseInt(br.readLine());

        for (int i = 0; i < add; i++) {
            
            System.out.println("Festival Name : " +i);
            festivals.add(br.readLine());

        }

        System.out.println("Your Entered festivals names are : " + festivals);

        System.out.println("Peek First Element : " + festivals.peekFirst());
        System.out.println("Peek Last Element : " + festivals.peekLast());

    }
}
