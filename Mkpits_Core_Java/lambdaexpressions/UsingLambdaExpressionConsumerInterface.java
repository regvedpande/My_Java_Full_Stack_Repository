package com.mkpits.lambdaexpressions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.function.Consumer;

public class UsingLambdaExpressionConsumerInterface {
    public static void main(String[] args) throws IOException {

        ArrayList<String> books = new ArrayList<String>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many Books you want to add : ");
        int bookscount = Integer.parseInt(br.readLine());
        System.out.println("Enter the names  of the Books : ");

        for (int i = 0; i < bookscount; i++) {
            books.add(br.readLine());
        }

        Consumer<String> printbook = (book) -> System.out.println("Book: " + book);
        books.forEach(printbook);
    }
}

