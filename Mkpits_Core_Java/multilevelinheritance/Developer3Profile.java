package com.mkpits.multilevelinheritance;

class Developer3 extends Developer2 {

    private String designation = "Frontend Developer";
    private String skills = "HTML/CSS, JavaScript";
    private String experience = "3 Years";
    private String salary = "8 Lakhs";

    public Developer3() {
        // Explicitly assign values to inherited attributes
        this.designation = "Frontend Developer"; // Assuming designation is inherited
        this.skills = "HTML/CSS, JavaScript";
        this.experience = "3 Years";
        this.salary = "8 Lakhs";
    }

    public void displayDetails() {
        System.out.println("Developer 3 Profile:");
        System.out.println("Designation : " + designation);
        System.out.println("Skills : " + skills);
        System.out.println("Experience : " + experience);
        System.out.println("Salary : " + salary);
    }

}

public class Developer3Profile {
    public static void main(String[] args) {
        Developer3 developer3 = new Developer3();
        developer3.displayDetails();
    }
}
