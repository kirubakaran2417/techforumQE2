package com.Selenium.datap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driversetup {
	public static WebDriver driver;

	public static WebDriver getdriver() {
		System.setProperty("webdriver.chrome.driver", "/home/kkirubakaran/Downloads/chromedriver_linux64(9)/chromedriver");
		driver=new ChromeDriver();
		//how to open a webpage
		driver.get("https://www.mycontactform.com");
		return driver;
	}
	
}
