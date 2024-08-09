package problems.oops;

class Cat extends Animal {
	public void makeSound() {
		super.makeSound();
		System.out.println("Bho Bho");
	}
}

public class Animal {
	
	public void makeSound() {
		System.out.println("Animals makes sound!");
	}

}
