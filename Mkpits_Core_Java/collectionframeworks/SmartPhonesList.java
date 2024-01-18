package com.mkpits.collectionframeworks;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SmartPhonesList {
    
    public static void main(String[] args) {
        
        ArrayList<String> smartphones = new ArrayList<String>();
        smartphones.add("Samsung Galaxy S24 Ultra");
        smartphones.add("I Phone 15 Pro Max");
        smartphones.add("Pixel 8 Pro");
        smartphones.add("Nothing Phone 2");
        smartphones.add("Asus ROG Phone 8");
        Collections.sort(smartphones);
        System.out.println(smartphones);
       
        for (int i = 0; i < smartphones.size(); i++) {
            System.out.println(smartphones.get(i));
        }
        for (String assign : smartphones) {
            System.out.println(assign);
        }

    }
}