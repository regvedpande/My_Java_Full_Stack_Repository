package com.mkpits.method;

public class UsingTheClassName {

    public static void main(String[] args) {
        // Using the class name to call the static method
        UsingTheClassName.getFirstName();
        UsingTheClassName.getLastName();
        UsingTheClassName.getEmail();
        UsingTheClassName.getMobile();
        UsingTheClassName.getGender();
        UsingTheClassName.getPassword();
        UsingTheClassName.getAllData();
    }

    public static void getFirstName() {
        String name = "Regved";
        System.out.println("My First Name is :- " + name);
    }

    public static void getLastName() {
        String lastname = "Pande";
        System.out.println("My Last Name is :- " + lastname);
    }

    public static void getEmail() {
        String email = "regved@outlook.com";
        System.out.println("My Email is :- " + email);
    }

    public static void getMobile() {
        String mobile = "9049874883";
        System.out.println("My Mobile is :- " + mobile);
    }

    public static void getGender() {
        String gender = "Male";
        System.out.println("My Gender is :- " + gender);
    }

    public static void getPassword() {
        String password = "123";
        System.out.println("My Password is :- " + password);
    }

    public static void getAllData() {
        String name = "Regved";
        String lastname = "Pande";
        String email = "regved@example.com";
        String mobile = "9049874883";
        String gender = "Male";
        String password = "123";

        System.out.println("String FirstName = \"" + name + "\";");
        System.out.println("String LastName = \"" + lastname + "\";");
        System.out.println("String Email = \"" + email + "\";");
        System.out.println("String Mobile = \"" + mobile + "\";");
        System.out.println("String Gender = \"" + gender + "\";");
        System.out.println("String Password = \"" + password + "\";");
    }
}
