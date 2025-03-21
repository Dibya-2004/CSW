package oops;

class Shape {
	String color;

	public Shape(String color) {
		this.color = color;
	}

	double calculateArea() {
		return 0.0;
	}

	public String getColor() {
		return color;
	}
}

class Circle extends Shape {
	double radius;

	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}

	double calculateArea() {
		return Math.PI * radius * radius;
	}
}

class Rectangle extends Shape {
	double width, height;

	public Rectangle(String color, double width, double height) {
		super(color);
		this.width = width;
		this.height = height;
	}

	@Override
	double calculateArea() {
		return width * height;
	}
}

public class Q4 {
	public static void main(String[] args) {
		// Creating an array of Shape objects
		Shape[] shapes = new Shape[2];
		shapes[0] = new Circle("white", 7);
		shapes[1] = new Rectangle("pink", 34, 69);

		// Displaying the area and color of each shape
		for (Shape shape : shapes) {
			System.out.println("Shape Color: " + shape.getColor());
			System.out.println("Shape Area: " + shape.calculateArea());
			System.out.println();
		}
	}
}
