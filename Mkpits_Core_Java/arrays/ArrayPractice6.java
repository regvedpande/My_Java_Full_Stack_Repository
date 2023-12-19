package com.mkpits.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class ArrayPractice6 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 5 numbers");
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
        	//We enter i+1 so we can get aesthetically understanding answer you can see it in the answers
            System.out.println("Enter " + (i + 1) + " Number");//
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        //array sort sort/arrange them in order
        Arrays.sort(numbers,1,3); 

        System.out.println("Sorted Numbers:");
        for (int num : numbers) {
            System.out.println(num);
        }
  
    }
}