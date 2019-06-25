/**
 * 
 */
package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Configuration.DriverFactory;
import PageObject.loginPage;

/**
 * @author subhramonyu.das
 *
 */
public class ValidateLoginPage extends DriverFactory{



	@Test
	public void test() throws InterruptedException{
		
		WebDriver driver=Configuration.DriverFactory.chromeDriver("https://www.google.com/gmail/about/#");
		System.out.println("url is launched");
		loginPage login = new loginPage(driver);
		login.clickOntheCreateAccount();
		
		//click on the Create account page
		
	}
}
