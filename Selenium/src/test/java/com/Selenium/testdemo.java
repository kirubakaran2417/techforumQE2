package com.Selenium;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testdemo {
	@BeforeTest
	public void initial() {
		
		System.out.println("Im before test");
	}
@Test(groups= {"validTestcase"})
public void add(String uname) {
	
	System.out.println("Im add method"+uname);
	AssertJUnit.assertEquals(false, true);
}

@Test(groups= {"validTestcase"})
public void add2(String pwd) {
	
	System.out.println("Im add method"+pwd);
	AssertJUnit.assertEquals(false, true);
}
@Test(groups= {"InvalidTestcase"})
public void sub1() {
	
	System.out.println("Im sub method");
	AssertJUnit.assertEquals(false, true);
}
@Test(groups= {"InvalidTestcase"})
public void sub2() {
	
	System.out.println("Im add method");
	AssertJUnit.assertEquals(false, true);
}
@Test(groups= {"validTestcase","InvalidTestcase"})

public void common() {
	
	System.out.println("Im common method");
	AssertJUnit.assertEquals(false, true);
}
}
