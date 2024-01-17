// List :
// List is child interface of Collection.
// If we want to represent a group of individual objecis as a single entity,
// where duplicates are allowed and insertion order preserved then we should go for List.

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class ListInterface {
    public static void main(String[] args) {
        // Creating a List
        List<String> stringList = new ArrayList<>();

        // Adding elements to the List
        stringList.add("Element 1");
        stringList.add("Element 2");
        stringList.add("Element 3");
        stringList.add("Element 2"); // Allowing duplicates

        // Displaying the List
        System.out.println("List elements: " + stringList);

        // Using Iterator to iterate over the List
        Iterator<String> iterator = stringList.iterator();
        System.out.println("Iterating through the List:");
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        // Accessing elements by index
        String elementAtIndex = stringList.get(2);
        System.out.println("Element at index 2: " + elementAtIndex);

        // Checking if the List contains a specific element
        boolean containsElement = stringList.contains("Element 1");
        System.out.println("Does the List contain 'Element 1'? " + containsElement);

        // Removing an element from the List
        stringList.remove("Element 2");
        System.out.println("After removing 'Element 2': " + stringList);

        // Size of the List
        int size = stringList.size();
        System.out.println("Size of the List: " + size);
    }
}
