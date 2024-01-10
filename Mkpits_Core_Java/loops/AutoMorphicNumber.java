package com.mkpits.loops;

public class AutoMorphicNumber {

    public static void main(String[] args) {
        int a = 76;
        int q = a;
        int square = a * a;
        System.out.println("Square of " + a + " is: " + square);

        int divisor = 1;
        while (q > 0) {
            divisor *= 10;
            q /= 10;
        }

        int remainder = square % divisor;

        if (remainder == a) {
            System.out.println(a + " is an Automorphic Number");
        } else {
            System.out.println(a + " is not an Automorphic Number");
        }
    }
}
