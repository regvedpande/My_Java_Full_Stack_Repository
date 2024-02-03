package com.mkpits.referencevariable;

import java.util.ArrayList;  // Add this import statement

public class ReferenceVariablePractice2 {
    public static void main(String[] args) {
        // Creating an object of the GroceryList class
        GroceryList groceryList1 = new GroceryList();

        // Creating a reference variable and assigning it the reference of groceryList1
        GroceryList groceryList2 = groceryList1;

        // Modifying the object using the reference variable
        groceryList2.addItem("Apples");
        groceryList2.addItem("Milk");
        groceryList2.addItem("Bread");

        // Displaying the items using both references
        System.out.println("Items in groceryList1: " + groceryList1.getItems());
        System.out.println("Items in groceryList2: " + groceryList2.getItems());
    }
}

class GroceryList {
    private ArrayList<String> items;

    public GroceryList() {
        this.items = new ArrayList<>();
    }

    public void addItem(String item) {
        this.items.add(item);
    }

    public ArrayList<String> getItems() {
        return items;
    }
}


