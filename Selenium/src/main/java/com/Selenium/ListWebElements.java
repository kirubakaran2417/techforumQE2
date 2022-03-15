package com.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ListWebElements {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "/home/kkirubakaran/Downloads/chromedriver_linux64(8)/chromedriver");
	ChromeOptions options =new ChromeOptions();
	options.addArguments("--headless");
	options.addArguments("--disable-notifications");
	WebDriver d=new ChromeDriver(options);
	d.get("https://www.mycontactform.com/");
	WebElement sampleformstab=d.findElement(By.linkText("Sample Forms"));
	sampleformstab.click();
	List<WebElement> noOfcheckboxes=d.findElements(By.xpath("*"));
	System.out.println("Totla no od checkboxes present in this page: "+noOfcheckboxes.size());
}
}
