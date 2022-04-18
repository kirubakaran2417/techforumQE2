package com.demo.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class test {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "/home/kkirubakaran/Downloads/chromedriver_linux64 (1)/chromedriver");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.fb.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//div[@class='_6ltg']//a")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@id='reg_form_box']//input[@name='firstname']")).sendKeys("shaik");
	driver.findElement(By.name("lastname")).sendKeys("kumar");
	driver.findElement(By.name("reg_email__")).sendKeys("987654321");
	WebElement date=driver.findElement(By.name("birthday_day"));
	Select s=new Select(date);
	s.selectByVisibleText("17");
	WebElement month=driver.findElement(By.name("birthday_month"));
	Select s1=new Select(month);
	s1.selectByIndex(4);
	WebElement year=driver.findElement(By.name("birthday_year"));
	Select s2=new Select(year);
	s2.selectByValue("1990");
	driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
	driver.findElement(By.name("websubmit")).click();
	Thread.sleep(2000);
	WebElement text=driver.findElement(By.xpath("//div[@class='_5v-0 _53im']//div"));
	System.out.println(text.getText());
}
}
