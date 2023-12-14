package com.mkpits.controlflowstatements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IterativeStatements {

    public static void main(String[] args) throws IOException {
        int a, b;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the first number");
        a = Integer.parseInt(br.readLine());

        System.out.println("Enter the second number");
        b = Integer.parseInt(br.readLine());

        String result = (a > b) ? ("Number is greater") : ("Number is smaller");
        System.out.println(result);
    }
}
