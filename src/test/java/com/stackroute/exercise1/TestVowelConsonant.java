package com.stackroute.exercise1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestVowelConsonant {

	@Test
	void vowelConsonantCheckTest() {
		assertEquals("ConsonantConsonantVowelConsonant", VowelConsonant.vowelConsonantCheck("qwer"));
	}

	@Test
	void vowelConsonantCheckTest1() {
		assertEquals("ConsonantConsonantVowelEXIT", VowelConsonant.vowelConsonantCheck("qwe1"));
	}

}
