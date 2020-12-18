package com.sebsonic2o.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyMathTest {

	MyMath myMath = new MyMath();

	@Test
	public void sumOf3() {
		assertEquals(6, myMath.sum(new int[] {1, 2, 3}));
	}

	@Test
	public void sumOf1() {
		assertEquals(3, myMath.sum(new int[] {3}));
	}
}
