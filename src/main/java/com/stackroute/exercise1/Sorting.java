package com.stackroute.exercise1;

import java.util.Scanner;

/**
 * @author sumanth reddy 
 * program to sort the digits in a given number
 */
public class Sorting {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("enter number to sorted");
		int key = sc.nextInt();
		int sortedKey = sort(key);
		System.out.print(sortedKey);
		System.out.println();
		int evenSum = evenSum(key);
		System.out.println(evenSum);
		boolean fifteen = checkSum(evenSum);
		System.out.println(fifteen);
	}

	/**
	 * checking whether the sum is less than or greater than 15
	 * @param evenSum
	 * @return true or false
	 */
	public static boolean checkSum(int evenSum) {

		if (evenSum > 15)
			return true;
		return false;
	}

	/**
	 * loop for adding the even digits in the number 
	 * @param key
	 * @return sum
	 */
	public static int evenSum(int key) {

		int temp = key;
		int sum = 0;
		while (temp != 0) {
			int rem = temp % 10;
			temp = temp / 10;
			if (rem % 2 == 0)
				sum += rem;
		}
		return sum;
	}

	/**
	 * code for sorting the digits in the given number 
	 * @param key
	 * @return num
	 */
	public static int sort(int key) {

		int arr[] = new int[(int) (Math.log10(key) + 1)];
		int temp = key;
		int i = 0, num = 0;
		while (temp != 0) {
			int rem = temp % 10;
			temp = temp / 10;
			arr[i] = rem;
			i++;
		}
		int n = arr.length;
		for (int x = n - 1; x >= 0; x--) {
			for (int y = i - 1; y >= 0; y--)
				if (arr[x] > arr[y]) {
					temp = arr[y];
					arr[y] = arr[x];
					arr[x] = temp;
				}
		}

		for (i = 0; i < arr.length; i++) {
			num = num * 10 + arr[i];
		}

		return num;
	}

}