package sampleproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driversetup {
		public static WebDriver driver;
	public static WebDriver invokebrowser() {
		driver=new ChromeDriver();
		return driver;
	}
}
