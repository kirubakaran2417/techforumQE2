package com.fb.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POM {

	WebDriver driver;
	
	public POM(WebDriver driver) {
		this.driver=driver;
	}
	
	By register=By.xpath("//div[@class='_6ltg']//a");
	By firstname=By.xpath("//div[@id='reg_form_box']//input[@name='firstname']");
	By lastname=By.name("lastname");
    By mobile=By.name("reg_email__");
    By day=By.name("birthday_day");
    By month=By.name("birthday_month");
    By year=By.name("birthday_year");
    By gender=By.xpath("(//input[@name='sex'])[2]");
    By submit=By.name("websubmit");
    By verify=By.xpath("//div[@class='_5v-0 _53im']//div");
    
    public WebElement register() {
		return driver.findElement(register);
	}
	public WebElement firstname() {
		return driver.findElement(firstname);
	}
	public WebElement lastname() {
		return driver.findElement(lastname);
	}
	public WebElement mobile() {
		return driver.findElement(mobile);
	}
	public WebElement day() {
		return driver.findElement(day);
	}
	public WebElement month() {
		return driver.findElement(month);
	}
	public WebElement year() {
		return driver.findElement(year);
	}
	public WebElement gender() {
		return driver.findElement(gender);
	}
	public WebElement submit() {
		return driver.findElement(submit);
	}
	public WebElement verify() {
		return driver.findElement(verify);
	}
}
