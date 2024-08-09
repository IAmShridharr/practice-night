package classes;

public class Dog extends Jaanwar {
	
	Dog(int kuchBhi) {
		super(kuchBhi);
	}
	
	void eat() {
		super.eat();
		System.out.println("Dog khaana khaata hai");
	}
	
	void sleep() {
		super.sleep();
		System.out.println("Dog soota hai");
	}
}
