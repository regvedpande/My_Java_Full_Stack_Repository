package com.mkpits.arraylist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayListAddSetGetSize {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        ArrayList<String>laptopbrands = new ArrayList<String>();

        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many Laptop Brands you want to add : ");
        int num = Integer.parseInt(br.readLine());
       

        for (int i = 0; i < num; i++) {
            
            laptopbrands.add(br.readLine());

        }

        System.out.println("Your Laptop Brand List are : " + laptopbrands);

        System.out.println("What Laptop Brand you want to add at Index 4 :" );
        String addbrand = br.readLine();
        laptopbrands.add(addbrand);
        laptopbrands.set(4, addbrand);

        System.out.println("Laptop Brand at Index 4 is : " +laptopbrands.get(4));

        System.out.println("Size of ArrayList is : " +laptopbrands.size());

        
        
    }
}
