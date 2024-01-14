package com.mkpits.multilevelinheritance;

class Developer2 extends Developer1 {
    String designation;
    String skills;
    String experience;
    String salary;  // Consider using a numeric type for salary if needed

    public Developer2(String designation, String skills, String experience, String salary) {
        this.designation = designation;
        this.skills = skills;
        this.experience = experience;
        this.salary = salary;
    }

    public Developer2() {
        this("Python Developer", "Python(Numpy, Pandas, ScikitLearn, Django, Flask)", "1 Year", "10 Lakhs");
    }

    void displayDetails() {
        System.out.println("Developer 1 Profile:");
        System.out.println("Designation : " + designation);
        System.out.println("Skills : " + skills);
        System.out.println("Experience : " + experience);
        System.out.println("Salary : " + salary);
    }
}

public class Developer2Profile {
    public static void main(String[] args) {
        Developer2 developer2 = new Developer2();
        developer2.displayDetails();  // Call the method on the object
    }
}
