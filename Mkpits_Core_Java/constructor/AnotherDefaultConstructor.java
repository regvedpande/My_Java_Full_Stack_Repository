package com.mkpits.constructor;

// Class with a default constructor
class MyClass {
    private String message; // A private member variable

    // Default constructor
    public MyClass() {
        this.message = "Hello, this is the default constructor!";
    }

    // A method to display the message
    public void displayMessage() {
        System.out.println(message);
    }
}

public class AnotherDefaultConstructor {
    public static void main(String[] args) {
        // Creating an object of MyClass using the default constructor
        MyClass myObject = new MyClass();

        // Calling the displayMessage method to show the message
        myObject.displayMessage();
    }
}

