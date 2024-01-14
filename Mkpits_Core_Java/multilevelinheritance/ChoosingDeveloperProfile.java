package com.mkpits.multilevelinheritance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChoosingDeveloperProfile {
    
    public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Which Developer Profile You Want: 1)Developer1, 2)Developer2, 3)Developer3"  );
    String choice = br.readLine();

    switch (choice) {
        case "1":
            Developer1 j = new Developer1();
            System.out.println("Developer 1 Profile:");
            System.out.println("Designation is " + j.designation);
            System.out.println("Skills are " + j.skills);
            System.out.println("Experience is " + j.experience);
            System.out.println("Salary is " + j.salary);
            break;

        case "2":
            Developer2 p = new Developer2("Python Developer", "Python(Numpy, Pandas, ScikitLearn, Django, Flask)", "1 Year", "10 Lakhs");
            System.out.println("Developer 2 Profile:");
            System.out.println("Designation is " + p.designation);
            System.out.println("Skills are " + p.skills);
            System.out.println("Experience is " + p.experience);
            System.out.println("Salary is " + p.salary);
            break;

        case "3":
            Developer3 d3 = new Developer3();
            System.out.println("Developer 3 Profile:");
            d3.displayDetails();
            break;

        default:
            System.out.println("Invalid choice.");
    }

}
}
