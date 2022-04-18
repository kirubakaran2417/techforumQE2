package com.facebook.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POM {
	
public WebDriver driver;

public POM(WebDriver driver) {
	this.driver = driver;
}

By search=By.name("q");

public WebElement sr() {
	return driver.findElement(search);
}
}
