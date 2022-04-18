package sync;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class syncandtimeouts {
//timeoutecxeption
	//no suchelement exception
	
	/*static wait
	 *    Thread.sleep(3000);
	 */
	
	/*
	 * Dynamic
	 * 
	 * pageloadtimeout
	 * implicitwait
	 * webdriverwait
	 * fluentwait
	 */
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/kkirubakaran/Downloads/chromedriver_linux64(9)/chromedriver");
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//how to open a webpage
		d.get("https://www.google.com");
		d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		WebDriverWait wait=new WebDriverWait(d, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(webelement name));
		
		Wait<WebDriver> wait2=new FluentWait<WebDriver>(d)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		
		WebElement txtbox=wait2.until(new Function<WebDriver, WebElement>(){
			{
		}

			@Override
			public WebElement apply(WebDriver t) {
				// TODO Auto-generated method stub
				return d.findElement(By.name("q"));
			}
		}
	}
}
