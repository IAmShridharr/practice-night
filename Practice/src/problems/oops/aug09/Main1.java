package problems.oops.aug09;

class Vehicle {
	void drive() {
		System.out.println("Vehicle can be driven!");
	}
}

class Car extends Vehicle {
	
	@Override
	void drive() {
		System.out.println("Repairing a car!");
	}
}

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.drive();
	}

}
