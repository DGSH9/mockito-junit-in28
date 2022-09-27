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
	
	@Test(expected = NullPointerException.class)
	public void testArraySort_Null() {
		int[] numbers = null;
		Arrays.sort(numbers);
		
	}
	//testing performance
	@Test(timeout = 1000)
	public void testSort_ArrayPerformance() {
		int arr1[] = {12,13,4};
		for(int i=0;i<=1000000;i++) {
			arr1[0]=i;
			Arrays.sort(arr1);
		}
		
	}

}
