package com.fb.DriverSetup;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverSetup {

	static WebDriver driver;
	
	public static WebDriver getDriver() {
		System.out.println("Enter your browser choice: 1 for chrome & 2 for firefox");
		Scanner s=new Scanner(System.in);
		int choice=s.nextInt();
		switch (choice) {
		case 1:
			System.setProperty("webdriver.chrome.driver", "/home//Downloads/chromedriver_li/chromedriver");
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--disable-notifications");
			driver=new ChromeDriver(options);
			driver.get("https://www.fb.com/");
			driver.manage().window().maximize();
			break;
		case 2:
			//firefox code
			break;
		default:
			break;
		}
		
		return driver;
	}
	public static void main(String[] args) {
		getDriver();
	}
}
