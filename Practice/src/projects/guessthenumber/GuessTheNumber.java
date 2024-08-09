package projects.guessthenumber;

public class GuessTheNumber implements Numbers {
	
	private int randomNumber;
	private int guesses;
	
	GuessTheNumber(int startingRange, int endingRange, int guesses) {
		this.setRandomNumber(this.generateRandomNumber(startingRange, endingRange));
		this.setGuesses(guesses);
	}
	
	@Override
	public boolean isGuessCorrect(int guess) {
		// TODO Auto-generated method stub
		return guess == this.getRandomNumber();
	}

	@Override
	public boolean isGuessLower(int guess) {
		// TODO Auto-generated method stub
		return guess < this.getRandomNumber();
	}

	@Override
	public boolean isGuessHigher(int guess) {
		// TODO Auto-generated method stub
		return guess > this.getRandomNumber();
	}
	
	private int generateRandomNumber(int startingRange, int endingRange) {
		return startingRange + (int) (Math.random() * (endingRange - startingRange + 1));
	}

	public int getRandomNumber() {
		return randomNumber;
	}

	public void setRandomNumber(int randomNumber) {
		this.randomNumber = randomNumber;
	}

	public int getGuesses() {
		return guesses;
	}

	public void setGuesses(int guesses) {
		this.guesses = guesses;
	}
	
}
