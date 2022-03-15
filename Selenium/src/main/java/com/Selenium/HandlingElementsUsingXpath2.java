package com.Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingElementsUsingXpath2 
{
    public static void main( String[] args ) throws IOException
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
    	/*
    	 * absolute xpath-/-->using html nodes
    	 * relative xpath-//-->using attributes(recommended)
    	 * 
    	 * //tagname[@attributename='attributevalue']
    	 * (//input[@name='email_to[]'])[2]
    	 * //tagname[@attributename='attributevalue'][@attributename='attributevalue']
    	 * //tagname[@attributename='attributevalue' or @attributename='attributevalue']
    	 * 
    	 */
    	WebElement dropdown=d.findElement(By.id("q3"));
    	Select s=new Select(dropdown);
    	s.selectByVisibleText("Third Option");
    	
    	File src=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(src, new File("/home/kkirubakaran/Desktop/aa.jpg"));
    	}
}
