package com.mkpits.linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListCarTyres {
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        LinkedList<String> cartyres = new LinkedList<String>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of Car Tyres that you want to Buy : ");
        int number = Integer.parseInt(br.readLine());

        System.out.println("What Car Tyres did you like : ");
        for (int i = 0; i < number; i++) {
            System.out.println("Choice Number : " +i);
            cartyres.add(br.readLine());
        }

        
        System.out.println("Which Car Tyres you don't like : ");
        cartyres.remove(br.readLine());

        System.out.println("Do You wish to add any other Car Tyres in exchange of that : ");
        String add = br.readLine();
        cartyres.add(add);

        Collections.sort(cartyres);
        System.out.println(cartyres.lastIndexOf(add));
        System.out.println(cartyres);

    }
    
}
