package com.dgsh.helper;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class QuckBeforeAfterTest {

	
	@Before
	public void beforeTest() {
		System.out.println("Before Test..");
	}

	@Test
	public void test1() {
		System.out.println("test1 executed..");
	}
	@Test
	public void test2() {
		System.out.println("test2 executed..");
	}
	@After
	public void afterTest() {
		System.out.println("After T	est..");
	}

}
