package com.facebook.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

	WebDriver driver;

	public Login(WebDriver driver) {

		this.driver = driver;
	}
	By titletext=By.xpath("//input[@id='pageTitle']");
	By username=By.xpath("//input[@id='email']");
	By password=By.xpath("//input[@id='pass']");
	By login=By.xpath("//[@name='login'");

	public void titletext() {
		String getText=driver.findElement(titletext).getText();
		System.out.println(getText);
	}
	public void setUsername(String strUsername) {
		driver.findElement(username).sendKeys(strUsername);
	}
	public void setPassword(String strpassword) {
		driver.findElement(password).sendKeys(strpassword);
	}
	public void loginclick() {
		driver.findElement(login).click();
	}
}
