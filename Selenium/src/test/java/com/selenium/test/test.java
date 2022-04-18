package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class test {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "/home/kkirubakaran/Downloads/chromedriver_linux64 (1)/chromedriver");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.eduvidya.com/");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Schools")).click();
	driver.switchTo().frame("aswift_3");
	driver.findElement(By.id("dismiss-button")).click();
	Thread.sleep(2000);
	System.out.println(driver.getTitle());
	Select s=new Select(driver.findElement(By.id("ddl_Category")));
	s.selectByValue("1");
	Select s1=new Select(driver.findElement(By.id("ddl_City")));
	s1.selectByValue("2");
	driver.findElement(By.id("btnSearch")).click();
	System.out.println(driver.getTitle());
	boolean schoolsearch=driver.findElement(By.linkText("Schools Search")).isDisplayed();
	if(schoolsearch=true) {
		System.out.println("results are displayed");
	}
	else
	{
		System.out.println("results are not displayed");

	}
}
}