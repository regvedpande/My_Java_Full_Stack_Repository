package com.mkpits.multilevelinheritance;

class Developer3 extends Developer2 {

    static String designation = "Frontend Developer";
    static String skills = "HTML/CSS and JavaScript (Angular and React)";
    static String experience = "3 Years";
    static String salary = "8 Lakhs";

    void designation(){
        System.out.println("Developer 3 Profile:");
    }
    void skills(){
        System.out.println("Skills : " + skills);
    }

    void experience(){
        System.out.println("Experience : " + experience);
    }

    void salary(){
        System.out.println("Salary : " + salary);
    }


    public void displayDetails() {
        System.out.println("Developer 3 Profile:");
        System.out.println("Designation : " + Developer3.designation);
        System.out.println("Skills : " + Developer3.skills);
        System.out.println("Experience : " + Developer3.experience);
        System.out.println("Salary : " + Developer3.salary);
    }

}

public class Developer3Profile {
    public static void main(String[] args) {
        Developer3 developer3 = new Developer3();
        developer3.displayDetails();
    }
}
