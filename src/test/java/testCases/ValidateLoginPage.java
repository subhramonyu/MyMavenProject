/**
 * 
 */
package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PageObject.Basetest;
import PageObject.loginPage;

/**
 * @author subhramonyu.das
 *
 */
public class ValidateLoginPage extends Basetest{

	//private static final WebDriver driver ;

	@Test
	public void test() throws InterruptedException{
		
		Basetest b = new Basetest();
		WebDriver driver=b.chromeDriver("https://www.google.com/gmail/about/#");
		System.out.println("url is launched");
		loginPage login = new loginPage(driver);
		login.clickOntheCreateAccount();
		
		//click on the Create account page
		
	}
}
