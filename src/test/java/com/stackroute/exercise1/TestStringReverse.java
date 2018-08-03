package com.stackroute.exercise1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.stackroute.exercise1.StringReverse;

class TestStringReverse {

	//StringReverse obj = new StringReverse();

	@Test
	void Reversetest() {
		assertEquals("kcats", StringReverse.reverse("stack"));
	}

}