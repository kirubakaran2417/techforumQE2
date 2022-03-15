package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Propertyfilehandling {
	
WebDriver driver;
FileInputStream fis;
Properties p;
   public WebDriver setdriver() {
	   driver=Driversetup.getDriver();
	   return driver;
   }
   
   public void setusername() throws IOException {
	   fis=new FileInputStream("/home/kkirubakaran/Tech Forum QEA2/Selenium/Resources/config.properties");
	   p=new Properties();
	   p.load(fis);
	   driver.findElement(By.id(p.getProperty("username_id"))).sendKeys("dhinesh");
   }
   public void setpassword() {
	   driver.findElement(By.id("password")).sendKeys("dhinesh");
   }
   
   public static void main(String[] args) throws IOException {
	Propertyfilehandling p=new Propertyfilehandling();
	p.setdriver();
	p.setusername();
	p.setpassword();
}
}
