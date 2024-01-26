

package com.mkpits.arraylist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayListAddGetRemove {
    public static void main(String[] args) throws NumberFormatException, IOException {

        ArrayList<String> oddmanout = new ArrayList<String>();
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many Elements you want to add in OddManOut : ");
        int store  = Integer.parseInt(br.readLine());

        System.out.println("Enter your Lists : ");
        
        for (int i = 0; i < store; i++) {
            
            oddmanout.add(br.readLine());
        }

        System.out.println("Your OddManOutList is " + oddmanout);
        System.out.println("Odd Name at Index 3 is : " + oddmanout.get(3));
        System.out.println("Removing the Odd Name at index 3 which is : " + oddmanout.remove(3));
        System.out.println("Adding Pranav at index 3 we get : "+ oddmanout.set(3, "Pranav"));
        System.out.println("Corrected List for OddManOut is : " +oddmanout);

    }
}