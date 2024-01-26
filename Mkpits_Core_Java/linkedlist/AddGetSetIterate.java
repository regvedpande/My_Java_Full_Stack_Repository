package com.mkpits.linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class AddGetSetIterate {
     public static void main(String[] args) throws IOException {

        LinkedList<String>colours = new LinkedList<String>();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Numbers of Colours that you want to add : ");
        int store = Integer.parseInt(br.readLine());

        for (int i = 0; i < store; i++) {
            
            System.out.println("Colour Number : " );
            colours.add(br.readLine());

    }

    System.out.println("Enter the Index Number to get the Element present on that Index : ");
    int index = Integer.parseInt(br.readLine());
    String index1 = colours.get(index);
    System.out.println("Colour on that Index is : " +index1);

    System.out.println("Enter the Colour that you want to add to that Index : ");
    String edit = br.readLine();
    colours.set(index, edit);
    System.out.println("Element that you have added on that index is : ");

         System.out.println(colours);

         for (String line : colours) {
            System.out.println(line);
         }
}
}
