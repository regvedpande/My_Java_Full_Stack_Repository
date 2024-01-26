package com.mkpits.collectionframeworks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class ReversingArrayList {
    public static void main(String[] args) throws IOException {

        ArrayList<String> list = new ArrayList<String>();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the ArrayList that you want to Store : ");
   

        for (int i = 0; i < 5; i++) {
            String store = br.readLine();
            list.add(store);
        }
        System.out.println(list);

        //Reversing the ArrayList

        Collections.reverse(list);
        System.out.println("Reversed List is: " +list);

        
    }
}
