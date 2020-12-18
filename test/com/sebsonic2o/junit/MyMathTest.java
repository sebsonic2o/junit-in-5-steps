package com.sebsonic2o.junit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyMathTest {

	MyMath myMath = new MyMath();

	@Before
	public void doBefore() {
		System.out.println("action before each test");
	}

	@After
	public void doAfter() {
		System.out.println("action after each test");
	}

	@BeforeClass
	public static void doBeforeAll() {
		System.out.println("action before all test");
	}

	@AfterClass
	public static void doAfterAll() {
		System.out.println("action after all test");
	}

	@Test
	public void sumOf3() {
		System.out.println("test 1");
		assertEquals(6, myMath.sum(new int[] {1, 2, 3}));
	}

	@Test
	public void sumOf1() {
		System.out.println("test 2");
		assertEquals(3, myMath.sum(new int[] {3}));
	}
}
