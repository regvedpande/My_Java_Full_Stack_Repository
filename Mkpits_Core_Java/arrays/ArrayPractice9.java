package com.mkpits.array;

public class ArrayPractice9 {
    public static void main(String[] args) {
        
        int list[] = {5,8,4,2,9};

        int minimum = Integer.MAX_VALUE;

        for (int check : list) {
            
            if (check < minimum) {
                minimum = check;
            }
            
        }

        System.out.println("Your Minimum Value is : " + minimum);
    }
}
