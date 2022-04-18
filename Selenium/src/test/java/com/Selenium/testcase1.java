package com.Selenium;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testcase1 {
@BeforeTest
  public void beformethod() {
	  System.out.println("======================================");

	  System.out.println("opening browser");
  }
  @Test(enabled = false)
  public void sample1() {
	  System.out.println("Testcase1");
  }
  @Test(priority = 2)
  public void sample2() {
	  System.out.println("Testcase2");
  }
  @Test(dependsOnMethods = "sample2")
  public void sample3() {
	  System.out.println("Testcase3");
  }
  @AfterTest
  public void aftermethod() {
	  System.out.println("closing browser");
  }
}
