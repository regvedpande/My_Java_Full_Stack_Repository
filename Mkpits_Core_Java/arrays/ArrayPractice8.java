package com.mkpits.array;

import java.util.Arrays;

public class ArrayPractice8 {
    public static void main(String[] args) {
        
        int list [] = new int[3];
        list[0] = 7;
        list[1] = 21;
        list[2] = 19;

        System.out.println(list[0]);
        System.out.println(list.length);
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}