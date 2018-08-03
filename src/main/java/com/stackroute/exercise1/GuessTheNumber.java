package com.stackroute.exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 * @author sumanth reddy 
 * program to generate a random random and the number entered by the user is checked with the generated random number
 */
public class GuessTheNumber {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Random rand = new Random();
		int key = rand.nextInt(50);
		System.out.println("enter a number");
		int guess = 0;
		while (key!=guess) {
		guess = sc.nextInt();
		String result=new String(randomGuess(key,guess));
		System.out.println(result);
		}
		sc.close();
	}


	/**
	 * method to check the guessed number matches with random number or not
	 * @param key
	 * @param guess
	 * @return result
	 */
	public static String randomGuess(int key,int guess) {
			String result = "";
			//boolean bool = true;
			do{
			if (guess > key)
			result+="Number guessed is more than original number";
			else if (guess < key)
			result+="Number guessed is less than original number";
			else if (guess == key)
			result+="Number guessed matches the original number";
			return result;
			}while (key!=guess);
			
			
}
}