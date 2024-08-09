package problems.oops.aug09;

//class Shape {
//	void getArea() {
//		System.out.println("All shapes has area!");
//	}
//}
//
//class Rectangle extends Shape {
//	
//	@Override
//	void getArea() {
//		System.out.println("All shapes has area!");
//	}
//}

class Shape {
	
	int length;
	int breadth;
	
	Shape(int length, int breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	
	int getArea(){
		System.out.println("Area of Rectangle");
		return length * breadth;
	}
	
}

class Rectriangle extends Shape{
	Rectriangle(int length, int breadth) {
		super(length, breadth);
	}
	
	@Override
	int getArea(){
		System.out.println(length * breadth);
		return length * breadth;
	}
}

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectriangle rectriangle = new Rectriangle(6, 9);
		int res = rectriangle.getArea();
		System.out.println("Res: " + res);
	}

}
