package com.mkpits.set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class SetAddingAccessingRemovingIterating {
    public static void main(String[] args) throws IOException {

         Set<String>elements = new HashSet<String>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many Elements you want to add : " );
        int store = Integer.parseInt(br.readLine());

        for (int i = 0; i < store; i++) {
            
            System.out.println("Element Number" + i);
            elements.add(br.readLine());
        }

        System.out.println("Enter the Element that you want to access : ");
        String access = br.readLine();
        System.out.println("The Element you entered is present in the List : " + elements.contains(access));

        System.out.println("Do you wish to remove any Element : ");
        String remove = br.readLine();
        System.out.println("Removing the Element : " +elements.remove(remove));


        System.out.println("Elements after removal is : ");
        
        for (String string : elements) {

            System.out.println(string);
        }

    }
}
