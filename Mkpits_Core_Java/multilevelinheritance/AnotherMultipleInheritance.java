package com.mkpits.multipleinheritance;

class Apple {
    void smartphone() {
        System.out.println("Apple makes the best Smartphones");
    }
}

class iPhone extends Apple {
    void about() {
        System.out.println("Apple is the maker of iPhones");
    }
}

class features extends iPhone {
    void technicalspecification() {
        System.out.println("It has a faster processor and best cameras");
    }
}

public class AnotherMultipleInheritance { 
    public static void main(String[] args) {
        features f = new features(); 
        f.smartphone();
        f.about();
        f.technicalspecification();
    }
}
