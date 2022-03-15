package com.Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertss {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/kkirubakaran/Downloads/chromedriver_linux64(8)/chromedriver");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demoqa.com/alerts");
		d.findElement(By.id("confirmButton")).click();
		Alert a=d.switchTo().alert();
		a.dismiss();
		
	}
}
