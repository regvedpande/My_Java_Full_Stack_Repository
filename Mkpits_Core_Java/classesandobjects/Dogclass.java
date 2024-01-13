package com.mkpits.classesandobjects;

// Class represents a blueprint for creating objects
class Dog {

    // Properties (fields) of a dog
    String name;
    String breed;
    int age;

    // Constructor to initialize a dog's properties
    Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    // Behavior (method) of a dog
    void bark() {
        System.out.println("Woof!");
    }
}

// Main class to create and interact with dog objects
public class Dogclass {
    public static void main(String[] args) {

        // Create two dog objects with different properties
        Dog dog1 = new Dog("Fido", "Labrador", 3);
        Dog dog2 = new Dog("Buddy", "Golden Retriever", 5);

        // Access and print object properties
        System.out.println("Dog 1:");
        System.out.println("Name: " + dog1.name);
        System.out.println("Breed: " + dog1.breed);
        System.out.println("Age: " + dog1.age);

        System.out.println("\nDog 2:");
        System.out.println("Name: " + dog2.name);
        System.out.println("Breed: " + dog2.breed);
        System.out.println("Age: " + dog2.age);

        // Call the bark() method on each dog object
        dog1.bark();  // Outputs "Woof!"
        dog2.bark();  // Outputs "Woof!"
    }
}
