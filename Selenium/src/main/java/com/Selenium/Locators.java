package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators 
{
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.chrome.driver", "/home/kkirubakaran/Downloads/chromedriver_linux64(8)/chromedriver");
    	WebDriver d=new ChromeDriver();
    	d.get("https://www.mycontactform.com/");
    	//locating webelements-using locators
    	/*
    	 * id 
    	 * name
    	 * classname
    	 * link text
    	 * xpath 
    	 * css selector
    	 * tagname
    	 */
    	
    	//d.findElement(By.linkText("Sample Forms")).click();
    	WebElement sampleformstab=d.findElement(By.linkText("Sample Forms"));
    	sampleformstab.click();
    	
    	d.findElement(By.id("subject")).sendKeys("selenium");
    	
    	
    }
}
