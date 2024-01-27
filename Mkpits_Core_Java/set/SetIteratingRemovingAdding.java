package com.mkpits.set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class SetIteratingRemovingAdding {
    
   public static void main(String[] args) throws IOException {
    
    Set<String>diseases = new HashSet<String>();

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("How many Diseases are there : " );
    int store = Integer.parseInt(br.readLine());

    for (int i = 0; i < store; i++) { 
        System.out.println("Disease Number" + i);
        diseases.add(br.readLine());
    }

    System.out.println("List of Diseases are : ");
    diseases.forEach(System.out::println);

    System.out.println("Do you wish to remove any Diseases from the list : ");
    String remove  = br.readLine();
    System.out.println("Diseases that is being removed is : " + diseases.remove(remove));

    System.out.println("Do you wish to add any other Disease in place of that : ");
    String addon = br.readLine();
    System.out.println("Diseases that is being added is : " + diseases.add(addon));

    System.out.println(diseases);
   }

}
