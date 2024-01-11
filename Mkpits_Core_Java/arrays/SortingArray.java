package com.mkpits.array;

import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        
        int [] numbers = {1, 5, 3, 2, 6, 4, 0, -1, -2, -3, -5, -4, -6};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        char [] characters = {'a','d','b','c','e'};
        Arrays.sort(characters);
        System.out.println(Arrays.toString(characters));

        int [] unicodes = {'A','D','C','E','b','a','d'};
        Arrays.sort(unicodes);
        System.out.println(Arrays.toString(unicodes));

        int [] anothernumbers = {1, 5, 3, 2, 6, 4, 0, -1, -2, -3, -5, -4, -6};
        Arrays.sort(anothernumbers,5, 12);
        System.out.println(Arrays.toString(anothernumbers));

    }
}
