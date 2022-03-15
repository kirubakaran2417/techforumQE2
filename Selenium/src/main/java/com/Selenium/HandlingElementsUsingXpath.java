package com.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingElementsUsingXpath 
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
    	WebElement left=d.findElement(By.id("left_col_wrapper")); 
    	List<WebElement> links=left.findElements(By.tagName("a")); 
    	int count=links.size(); 
    	System.out.println("The no. of links in the left section: " +count); 
    	
    	}
}
