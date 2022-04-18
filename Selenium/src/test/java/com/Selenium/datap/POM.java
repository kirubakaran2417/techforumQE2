package com.Selenium.datap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POM {
	
public WebDriver driver;

public POM(WebDriver driver) {
	this.driver = driver;
}

By username=By.name("user");
By password=By.name("pass");

public WebElement username() {
	return driver.findElement(username);
}

public WebElement password() {
	return driver.findElement(password);
	
}
}
