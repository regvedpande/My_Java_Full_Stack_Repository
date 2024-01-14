package com.mkpits.classesandobjects;

// Class representing devices in the Apple ecosystem
class Apple {
    // Instance variables for devices
    String laptop;
    String mobile;
    String tablet;

    // Static variables for common accessories
    static String earphones = "Airpods Pro";
    static String watch = "Apple Watch Ultra";

    // Method to print information about earphones
    void earphones() {
        System.out.println("Earphones is : " + earphones);
    }

    // Method to print information about watch
    void watch() {
        System.out.println("Watch is : " + watch);
    }
}

// Class representing devices in the Google ecosystem
class Google {
    // Instance variables for devices
    String laptop;

    // Static variables for common devices
    static String mobile = "Pixel 8 Pro";
    static String tablet = "Pixel Tab";

    // Instance variables for accessories
    String earphones;
    String watch;

    // Method to print information about mobile
    void mobile() {
        System.out.println("Mobile is : " + mobile);
    }

    // Method to print information about tablet
    void tablet() {
        System.out.println("Tablet is : " + tablet);
    }
}

// Main class to demonstrate the usage of Apple and Google classes
public class CompaniesClass {
    public static void main(String[] args) {
        // Create an instance of Apple class and set its device names
        Apple a = new Apple();
        a.laptop = "Macbook Pro";
        a.mobile = "iPhone";
        a.tablet = "iPad Pro";

        // Print information about Apple devices
        System.out.println("Apple Ecosystem :");
        System.out.println("Laptop is : " + a.laptop);
        System.out.println("Mobile is : " + a.mobile);
        System.out.println("Tablet is : " + a.tablet);
        System.out.println("Earphones is : " + Apple.earphones);  // Access static members using class name
        System.out.println("Watch is : " + Apple.watch);     // Access static members using class name

        // Create an instance of Google class and set its device names
        Google g = new Google();
        g.laptop = "Pixel Book";
        g.earphones = "Pixel Buds Pro";
        g.watch = "Pixel Watch";

        // Print information about Google devices
        System.out.println("Google Ecosystem: ");
        System.out.println("Laptop is : " + g.laptop);
        System.out.println("Mobile is : " + Google.mobile);  // Access static members using class name
        System.out.println("Tablet is : " + Google.tablet);  // Access static members using class name
        System.out.println("Earphones is : " + g.earphones);
        System.out.println("Watch is : " + g.watch);
    }
}
