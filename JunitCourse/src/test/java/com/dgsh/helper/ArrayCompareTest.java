package com.dgsh.helper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArrayCompareTest {

	@Test
	public void testArraySort_RandomArray() {
		int[] numbers = {13,12,16,17,14,15};
		int[] expected = {12,13,14,15,16,17};
		Arrays.sort(numbers);
		assertArrayEquals(expected, numbers);
	}

	

}
