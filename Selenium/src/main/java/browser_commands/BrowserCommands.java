package browser_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "/home/kkirubakaran/Downloads/chromedriver_linux64(9)/chromedriver");
	WebDriver d=new ChromeDriver();
	
	//how to open a webpage
	d.get("https://www.google.com");
	//d.navigate().to("https://www.amazon.in");
	
	//ho to maximize the window
	d.manage().window().maximize();
	
//	//Webdriver browser commands
//	String title=d.getTitle();
//	System.out.println(title);
//
//	//scroll the page using javascript executor
//	JavascriptExecutor js=(JavascriptExecutor)d;
//	js.executeScript("window.scrollBy(0,450)","");
//    Thread.sleep(3000);
//	WebElement img=d.findElement(By.xpath("//div[@class='a-section a-spacing-none fluid-image-container']//img[contains(@alt,'Mobiles')]"));
//	System.out.println(img.isDisplayed());
//	System.out.println(img.isEnabled());
//	img.click();
//	
//	
	WebElement txtbox=d.findElement(By.name("q"));
	String b=txtbox.getAttribute("class");
	System.out.println(b);

	System.out.println(txtbox.getClass());

	}
}

