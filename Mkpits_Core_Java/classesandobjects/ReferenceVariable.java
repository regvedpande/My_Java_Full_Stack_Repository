package com.mkpits.classesandobjects;

public class ReferenceVariable {

    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy");

        myDog.bark();
        myDog.fetch();

        Dog anotherDog = myDog;

        anotherDog.setName("Max");

        System.out.println("Original dog's name: " + myDog.getName());
    }
}

class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public void bark() {
        System.out.println(name + " is barking!");
    }

    public void fetch() {
        System.out.println(name + " is fetching a ball.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
