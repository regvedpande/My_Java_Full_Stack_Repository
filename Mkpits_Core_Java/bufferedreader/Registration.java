package com.mkpits.bufferedreader;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Registration {

    String firstName;
    String lastName;
    String email;
    int age;
    long mobile;

    public static void main(String[] args) throws Exception {
        Registration registration = new Registration();
        registration.register();
    }

    public void register() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter First Name");
        this.firstName = reader.readLine();

        System.out.println("Enter Last Name");
        this.lastName = reader.readLine();

        System.out.println("Enter Email");
        this.email = reader.readLine();

        System.out.println("Enter Age");
        this.age = Integer.parseInt(reader.readLine());

        System.out.println("Enter Mobile");
        this.mobile = Long.parseLong(reader.readLine());
    }
}
