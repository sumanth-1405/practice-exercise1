package com.stackroute.exercise1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.stackroute.exercise1.InputCheck;

class TestInputCheck {

	//InputCheck obj = new InputCheck();

	@Test
	void test() {
		assertEquals("Digit", InputCheck.check("5"));
	}

	@Test
	void test1() {
		assertEquals("Alphabet", InputCheck.check("A"));
	}

	@Test
	void test2() {
		assertEquals("Special Character", InputCheck.check("@"));
	}
}
