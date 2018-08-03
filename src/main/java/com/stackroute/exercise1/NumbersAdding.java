package com.stackroute.exercise1;

import java.util.Scanner;

/**
 * @author sumanth reddy 
 * program to take the inputs and add them
 */
public class NumbersAdding {

	static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {
		System.out.println("enter numbers to add and / at the end with a space");
		int input=sc.nextInt();
		int result = inputAdder(input);
		System.out.println(result);
	}

	/**
	 * method to add the numbers
	 */
	public static int inputAdder(int input) {
		int sum = 0, score = 0;
		
		while (sc.hasNextInt()) {
			{
				score = sc.nextInt();
				sum += score;
			}
			if (score == '/')
				break;
		}
		return sum;
	}
}