package browser_commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "/home/kkirubakaran/Downloads/chromedriver_linux64(8)/chromedriver");
	WebDriver d=new ChromeDriver();
	
	//how to open a webpage
	d.get("https://www.amazon.in");
	//d.navigate().to("https://www.amazon.in");
	
	//ho to maximize the window
	d.manage().window().maximize();
	
	//Webdriver browser commands
	String title=d.getTitle();
	System.out.println(title);
	System.out.println(d.getTitle());
	d.get("https://www.flipkart.com");
	d.navigate().back();
	d.navigate().forward();
	
	
	

	}
}

