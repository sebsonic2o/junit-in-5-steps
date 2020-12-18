package com.sebsonic2o.junit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AssertTest {

	@Test
	public void test() {
		boolean myCondition = true;
		assertTrue(myCondition); // and assertFalse

		assertNull(null); // and assertNotNull

		int[] myArray = new int[] {1, 2, 3};
		assertArrayEquals(new int[] {1, 2, 3}, myArray);
	}
}
