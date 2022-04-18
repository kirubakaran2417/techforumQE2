package com.facebook.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class loginPagefacotory {
	WebDriver driver;

	public loginPagefacotory(WebDriver driver) {

		this.driver = driver;
		//call initelements method by using page factoryreference
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.NAME,using="q")
	WebElement search;
	@FindBy(how=How.NAME,using="btnk")
	WebElement button;
	
	
	public void search() {
		search.sendKeys("hello");
	}
}
