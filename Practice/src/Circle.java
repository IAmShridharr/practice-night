public class Circle {
	
	int radius;
	float pi=22/7;
	
	Circle(int radius) {
		this.radius=radius;
	}
	
	float calculate(){
		return pi* radius * radius;
	}
}