package projects.guessthenumber;

public interface Numbers {
	boolean isGuessCorrect(int guess);
	boolean isGuessLower(int guess);
	boolean isGuessHigher(int guess);
}
