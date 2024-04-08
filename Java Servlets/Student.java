package com.mkpits.model;

public class Student {
    private String firstName;
    private String lastName;
    private boolean isGoldCustomer;

    public Student(String firstName, String lastName, boolean isGoldCustomer) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isGoldCustomer = isGoldCustomer;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isGoldCustomer() {
        return isGoldCustomer;
    }

    public void setGoldCustomer(boolean isGoldCustomer) {
        this.isGoldCustomer = isGoldCustomer;
    }
}