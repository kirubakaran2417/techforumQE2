package com.facebook.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/kkirubakaran/Downloads/chromedriver_linux64(9)/chromedriver");
		WebDriver d=new ChromeDriver();
		
		//how to open a webpage
		d.get("https://www.google.com");
		POM p=new POM(d);
	      p.sr().sendKeys("rrr");
	}

}
