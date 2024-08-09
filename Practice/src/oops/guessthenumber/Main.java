package oops.guessthenumber;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Number number = new Number();
		
		// Generate a random number between 1 and 100
		int generatedNumber = number.generateRandomNumber();
		int attempt = 10;
		boolean isWon = false;
		
		while (attempt > 0) {
			// User input --> Number
			System.out.print("Guess my number (Attempt: " + attempt + "): ");
			int input = sc.nextInt();
			
//			// Your number is less than my number (Attempt 10)
//			if (input < number) {
//				System.out.println("Your number is less than my number!");
//			} else if (input > number) {
//				System.out.println("Your number is greater than my number!");
//			} else {
//				System.out.println("Congrats bhai!");
//				isWon = true;
//				break;
//			}
			
			isWon = number.handleInput(input, generatedNumber);
			
			if (isWon) {
				break;
			}
			
			attempt--;
		}
		
		if (!isWon) {
			System.out.println("Asli number ye tha: " + generatedNumber);
		}
	
		sc.close();
	}
}
