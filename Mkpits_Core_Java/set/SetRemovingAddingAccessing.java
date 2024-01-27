package com.mkpits.set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class SetRemovingAddingAccessing {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
          
    Set<String>fashion = new HashSet<String>();

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("How many Fashion items you want to add : " );
    int store = Integer.parseInt(br.readLine());

    for (int i = 0; i < store; i++) { 
        System.out.println("Fashion Item Number" + i);
        fashion.add(br.readLine());
    }

    System.out.println("Your Fashion items are : " +fashion);

    System.out.println("Do you wish to remove any Fashion item : ");
    String remove = br.readLine();
    System.out.println("Your Fashion item is removed : " + fashion.remove(remove));

    System.out.println("Do you wish to add any other fashion item in place of that : ");
    String add = br.readLine();
    System.out.println("Fashion is added " +fashion.add(add));

    System.out.println("Which item you want to access : ");
    String check = br.readLine();
    System.out.println("Is Fashion item is present in the list : " +fashion.contains(check));

    System.out.println("Your fashion items are : ");
    fashion.forEach(System.out :: println);

    }
}