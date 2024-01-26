package com.mkpits.arraylist;

import java.util.ArrayList;

public class ArrayListBoolean {
    public static void main(String[] args) {

       /*  This code initializes an ArrayList of Boolean values, adds four boolean elements (true, false, true, true) to the list,
        and then iterates through the list, incrementing a counter (howmanytrue) for each true value encountered. 
        Finally, it prints the count of true values in the ArrayList.*/

        ArrayList<Boolean> list = new ArrayList<Boolean>();
        list.add(true);
        list.add(false);
        list.add(true);
        list.add(true);

        int howmanytrue = 0;

        for (boolean value : list) {
            if (value) {
                howmanytrue++;
            }
        }

        System.out.println("Number of 'true' values in the list: " + howmanytrue);
    }
    }

