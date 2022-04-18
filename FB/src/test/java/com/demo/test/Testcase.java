package com.demo.test;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.fb.DriverSetup.DriverSetup;
import com.fb.POM.POM;

public class Testcase {
	static WebDriver driver;
	@BeforeTest
	public static void main() {
		driver=DriverSetup.getDriver();
	}
	@Test
	public void test1() {
		POM p=new POM(driver);
		p.register().click();
	}
	@Test
	public void test2() throws InterruptedException {
		POM p=new POM(driver);
		Thread.sleep(2000);
		p.firstname().sendKeys("devesh");
	}
	@Test
	public void test3() {
		POM p=new POM(driver);
		p.lastname().sendKeys("kumar");
	}
	@Test
	public void test4() {
		POM p=new POM(driver);
		p.mobile().sendKeys("987654321");
	}
	@Test
	public void test5() {
		POM p=new POM(driver);
		Select s=new Select(p.day());
		s.selectByVisibleText("17");
	}
	@Test
	public void test6() {
		POM p=new POM(driver);
		Select s1=new Select(p.month());
		s1.selectByIndex(4);
	}
	@Test
	public void test7() {
		POM p=new POM(driver);
		Select s1=new Select(p.year());
		s1.selectByValue("1990");
	}
	@Test
	public void test8() {
		POM p=new POM(driver);
		p.gender().click();
	}
	@Test
	public void test9() {
		POM p=new POM(driver);
		p.submit().click();
	}
	@Test
	public void test10() throws InterruptedException {
		Thread.sleep(2000);

		POM p=new POM(driver);
		System.out.println(p.verify().getText());
	}
}
