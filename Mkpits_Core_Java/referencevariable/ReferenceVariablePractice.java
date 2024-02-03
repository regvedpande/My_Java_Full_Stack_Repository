package com.mkpits.referencevariable;

public class ReferenceVariablePractice {

    public static class ReferenceVariableExample {
        public static void main(String[] args) {
            // Creating an object of the Student class
            Student student1 = new Student("John", 20);

            // Creating a reference variable and assigning it the reference of student1
            Student student2 = student1;

            // Modifying the values using the reference variable
            student2.setName("Jane");
            student2.setAge(22);

            // Printing the details using both references
            System.out.println("Details of student1: " + student1);
            System.out.println("Details of student2: " + student2);
        }
    }

    static class Student {
        private String name;
        private int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{name='" + name + "', age=" + age + '}';
        }
    }
}
