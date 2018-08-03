package com.stackroute.exercise1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSorting {
	//Sorting obj = new Sorting();

	@Test
	void checkSumTest() {
		assertEquals(true, Sorting.checkSum(16));
	}

	@Test
	void evenSumTest() {
		assertEquals(12, Sorting.evenSum(24567));
	}

	@Test
	void sortTest() {
		assertEquals(12345, Sorting.sort(53421));
	}

}
