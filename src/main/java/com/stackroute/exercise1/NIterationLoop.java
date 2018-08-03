package com.stackroute.exercise1;

import java.util.Scanner;

/**
 * @author sumanth reddy 
 * program to print the Nth number n times
 */
public class NIterationLoop {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("enter the range");
		int range = sc.nextInt();
		String result = new String(loopCreator(range));
		System.out.println(result);
		sc.close();
	}

	/**
	 * method to print the numbers till the given range
	 * @param range
	 * @return loop
	 */
	public static String loopCreator(int range) {

		String loop = new String();
		for (int i = 1; i <= range; i++) {
			for (int j = 1; j <= i; j++) {
				loop += i;
			}
		}
		return loop;
	}
}
