package com.mkpits.classesandobjects;


// Main class definition
public class PersonClass {
    
    // Main method
    public static void main(String[] args) {
        
        // Creating an instance of Person1
        Person1 p1 = new Person1();
        p1.name = "Regved";
        p1.age = 23;
        p1.weight = 100;
        p1.height = 5.11f;

        // Printing information about Person1
        System.out.println("Person 1:");
        System.out.println("Name: " + p1.name);
        System.out.println("Age: " + p1.age);
        System.out.println("Weight: " + p1.weight);
        System.out.println("Height: " + p1.height);

        // Creating an instance of Person2
        Person2 p2 = new Person2();
        p2.name = "Elon Musk";
        p2.age = 50;
        p2.weight = 90;
        p2.height = 6.1f;

        // Printing information about Person2
        System.out.println("\nPerson 2:");
        System.out.println("Name: " + p2.name);
        System.out.println("Age: " + p2.age);
        System.out.println("Weight: " + p2.weight);
        System.out.println("Height: " + p2.height);
    }

    // Definition of the Person1 class
    public static class Person1 {
        String name;
        int age;
        int weight;
        float height;
    }

    // Definition of the Person2 class
    public static class Person2 {
        String name;
        int age;
        int weight;
        float height;
    }
}
