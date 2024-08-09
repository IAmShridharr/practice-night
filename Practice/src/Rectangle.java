
public class Rectangle {
	private int length;
	private int breadth;
	
	Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	int calculateArea() {
		return length * breadth;
	}

	int getLength() {
		return length;
	}

	void setLength(int length) {
		this.length = length;
	}

	int getBreadth() {
		return breadth;
	}

	void setBreadth(int breadth) {
		this.breadth = breadth;
	}

}
