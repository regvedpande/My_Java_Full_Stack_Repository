package com.mkpits.arraylist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayListAddSetGetRemoveSizeIterate {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        ArrayList<String> gods = new ArrayList<String>();
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many Gods you want to add : ");
        int list  = Integer.parseInt(br.readLine());

        System.out.println("Enter their Names : ");
        for (int i = 0; i < list; i++) {
            
            gods.add(br.readLine());

        }
        
        System.out.println("List of Gods are : " +list);

        System.out.println("Enter the Index you want to add God : ");
        int index = Integer.parseInt(br.readLine());

        System.out.println("Enter the Name of the God that you want to add on " +index);
        String name = br.readLine();

        gods.set(index, name);
        System.out.println("Added God is : " +gods);

        System.out.println("At which index you want to remove god from : ");
        String removegod = br.readLine();
        gods.remove(removegod);
        System.out.println(gods);

        System.out.println("Size of God List is : " + gods.size());

        for (String iteratingods : gods) {
            System.out.println(iteratingods);
        }

    }
}
