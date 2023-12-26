package com.mkpits.multipleinheritance;

// Shape as the base class
class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void draw() {
        System.out.println("Drawing a generic shape with color: " + color);
    }
}

// Circle inherits from Shape
class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color); // Call Shape constructor
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void draw() {
        // Use color from Shape and add information specific to Circle
        System.out.println("Drawing a circle with color: " + getColor() + " and radius: " + radius);
    }
}

// Square inherits from Shape
class Square extends Shape {
    private double sideLength;

    public Square(String color, double sideLength) {
        super(color); // Call Shape constructor
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    @Override
    public void draw() {
        // Use color from Shape and add information specific to Square
        System.out.println("Drawing a square with color: " + getColor() + " and side length: " + sideLength);
    }
}

public class GeometricShapesDemo {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5.0);
        Square square = new Square("Blue", 10.0);

        circle.draw();  // "Drawing a circle with color: Red and radius: 5.0"
        square.draw(); // "Drawing a square with color: Blue and side length: 10.0"
    }
}
