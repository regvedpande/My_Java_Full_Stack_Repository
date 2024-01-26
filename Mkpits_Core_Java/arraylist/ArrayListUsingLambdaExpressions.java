package com.mkpits.arraylist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayListUsingLambdaExpressions {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        
        ArrayList<String> festivals = new ArrayList<String>();
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many festivals you want to add : ");
        int store  = Integer.parseInt(br.readLine());

        for (int i = 0; i < store; i++) {
            System.out.println("Enter Festival Number "+i);
            festivals.add(br.readLine());
        }

        System.out.println("List of Festivals are : " +festivals); 

        System.out.println("Is there any Festival at particular index you want to remove : ");
        int index = Integer.parseInt(br.readLine());
        festivals.remove(index);

        System.out.println("Do you want to add any other Festival in Place of that : ");
        String add = br.readLine();
        festivals.add(index, add);

        festivals.forEach(System.out::println);
    }
}
