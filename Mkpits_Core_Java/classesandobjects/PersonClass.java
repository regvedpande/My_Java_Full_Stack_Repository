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

        // Calling the static method zodiacsign() for Person1
        Person1.zodiacsign();

        // Printing information about Person1
        System.out.println("Person 1:");
        System.out.println("Name: " + p1.name);
        System.out.println("Age: " + p1.age);
        System.out.println("Weight: " + p1.weight);
        System.out.println("Height: " + p1.height);
        
        // Printing the zodiac sign for Person1
        System.out.println("Zodiac Sign is: " + Person1.zodiacsign());

        // Creating an instance of Person2
        Person2 p2 = new Person2();
        p2.name = "Elon Musk";
        p2.age = 50;
        p2.weight = 90;
        p2.height = 6.1f;

        // Calling the static method zodiacsign() for Person2
        Person2.zodiacsign();

        // Printing information about Person2
        System.out.println("\nPerson 2:");
        System.out.println("Name: " + p2.name);
        System.out.println("Age: " + p2.age);
        System.out.println("Weight: " + p2.weight);
        System.out.println("Height: " + p2.height);
        // Printing the zodiac sign for Person2
        System.out.println("Zodiac Sign is: " + Person2.zodiacsign());
    }

    // Definition of the Person1 class
    public static class Person1 {
        String name;
        int age;
        int weight;
        float height;

        // Static variable representing the zodiac sign for Person1
        // Static variables do not depend on an object, and you also don't need to create any object for them
        static String zodiacsign = "Cancer";

        // Static method to print the zodiac sign for Person1
        static void zodiacsign() {
            System.out.println("Zodiac Sign for Person1: " + zodiacsign);
        }
    }

    // Definition of the Person2 class
    public static class Person2 {
        String name;
        int age;
        int weight;
        float height;

        // Static variable representing the zodiac sign for Person2
        // Static variables do not depend on an object, and you also don't need to create any object for them
        static String zodiacsign = "Sagittarius";

        // Static method to print the zodiac sign for Person2
        static void zodiacsign() {
            System.out.println("Zodiac Sign for Person2: " + zodiacsign);
        }
    }
}
