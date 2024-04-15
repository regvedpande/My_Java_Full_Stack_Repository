package com.mkpits.classesandobjects;

public class identifiersJava {
    private String $myName;
    private String _myLastName;

    // Constructor
    public identifiersJava(String firstName, String lastName) {
        $myName = firstName;
        _myLastName = lastName;
    }

    // Method to display name
    public void displayName() {
        System.out.println("My First Name is : " + $myName + ", Last Name is: " + _myLastName);
    }

    public static void main(String[] args) {
        // Creating an object of the class and passing parameters to the constructor
        identifiersJava name = new identifiersJava("John", "Doe");
        
        // Calling the method to display name
        name.displayName();
    }
}
