package com.mkpits.multilevelinheritance;

class Developer1 {
    String designation;
    String skills;
    String experience;
    String salary; 

    public Developer1(String designation, String skills, String experience, String salary) {
        this.designation = designation;
        this.skills = skills;
        this.experience = experience;
        this.salary = salary;
    }

    public Developer1() {
        this("Java Developer", "Java(Springboot, Hybernate)", "2 Years", "12 Lakhs");
    }

    void displayDetails() {
        System.out.println("Developer 1 Profile:");
        System.out.println("Designation : " + designation);
        System.out.println("Skills : " + skills);
        System.out.println("Experience : " + experience);
        System.out.println("Salary : " + salary);
    }
}

public class Developer1Profile {
    public static void main(String[] args) {
        Developer1 developer1 = new Developer1();
        developer1.displayDetails();  
    }
}

