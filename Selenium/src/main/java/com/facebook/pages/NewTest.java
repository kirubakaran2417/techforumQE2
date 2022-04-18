package com.facebook.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	private WebDriver d;
  @BeforeTest
  public void f() {
       d=driversetup.getdriver();
  }
  @Test
  public void test1() {
	  POM p=new POM(d);
	  
      p.sr().sendKeys("rrr"); }
}
