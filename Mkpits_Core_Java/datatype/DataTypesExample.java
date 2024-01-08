package com.mkpits.datatype;

//Primitive Data Types Example
public class DataTypesExample {

 public static void main(String[] args) {
     // Primitive Data Types

     // boolean
     boolean isJavaFun = true;

     // char
     char grade = 'A';

     // byte
     byte byteValue = 127;

     // short
     short shortValue = 32767;

     // int
     int intValue = 2147483647;

     // long
     long longValue = 9223372036854775807L; // Note the 'L' to denote a long literal

     // float
     float floatValue = 3.14f; // Note the 'f' to denote a float literal

     // double
     double doubleValue = 3.14159265359;

     // User-Defined/Custom Data Type (Class)
     // Example of a simple class representing a person
     Person person = new Person("John Doe", 25);

     // Accessing attributes of the Person class
     String personName = person.getName();
     int personAge = person.getAge();

     // Displaying information
     System.out.println("Is Java fun? " + isJavaFun);
     System.out.println("Grade: " + grade);
     System.out.println("Byte Value: " + byteValue);
     System.out.println("Short Value: " + shortValue);
     System.out.println("Int Value: " + intValue);
     System.out.println("Long Value: " + longValue);
     System.out.println("Float Value: " + floatValue);
     System.out.println("Double Value: " + doubleValue);

     // Displaying information from the Person class
     System.out.println("Person Information:");
     System.out.println("Name: " + personName);
     System.out.println("Age: " + personAge);
 }
}

//User-Defined/Custom Class
class Person {
 // Attributes
 private String name;
 private int age;

 // Constructor
 public Person(String name, int age) {
     this.name = name;
     this.age = age;
 }

 // Getter methods
 public String getName() {
     return name;
 }

 public int getAge() {
     return age;
 }
}
