package com.mkpits.scanner;

import java.util.Scanner;

public class WhileScanner {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        boolean get = false;

        while (!get) {
            System.out.println("Learning");
            System.out.println("Have you Learned");
            get = sc.nextBoolean();
        }

        System.out.println("You are Ready Now");
    }
}
