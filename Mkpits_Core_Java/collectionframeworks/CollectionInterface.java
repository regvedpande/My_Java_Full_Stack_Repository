package com.mkpits.collectionframeworks;

// Collection :
// If we want to represent a group of individual objects as a single entity then we should go for Collection.
// Collection interface defines the most common methods which are applicable for any Collection object.
// In general collection interface is considered as root interface of Collection Framework.
// Note: there is no concrete class which implements collection interface directly.


    
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionInterface {
    public static void main(String[] args) {
        // Creating a Collection (List in this case)
        Collection<String> stringCollection = new ArrayList<>();

        // Adding elements to the Collection
        stringCollection.add("Element 1");
        stringCollection.add("Element 2");
        stringCollection.add("Element 3");

        // Displaying the Collection
        System.out.println("Collection elements: " + stringCollection);

        // Using Iterator to iterate over the Collection
        Iterator<String> iterator = stringCollection.iterator();
        System.out.println("Iterating through the Collection:");
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        // Size of the Collection
        int size = stringCollection.size();
        System.out.println("Size of the Collection: " + size);

        // Removing an element from the Collection
        stringCollection.remove("Element 2");
        System.out.println("After removing 'Element 2': " + stringCollection);

        // Checking if the Collection contains a specific element
        boolean containsElement = stringCollection.contains("Element 1");
        System.out.println("Does the Collection contain 'Element 1'? " + containsElement);

        // Clearing the Collection
        stringCollection.clear();
        System.out.println("Collection after clearing: " + stringCollection);
    }
}

