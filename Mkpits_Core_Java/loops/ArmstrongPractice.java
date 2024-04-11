package com.mkpits.loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArmstrongPractice {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Check if the Number is Palindrome or Not : " );
            int num = Integer.parseInt(br.readLine());

            int Store = num, remainder, result=0;
            while (Store!=0) {
                remainder = Store % 10;
                result += Math.pow(remainder, 3);
                Store = Store/10;
            }
            
            if(result == num)
            System.out.println(num + " is an Armstrong number.");
            else
            System.out.println(num + " is not an Armstrong number.");
    }
}
