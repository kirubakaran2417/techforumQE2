package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehover {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "/home/kkirubakaran/Downloads/chromedriver_linux64(8)/chromedriver");
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.jqueryui.com/");
	d.findElement(By.linkText("Droppable")).click();
	WebElement frame=d.findElement(By.cssSelector("iframe.demo-frame"));
	d.switchTo().frame(frame);
	WebElement src=d.findElement(By.id("draggable"));
	WebElement dest=d.findElement(By.id("droppable"));
	
	/*click
	 * drag and drop
	 * mousehover
	 * double click
	 * right click
	 */
	
	Actions a=new Actions(d);
	a.clickAndHold(src).moveToElement(dest).release(dest).build().perform();
	d.switchTo().defaultContent();
	
	//a.dragAndDrop(src, dest).build().perform();
}
}
