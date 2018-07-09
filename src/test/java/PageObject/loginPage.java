/**
 * 
 */
package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author subhramonyu.das
 *
 */
public class loginPage {

	private static final String CreateAccountLink = "//a[contains(text(),'Sign In')]";
	
	private WebDriver driver;

	public loginPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	 
	
	@FindBy(xpath=CreateAccountLink)
	public WebElement CreateAccount;
	
	
	
	
	public void clickOntheCreateAccount() {
		try {
			Thread.sleep(1000);
			//WebElement CreateAccount=driver.findElement(By.xpath("//a[contains(text(),'Sign In')]"));
			CreateAccount.click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
