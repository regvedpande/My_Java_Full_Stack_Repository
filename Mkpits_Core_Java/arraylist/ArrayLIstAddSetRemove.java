package com.mkpits.arraylist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayLIstAddSetRemove {
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        ArrayList<String>catbreeds = new ArrayList<String>();
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many Cat Breeds you want to Add : ");
        int breeds  = Integer.parseInt(br.readLine());

        System.out.println("Enter the list of Cats you want to add : ");

        for (int i = 0; i < breeds; i++) {
            catbreeds.add(br.readLine());
        }

        System.out.println("Your Cat Breeds are : " + catbreeds);

        System.out.println("At Index 2, enter the cat name you want to add: ");
        catbreeds.set(2, br.readLine());

        System.out.println("Do You wish to remove any Cat from the List : " );
        catbreeds.remove(Integer.parseInt(br.readLine()));

        System.out.println(catbreeds);
   
    }  

}
