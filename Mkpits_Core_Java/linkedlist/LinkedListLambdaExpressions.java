package com.mkpits.linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.function.Consumer;

public class LinkedListLambdaExpressions {
    public static void main(String[] args) throws IOException {

        LinkedList<String> electronicports = new LinkedList<String>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many types of ports you want to add : ");
        int storeport = Integer.parseInt(br.readLine());

        for (int i = 0; i < storeport; i++) {
            System.out.println("Port Type : " +i );
            electronicports.add(br.readLine());
        }

       
        Consumer<LinkedList<String>> portconsumer = ports ->
                ports.forEach(port -> System.out.println(port));

       
        portconsumer.accept(electronicports);
    }
}
