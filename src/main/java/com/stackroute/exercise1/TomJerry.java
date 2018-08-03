package com.stackroute.exercise1;

import java.util.Scanner;

/**
 * @author sumanth reddy 
 * program to take input between 20 & 30 and printing tom,if num is even and jerry,if num is odd
 */
public class TomJerry {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number between 20 and 30");
		int num = sc.nextInt();
		String result = check(num);
		System.out.println(result);
		sc.close();
	}

	/**
	 * checking whether the number is in the range or not and even or odd
	 * 
	 * @param num
	 * @return tom or jerry or number is not in the range
	 */
	public static String check(int num) {
		String result;
		if (num > 20 && num < 30) {
			if (num % 2 == 0)
				result = "tom";
			else
				result = "jerry";
		} 
		else
			result = "number is not in range";
		return result;
	}
}