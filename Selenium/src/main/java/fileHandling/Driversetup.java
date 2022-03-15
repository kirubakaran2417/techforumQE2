package fileHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driversetup {
	static WebDriver d;
	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "/home/kkirubakaran/Downloads/chromedriver_linux64(8)/chromedriver");
		d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demoqa.com/login");
		return d;
	}
}
