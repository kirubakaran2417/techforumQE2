package com.selenium.test;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class CalculatorTests {

	
	
	/*
	 * to add two umbers
	 * to subtract two numbers
	 * tp multiply two numbers
	 * 
	 */
	
	Calculator mycalc=new Calculator();
	@Test
	public void addtwopositivenumbers() {
		int expectedresult=30;
		int actualresult=mycalc.Add(10,20);
		assertEquals(expectedresult,actualresult);
	}
	@Test
	public void addtwonegativenumbers() {
		int expectedresult=-30;
		int actualresult=mycalc.Add(-10,-20);
		assertEquals(expectedresult,actualresult);
	}
}
