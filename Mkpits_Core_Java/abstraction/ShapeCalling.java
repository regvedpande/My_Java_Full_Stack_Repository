package com.mkpits.abstraction;

public class ShapeCalling {

	public static void main(String[] args) {
		Shape square = new Square(5);
		Shape circle = new Circle(3);

		System.out.println("Square area: " + square.area());
		System.out.println("Square perimeter: " + square.perimeter());
		System.out.println("Circle area: " + circle.area());
		System.out.println("Circle perimeter: " + circle.perimeter());
	}

}
