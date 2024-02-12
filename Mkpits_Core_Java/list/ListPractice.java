package com.mkpits.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ListPractice {
    
    public static void main(String[] args) {
        
        List<String>names = new ArrayList<String>();
        names.add("Regved");
        names.add("Vinay");
        names.add("Ashik");
        names.add("Raj");

        List<String>anothernames = new ArrayList<String>();
        anothernames.add("Ashik");
        anothernames.add("Pranav");
        anothernames.add("Raj");
        anothernames.add("Kaustubh");
        
        System.out.println("All Elements :" +anothernames.addAll(names));
        System.out.println("Elements: " +anothernames );

        List<String>remove = new ArrayList<String>(new HashSet<>(anothernames));

        System.out.println("After Removing similar duplicate elements we get:");
        for (String string : remove) {
            System.out.println(string);
        }
       
    }
}
