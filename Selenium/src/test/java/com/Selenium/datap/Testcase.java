package com.Selenium.datap;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testcase {

	WebDriver driver;
	
	@BeforeMethod
	public void setupdriver() {
		driver=Driversetup.getdriver();
	}
	
	@Test(dataProvider = "testdata")
	public void login(String username,String password) {
		
		POM p=new POM(driver);
		p.username().sendKeys(username);
		p.password().sendKeys(password);
		
		}
	@DataProvider(name="testdata")
	public Object[][] dataprovidermethod(){
		Object[][] data=new Object[3][2];
		//1st row
		data[0][0]="dhinesh";
		data[0][1]="password";
		//2nd row
		data[1][0]="kiruba";
		data[1][1]="password";
		//3rd row
		data[2][0]="karan";
		data[2][1]="password";
		return data;
	}
	@AfterMethod
	public void kill() {
		driver.close();
	}
	
}
