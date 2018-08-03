package com.stackroute.exercise1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.stackroute.exercise1.TomJerry;

class TestTomJerry {

	//TomJerry obj = new TomJerry();

	@Test
	void tomTest() {
		assertEquals("tom", TomJerry.check(22));
	}

	@Test
	void jerryTest() {
		assertEquals("jerry", TomJerry.check(29));
	}

	@Test
	void rangeTest() {
		assertEquals("number is not in range", TomJerry.check(31));
	}

}