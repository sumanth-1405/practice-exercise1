package com.stackroute.exercise1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.stackroute.exercise1.NIterationLoop;

class TestNIterationLoop {

	//NIterationLoop obj = new NIterationLoop();

	@Test
	void test() {
		assertEquals("122333", NIterationLoop.loopCreator(3));
	}

}
