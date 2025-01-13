package englishtasks;

import java.util.*;

public class Hangman {
	static Random rand = new Random();
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		int attempts = 10;
		
		String wordToGuess;
		
		String[] wordsList = { "bruhu" };
		
		char[] userGuess;
		
		String letterGuessed;
		
		String[] lettersUsed = new String[26];
		
		int letterPos = 0;
		// We select the random word
		wordToGuess = selectWord(wordsList);
		// We initialize the word to guess with "_" in every position
		userGuess = new char[wordToGuess.length()];
		Arrays.fill(userGuess, '_');
		
		// We print the array for the user's first guess
		printArrayChar(userGuess);
		while (attempts > 0 && !String.valueOf(userGuess).equals(wordToGuess)) {
			letterPos = 0;
			System.out.println("Introduce a letter: ");
			letterGuessed = reader.nextLine();
			letterPos = searchLetter(letterGuessed, wordToGuess, letterPos);
			if(letterPos == -1) {
				attempts--;
			}
			while (letterPos != -1) {
				userGuess[letterPos] = wordToGuess.charAt(letterPos);
				letterPos = searchLetter(letterGuessed, wordToGuess, letterPos + 1);
			} 
			printArrayChar(userGuess);
			}
			
		}
	

	public static String selectWord(String[] wordsList) {
		int randomWordIndex;
		String randomWord;
		randomWordIndex = rand.nextInt(0, wordsList.length);
		randomWord = wordsList[randomWordIndex];
		return randomWord;
	}
	
	public static int searchLetter(String letter, String word, int startPos) {
		int position;
		position = word.indexOf(letter, startPos);
		return position;
	}
	public static void printArrayChar(char[] guess) {
		for (int i = 0; i < guess.length; i++) {
			System.out.print(guess[i] + " ");
		}
		System.out.println("");
	}
}
