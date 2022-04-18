package objectRepository;

import org.openqa.selenium.WebDriver;

import com.facebook.pages.Login;

public class POM {

	
static /*
 * normal approach 
 * page factory
 */
	
	/*
	 * go to the facebook page
	 * get the title of login page
	 * 
	 */
	WebDriver driver;
	public static void main(String[] args) {
		Login l=new Login(driver);
		l.setUsername("kiruba");
		l.setPassword("password");
		l.loginclick();
		l.titletext();
	};
}
