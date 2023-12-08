// The class name should match the name of the Java file, and all code must be written inside a class.

package com.mkpits.datatype;

//This Java class demonstrates the basic concepts of Java objects.
    
    // - Objects are instances created from classes.
    // - They have characteristics (attributes) and behavior (methods).
    // - Class name should match the Java file name.
    // - All code is written inside a class.

class JavaObjectExamples {
 // Object attributes represent the student's information.
 String name;
 int id;
 double grade;

 // Object methods define the student's behavior.
 void introduce() {
     System.out.println("My name is " + name + ", my ID is " + id + ", and my grade is " + grade);
 }

 void study(String subject) {
     System.out.println("I am studying " + subject);
 }

 void takeExam(String subject) {
     System.out.println("I am taking an exam in " + subject);
 }
}