package com.mkpits.arraylist;

import java.util.ArrayList;

public class ArrayListAdd {
    public static void main(String[] args) {
        
        ArrayList<String> grocerylist = new ArrayList<String>();

        // "add" method used to add elements to an ArrayList in Java
        grocerylist.add("Peanut Butter");
        grocerylist.add("Sandwich Bread");
        grocerylist.add("Veggies");
        grocerylist.add("Fruits");
        grocerylist.add("Cottage Cheese");

        System.out.println(grocerylist);
    }
}
