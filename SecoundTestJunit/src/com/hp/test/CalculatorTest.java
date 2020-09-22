package com.hp.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.hp.bean.Calculator;

public class CalculatorTest {
	@Test
	public void testAdd() {
		int a = 10;
		int b = 200;
		int expectedSum = 30;
		int actualSum = 0;
		Calculator calculator = null;

		calculator = new Calculator();
		actualSum = calculator.add(a, b);
		assertEquals(expectedSum, actualSum);
	}
}
