package com.dgsh.helper;

import static org.junit.Assert.*;

import javax.swing.text.StyledEditorKit.BoldAction;

import org.junit.Test;

public class StringHelperTest {
	
	
	StringHelper stringHelper = new StringHelper();
	@Test
	public void testTruncateAInFirst2Positions_Ainfirst2Positions() {
		//AACD => CD,	ACD => CD,	CDEF => DEF,	CDAA => CD	
		assertEquals("CD", stringHelper.truncateAInFirst2Positions("AACD"));	
		assertEquals("CD", stringHelper.truncateAInFirst2Positions("ACD"));	
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AinFirstPosition(){
		assertEquals("CD", stringHelper.truncateAInFirst2Positions("ACD"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AinThirdNFourthPositions() {
		assertEquals("DEF",stringHelper.truncateAInFirst2Positions("ADEF"));
		assertEquals("CD",stringHelper.truncateAInFirst2Positions("CDAA"));
	}
	
	//ABCD => false,	ABAB => true,	AB => true,	A => false
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
		assertEquals(true, stringHelper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario() {
		assertEquals(true, stringHelper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicThirdScenario() {
		assertEquals(true, stringHelper.areFirstAndLastTwoCharactersTheSame("AB"));
	}
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicFourthScenario() {
		assertEquals(false, stringHelper.areFirstAndLastTwoCharactersTheSame("A"));
	}
}
