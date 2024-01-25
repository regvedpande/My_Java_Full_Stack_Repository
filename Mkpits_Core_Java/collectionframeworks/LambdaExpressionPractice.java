package com.mkpits.collectionframeworks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class LambdaExpressionPractice {
    public static void main(String[] args) throws NumberFormatException, IOException {

        ArrayList<Integer> computerCompanies = new ArrayList<Integer>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Range : ");
        int store = Integer.parseInt(br.readLine());

        for (int i = 0; i < store; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            int element = Integer.parseInt(br.readLine());
            computerCompanies.add(element);
        }

        computerCompanies.forEach((n) -> { System.out.println(n); });
    }
}
