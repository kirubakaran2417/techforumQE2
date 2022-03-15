package com.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlesearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/kkirubakaran/Downloads/chromedriver_linux64(8)/chromedriver");
    	WebDriver d=new ChromeDriver();
    	d.manage().window().maximize();
    	d.get("https://www.google.com/");
    	d.findElement(By.name("q")).sendKeys("selenium");
    	Thread.sleep(3000);
    	d.findElement(By.name("btnK")).click();
    	List<WebElement> links=d.findElements(By.xpath("//div[@class='hlcw0c']//h3[contains(@class,'LC20lb')]"));
    	for(int i=0;i<links.size();i++) {
    		
    		System.out.println(links.get(i).getText());
	}}

}
