package com.facebook.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driversetup {
	public static WebDriver d;

	public static WebDriver getdriver() {
		System.setProperty("webdriver.chrome.driver", "/home/kkirubakaran/Downloads/chromedriver_linux64(9)/chromedriver");
		d=new ChromeDriver();
		
		//how to open a webpage
		d.get("https://www.google.com");
		return d;
	}
}
