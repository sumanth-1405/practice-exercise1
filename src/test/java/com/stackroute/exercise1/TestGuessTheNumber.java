package com.stackroute.exercise1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestGuessTheNumber {

	@Test
	void randomGuessTest() {
		assertEquals("Number guessed is less than original number", GuessTheNumber.randomGuess(25,16));
	}

	@Test
	void randomGuessTest1() {
		assertEquals("Number guessed is more than original number", GuessTheNumber.randomGuess(6,16));
	}

	@Test
	void randomGuessTest2() {
		assertEquals("Number guessed matches the original number", GuessTheNumber.randomGuess(16,16));
	}

}
