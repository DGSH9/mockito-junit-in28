package com.dgsh.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {
	
	
	@Test
	public void test() {
		StringHelper stringHelper = new StringHelper();
		//AACD => CD,	ACD => CD,	CDEF => DEF,	CDAA => CD	
		assertEquals("CD", stringHelper.truncateAInFirst2Positions("AACD"));	
		assertEquals("CD", stringHelper.truncateAInFirst2Positions("ACD"));	
	}

}
