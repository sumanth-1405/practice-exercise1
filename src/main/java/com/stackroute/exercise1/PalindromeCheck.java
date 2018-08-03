package com.stackroute.exercise1;

import java.util.Scanner;

/**
 * @author sumanth reddy 
 * program to check whether a given number is palindrome or not
 */
public class PalindromeCheck {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number to check for palindrome");
		int x = sc.nextInt();
		boolean Palindrome = isPalindrome(x);
		if (Palindrome) {
			boolean sum = checkSum(x);
			if (sum)
				System.out.printf("%d is palindrome andsum of even digits is greater than 25", x);
			else
				System.out.printf("%d is palindrome and sum of even digits is lesser than 25", x);
		} else {
			System.out.printf("%d is not a palindrome", x);
		}
		sc.close();
	}

	/**
	 * method to find sum of even digits
	 * @param x
	 * @return boolean
	 */
	public static boolean checkSum(int x) {
		boolean temp= true;
		int rem = 0, sum = 0;
		while (x != 0) {
			rem = x % 10;
			if (rem % 2 == 0)
				sum += rem;
			x = x / 10;
		}
		if (sum > 25)
			temp = true;
		else
			temp = false;
return temp;	
	}

	//
	/**
	 * method to check palindrome
	 * 
	 * @param x
	 * @return true or false
	 */
	public static boolean isPalindrome(int x) {
		int rem = 0, rev = 0, temp = x;

		for (; x != 0;) {
			rem = x % 10;
			x = x / 10;
			rev = rev * 10 + rem;
		}

		if (rev == temp) {
			return true;
		} else {
			return false;
		}
	}
}