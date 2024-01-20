package com.mkpits.collectionframeworks;

import java.util.LinkedList;

public class IteratingThroughLinkedList {
    

    public static void main(String[] args) {
        
        LinkedList<String>products = new LinkedList<String>();
        products.add("Macbook");
        products.add("Tablet");
        products.add("Headsets");
        products.add("Router");

        for (int i = 0; i < products.size(); i++) {
            
            System.out.println("Your Products are :" +products.get(i));

        }

        for (String string : products) {
            System.out.println(string);
        }
    }
}
