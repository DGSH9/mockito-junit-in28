package com.dgsh.helper;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {
	
	private String input;
	private String expectedOutput;
	
	
	public StringHelperParameterizedTest(String input, String expectedOutput) {
		super();
		this.input = input;
		this.expectedOutput = expectedOutput;
	}

	//AACD => CD	ACD => CD
	StringHelper stringHelper = new StringHelper();
	
	@Parameters
	public static Collection<String[]> testConditions(){
		String expectedOutputes[][]= {{"AACD","CD"},{"ACD","CD"}};
		return Arrays.asList(expectedOutputes);
	}
	
	
	@Test
	public void testTruncateAInFirst2Positions() {
		//AACD => CD,	ACD => CD,	CDEF => DEF,	CDAA => CD	
		assertEquals(expectedOutput, stringHelper.truncateAInFirst2Positions(input));	
	}
	
	
	
}
