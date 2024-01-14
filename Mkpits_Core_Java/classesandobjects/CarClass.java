package com.mkpits.classesandobjects;

// Define a class named Car
class Car {

    // Declare instance variables for Car attributes
    String name;
    String engine;
    String speed;

    // Parameterized constructor to initialize Car attributes with custom values
    public Car(String name, String engine, String speed) {
        this.name = name;
        this.engine = engine;
        this.speed = speed;
    }

    // No-argument constructor with default values using constructor chaining
    public Car() {
        // Calls the parameterized constructor with default values
        this("Koenigsegg Jesko Absolut", "Twin TurboCharged V8", "535km/h");
    }

    // Method to produce the sound of the car
    void CarSound() {
        System.out.println("Vroom Vroom");
    }
}

// Main class named CarClass
public class CarClass {
    
    // Main method
    public static void main(String[] args) {

        // Create an instance of Car using the no-argument constructor
        Car c1 = new Car(); 

        // Create another instance of Car using the parameterized constructor with custom values
        Car c2 = new Car("Bugatti Chiron Super Sport 300+", "W16", "490km/h" );
        
        // Print information about the first car
        System.out.println("First Car:");
        System.out.println("name: " + c1.name);
        System.out.println("engine: " + c1.engine);
        System.out.println("speed: " + c1.speed);

        // Invoke the CarSound method for the first car
        c1.CarSound();

        // Print information about the second car
        System.out.println("\nSecond Car:");
        System.out.println("name: " + c2.name);
        System.out.println("engine: " + c2.engine);
        System.out.println("speed: " + c2.speed);

        // Invoke the CarSound method for the second car
        c2.CarSound();
    }
}
