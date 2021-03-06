package com.revature.hangman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		// Use scanner to read console to get user input via console
		System.out.println("Hello World!");
		Scanner myScanner = new Scanner(System.in);
		int bodyParts = 6; 
		System.out.println("Enter word to be guessed: ");
		String mysteryWord = myScanner.nextLine();
		List<String> correctlyGuessedLetters = new ArrayList<String>();
		String originalWord = mysteryWord;
		
		while (bodyParts > 0) {
			System.out.println("Guess a letter in the word: ");
			String guessedLetter = myScanner.nextLine();
	
		if(mysteryWord.contains(guessedLetter)) {
			
			System.out.println(mysteryWord.contains(guessedLetter));
			System.out.println("the word contains " + guessedLetter);
			mysteryWord = mysteryWord.replaceAll(guessedLetter, "");
			correctlyGuessedLetters.add(guessedLetter);
		} else {
			System.out.println(mysteryWord.contains(guessedLetter));
			System.out.println("the word does not contain " + guessedLetter);
			bodyParts--;
		}
		System.out.println("How the guessing is going: ");
		for(Character letter:originalWord.toCharArray())
		{
			if(correctlyGuessedLetters.contains(letter.toString('#')))
			{
				System.out.println(letter);
			} else {
				System.out.println("#");
			}
			}
			System.out.println();
			if(mysteryWord.length() == 0) {
				System.out.println("Congratulations you've guessed all the letters in the word");
				break;
			}
			}
		if(bodyParts == 0)
		System.out.println("Better luck next time");
		}

}
