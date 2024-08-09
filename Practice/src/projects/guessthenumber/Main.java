package projects.guessthenumber;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		char choice = '1';
		do {
			System.out.println("Enter the range between which you want me to generate a random number!");
			System.out.print("Staring Range: ");
			int startingRange = sc.nextInt();
			System.out.print("Staring Range: ");
			int endingRange = sc.nextInt();
			
			System.out.println();
			
			System.out.println("How many chances do you want?");
			System.out.print("Input: ");
			int totalGuesses = sc.nextInt();
			int guesses = totalGuesses;
			
			System.out.println();
			
			GuessTheNumber number = new GuessTheNumber(startingRange, endingRange, totalGuesses);
			
			System.out.println("I have thought of a number in my mind...");
			System.out.println("The number is between " + startingRange + " and " + endingRange);
			System.out.println("You have to guess the correct number in " + totalGuesses + " guesses");
			
			System.out.println();
			
			boolean isWon = false;
			while (guesses > 0) {
				System.out.println("Guess the number..");
				System.out.println(guesses + " attempts left!");
				System.out.print("Input: ");
				int guess = sc.nextInt();
				guesses--;
				
				System.out.println();
				
				if (number.isGuessCorrect(guess)) {
					isWon = true;
					System.out.println("Congratulations! You have guessed the correct number in " + (totalGuesses - guesses) + " attempts!");
					break;
				} else {
					if (number.isGuessHigher(guess)) {
						System.out.println("Your guess is higher than my number!");
					} else if (number.isGuessLower(guess)) {
						System.out.println("Your guess is lower than my number!");
					}
				}
				
				System.out.println();
			}
			
			if (!isWon) {
				System.out.println("Sorry! You have failed to guess the correct number");
				System.out.println("It was " + number.getRandomNumber() + "!");
				System.out.println("Better luck next time...");
			}
			
			System.out.println();
			
			System.out.println("Do you want to repeat?");
			System.out.println("Enter anything to repeat, 0 to exit..");
			System.out.print("Input: ");
			choice = sc.next().charAt(0);
		} while (choice != '0');
		
		sc.close();
		
		System.out.println("Come back again..!");
		
	}

}
