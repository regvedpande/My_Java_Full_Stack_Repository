package com.mkpits.loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArmstrongNumber {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number : ");
        int number = Integer.parseInt(br.readLine());

        int store1 = number;
        int length = 0;

        while (store1!=0) {
            
            length = length + 1;
            store1 = store1/10;
        }

        int store2 = number;
        int armstrong =0;
        int multiple = 1;

        while (store2!=0) {
            
            int remainder = store2/10;
            for (int i = 0; i <=length; i++) {

                multiple = multiple * remainder;
            }

            armstrong = armstrong + multiple;
            store2 = store2/10;
        }

        if (armstrong==number) {
            
            System.out.println(number+ "is Armstrong Number");
        } else {
            System.out.println(number+ "is not Armstrong Number");
        }
        
    }
}
