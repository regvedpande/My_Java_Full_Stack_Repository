package com.mkpits.array;

import java.util.Arrays;

public class ArraysComparison {
    
    public static void main(String[] args) {
        
        int numbers1[] = {5, 4, 3, 2, 1, 0, -1};
        int numbers2[] = {5, 4, 3, 2, 1, 0, -1};
        int numbers3[] = {1, 2, 3, 7, 7, 8, 1};

        String str1 = new String("Regved");
        String str2 = new String("Regved");


        System.out.println(numbers1 == numbers2); //both numbers addresses are different
        System.out.println(Arrays.equals(numbers1, numbers2));
        System.out.println(Arrays.equals(numbers1, numbers3));

        System.out.println(str1 == str2); //false as both numbers addresses are different
        System.out.println(str1.equals(str2));
    }
}
