
class Shape {
	int length, breadth, height;
	
	public void area() {
		System.out.println("Shape has area");
	}
}

class Rectangle1 extends Shape {
	public int area(int length, int breadth) {
		super.area();
		return length * breadth;
	}
}

class Square1 extends Rectangle1 {
	public int area(int side) {
		super.area();
		return side * side;
	}
}

class Circle1 extends Shape {
	public double area (int radius) {
		super.area();
		return 3.14 * radius * radius;
	}
}

public class MainConcepts implements Baccha {

	public static void main(String[] args) {

		// Inheritance
		// extends
		Rectangle1 rect = new Rectangle1(); // Single-level Inheritance
		int area = rect.area(3, 7);
		System.out.println("Area of Rectangle: " + area);
		
		Square1 square = new Square1(); // Multi-level Inheritance
		int areaSquare = square.area(7);
		System.out.println("Area of Square: " + areaSquare);
		
		Circle1 circle = new Circle1(); // Hierarchical Inheritance
		double areaCircle = circle.area(4);
		System.out.println("Area of Circle: " + areaCircle);
		
		Baccha baccha = new MainConcepts(); // Multiple Inheritance
		baccha.kheelo();
		baccha.maaro();
		baccha.pyaarKaro();
		
		// Encapsulation
		// public, private, protected keywords
		
		// Polymorphism - Method Overloading | Method Overriding
		// methods with same name, different return types, or different arguments
		
		// Abstraction
		// abstract
	}

	@Override
	public void maaro() {
		// TODO Auto-generated method stub
		System.out.println("Pappa to band bajaaye...");
	}

	@Override
	public void pyaarKaro() {
		// TODO Auto-generated method stub
		System.out.println("Yashoda ka nand laala..");
	}

	@Override
	public void kheelo() {
		// TODO Auto-generated method stub
		System.out.println("Chor");
	}

}
