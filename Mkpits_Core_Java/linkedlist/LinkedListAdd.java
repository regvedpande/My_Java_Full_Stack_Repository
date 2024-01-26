package com.mkpits.linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class LinkedListAdd {
    public static void main(String[] args) throws IOException {

        LinkedList<String>spacecorporations = new LinkedList<String>();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the List of Space Corporations that you want to add : ");
        String store = br.readLine();

        for (int i = 0; i < store.length(); i++) {
            
            spacecorporations.add(br.readLine());

    }
         System.out.println(spacecorporations);
}
}
