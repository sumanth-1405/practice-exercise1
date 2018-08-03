package com.stackroute.exercise1;

import java.util.Scanner;

/**
 * @author sumanth reddy 
 * program for reversing the given string
 */
public class StringReverse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a word to reverse");
		String key, rev = new String();
		key = sc.next();
		rev = reverse(key);
		System.out.println(rev);
		sc.close();
	}

	/**
	 * method for reversing the string
	 * @param key
	 * @return rev
	 */
	public static String reverse(String key) {

		String rev = new String();
		int len = key.length();
		for (int i = 0; i < len; i++) {
			rev += key.charAt(len - 1 - i);
		}
		return rev;
	}
}