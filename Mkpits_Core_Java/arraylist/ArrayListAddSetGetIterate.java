package com.mkpits.arraylist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayListAddSetGetIterate {
    public static void main(String[] args) throws NumberFormatException, IOException {
        ArrayList<String> drinks = new ArrayList<String>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many drinks you have to add : ");
        int capacity  = Integer.parseInt(br.readLine());

        System.out.println("Enter the names of the drinks that you want to add: " );

        for (int i = 0; i < capacity; i++) {
            drinks.add(br.readLine());
        }

        System.out.println("Your Drinks are : " + capacity);

        System.out.println("Enter the Index you want to remove value from : ");
        int setvalue  = Integer.parseInt(br.readLine());

        System.out.println("What is the name of the drink that you want to add on that index : ");
        String setdrink = br.readLine();

        drinks.add(setvalue, setdrink);

        System.out.println("Your Drink at :" +setvalue+ "is" + setdrink);

        for (String listofdrinks : drinks) {
            System.out.println("Your drinks are :" +listofdrinks );
        }






      


        
    }
}
