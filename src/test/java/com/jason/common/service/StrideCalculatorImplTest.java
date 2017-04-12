package com.jason.common.service;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.jason.common.model.Stairwell;
import com.jason.common.model.Stride;

public class StrideCalculatorImplTest {

	StrideCalculator strideCalculator;

	Stairwell stairwell;
	Stairwell stairwell1;
	Stairwell stairwell2;
	Stairwell stairwell3;
	Stairwell stairwell4;

	ArrayList<Stairwell> stairwells;

	Stride stride;

	@Before
	public void setUp() {
		stride = new Stride(3);

		stairwell = new Stairwell(1);
		stairwells.add(stairwell);

		stairwell1 = new Stairwell(10);
		stairwells.add(stairwell1);

		stairwell2 = new Stairwell(20);
		stairwells.add(stairwell2);

		stairwell3 = new Stairwell(14);
		stairwells.add(stairwell3);

		stairwell4 = new Stairwell(16);
		stairwells.add(stairwell4);
	}

	@Ignore
	@Test
	public void testMultipleStairwells() {
		int result = strideCalculator.calculateForMultipleStairwells(stairwells, stride);
		assertEquals(result, 21);
	}

	@Ignore
	@Test
	public void testSingleStairwells() {
		int result = strideCalculator.calculateForSingleStairwell(10, stride);
		assertEquals(result, 4);
	}
}
