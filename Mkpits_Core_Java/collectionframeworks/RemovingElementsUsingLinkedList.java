package com.mkpits.collectionframeworks;

import java.util.LinkedList;

public class RemovingElementsUsingLinkedList {
    
    public static void main(String[] args) {
        
        LinkedList<String>laptops = new LinkedList<String>();
        laptops.add("Macbook Pro M3");
        laptops.add("Dell XPS 17");
        laptops.add("Lenovo Legion");
        laptops.add("Samsung Galaxy Book3 Ultra");

        laptops.add(2, "ASUS ROG Strix");

        System.out.println("Before Removal" +laptops);

        laptops.remove(2);
        System.out.println("After Removal :" +laptops);
        
    }
}
