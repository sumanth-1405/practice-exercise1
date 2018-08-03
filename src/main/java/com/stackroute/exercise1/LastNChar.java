package com.stackroute.exercise1;

import java.util.Scanner;

/**
 * @author sumanth 
 * program to append last n characters of a string to the same string
 */
public class LastNChar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a word");
		String key = new String();
		key = sc.next();
		System.out.println("enter a number to repeate from end");
		int n = sc.nextInt();
		String result = stringRepeater(key, n);
		System.out.println(result);
		sc.close();
	}

	/**
	 * @param key
	 * @param n
	 * @return rep (that was appended)
	 */
	public static String stringRepeater(String key, int n) {

		String rep = key;

		// appending substring to a string
		String repele = key.substring(key.length() - n, key.length());
		for (int i = 1; i <= n; i++)
			rep += repele;
		return rep;
	}

}