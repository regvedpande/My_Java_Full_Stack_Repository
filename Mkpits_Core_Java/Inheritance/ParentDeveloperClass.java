package com.mkpits.singleinheritance;

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
}

class Developer2 {
    String designation;
    String skills;
    String experience;
    String salary;

    public Developer2(String designation, String skills, String experience, String salary) {
        this.designation = designation;
        this.skills = skills;
        this.experience = experience;
        this.salary = salary;
    }
}

public class ParentDeveloperClass {
    public static void main(String[] args) {

        Developer1 j = new Developer1();
        System.out.println("Developer 1 Profile : ");
        System.out.println("Designation is " + j.designation);
        System.out.println("Skills are " + j.skills);
        System.out.println("Experience is " + j.experience);
        System.out.println("Salary is " + j.salary);

        Developer2 p = new Developer2("Python Developer", "Python(Numpy, Pandas, ScikitLearn, Django, Flask)", "1 Year", "10 Lakhs");
        System.out.println("Developer 2 Profile : ");
        System.out.println("Designation is " + p.designation);
        System.out.println("Skills are " + p.skills);
        System.out.println("Experience is " + p.experience);
        System.out.println("Salary is " + p.salary);
    }
}
