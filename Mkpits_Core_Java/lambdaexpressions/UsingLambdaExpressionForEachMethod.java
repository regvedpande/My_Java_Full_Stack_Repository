package com.mkpits.lambdaexpressions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class UsingLambdaExpressionForEachMethod {
    public static void main(String[] args) throws IOException {

        ArrayList<String>utensils = new ArrayList<String>();

        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many Utensils you want to add : ");
        int utensilslist = Integer.parseInt(br.readLine());
        System.out.println("Enter the names of the Utensils : ");

        for (int i = 0; i < utensilslist; i++) {
            
            utensils.add(br.readLine());

        }


        utensils.forEach((n) -> {System.out.println("Utesils in sorted form are" +n);});

    
}
}
