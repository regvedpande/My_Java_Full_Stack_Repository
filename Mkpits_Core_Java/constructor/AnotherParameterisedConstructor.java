package com.mkpits.constructor;

// Class with a parameterized constructor
class Employee {
    private String name;
    private int employeeId;

    // Parameterized constructor
    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    // A method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + name);
    }
}

public class AnotherParameterisedConstructor {
    public static void main(String[] args) {
        // Creating an object of Employee using the parameterized constructor
        Employee emp1 = new Employee("John Doe", 1001);

        // Calling the displayDetails method to show employee details
        emp1.displayDetails();
    }
}
