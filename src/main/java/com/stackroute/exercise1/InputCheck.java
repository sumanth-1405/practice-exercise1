package com.stackroute.exercise1;

import java.util.Scanner;

/**
 * @author sumanth 
 * program to check the input given by the user
 */
public class InputCheck {

	static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {

		String input = new String();
		System.out.println("enter a character to be checked");
		input = sc.next();
		String characterIs = new String(check(input));
		System.out.println(characterIs);
	}

	/**
	 * @param input
	 * @return digit or alphabet or special character depending upon the character entered by the user
	 */
	public static String check(String input) {

		if ((input.charAt(0) >= 65 && input.charAt(0) <= 91) || (input.charAt(0) >= 97 && input.charAt(0) <= 122))
			return "Alphabet";

		else if (input.charAt(0) >= 48 && input.charAt(0) <= 57)
			return "Digit";

		else
			return "Special Character";
	}
}