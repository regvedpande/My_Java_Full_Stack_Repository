package com.mkpits.constructor;

public class ConstructorExample {

    // Attributes (instance variables) of the class
    private String name;
    private int age;

    // Default constructor (no arguments)
    public ConstructorExample() {
        // This constructor is called when no arguments are provided during object creation
        name = "Default Name";
        age = 0;
        System.out.println("Default constructor called.");
    }

    // Parameterized constructor (with arguments)
    public ConstructorExample(String name, int age) {
        // This constructor is called when name and age are provided during object creation
        this.name = name;
        this.age = age;
        System.out.println("Parameterized constructor called.");
    }

    // Method to display the object's information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method to create and use objects
    public static void main(String[] args) {

        // Creating objects using different constructors
        ConstructorExample obj1 = new ConstructorExample(); // Calls the default constructor
        ConstructorExample obj2 = new ConstructorExample("John Doe", 30); // Calls the parameterized constructor

        // Calling the displayInfo method to show object details
        obj1.displayInfo();
        obj2.displayInfo();
    }
}
