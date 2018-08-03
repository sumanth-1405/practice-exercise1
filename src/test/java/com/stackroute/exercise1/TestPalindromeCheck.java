package com.stackroute.exercise1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.stackroute.exercise1.PalindromeCheck;

class palindromeCheckTest {

	//PalindromeCheck obj = new PalindromeCheck();

	@Test
	void isPalindromeTest() {
		assertEquals(true, PalindromeCheck.isPalindrome(12321));
	}

	@Test
	void checkSumTest() {
		assertEquals(true, PalindromeCheck.checkSum(64286));

	}
}
