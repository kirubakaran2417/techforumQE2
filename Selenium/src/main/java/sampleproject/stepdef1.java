package sampleproject;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;

public class stepdef1 {
	
	WebDriver driver;
	
	@Given(" ")
	public void driversetup() {
	    	driver=Driversetup.invokebrowser();
	    	
	}
}
