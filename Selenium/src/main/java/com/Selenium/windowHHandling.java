package com.Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHHandling {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/kkirubakaran/Downloads/chromedriver_linux64(8)/chromedriver");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://about.google/products/");
		d.findElement(By.linkText("Learn More")).click();
		System.out.println(d.getTitle());
		Set<String> ids=d.getWindowHandles();
		Iterator<String> i1=ids.iterator();
		while (i1.hasNext()) {
			String cw =  i1.next();
			d.switchTo().window(cw);
			System.out.println(d.getTitle());
		}
		
}}
