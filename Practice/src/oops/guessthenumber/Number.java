package oops.guessthenumber;

public class Number {
	public int generateRandomNumber() {
		return (int) (1 + Math.random() * 100);
	}
	
	public boolean handleInput(int input, int number) {
		if (input < number) {
			System.out.println("Your number is less than my number!");
			return false;
		} else if (input > number) {
			System.out.println("Your number is greater than my number!");
			return false;
		} else {
			System.out.println("Congrats bhai!");
			return true;
		}
	}
}
