package com.mkpits.abstraction;

abstract class Shape {

	// Abstract method to calculate the area of the shape
	abstract double area();

	// Abstract method to calculate the perimeter of the shape
	abstract double perimeter();
}

class Square extends Shape {

	private double side;

	public Square(double side) {
		this.side = side;
	}

	@Override
	double area() {
		return side * side;
	}

	@Override
	double perimeter() {
		return 4 * side;
	}
}

class Circle extends Shape {

	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	double area() {
		return Math.PI * radius * radius;
	}

	@Override
	double perimeter() {
		return 2 * Math.PI * radius;
	}
}
