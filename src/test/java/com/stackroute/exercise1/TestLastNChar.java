package com.stackroute.exercise1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.stackroute.exercise1.LastNChar;

class TestLastNChar {

	//LastnChar obj = new LastnChar();

	@Test
	void test() {
		assertEquals("rohithithithit", LastNChar.stringRepeater("rohit", 3));
	}
}