package Configuration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	
	 protected WebDriver driver;

	public static WebDriver chromeDriver(String url) {
		// for chrome
		
		
		//System.setProperty("webdriver.chrome.driver",
			//	System.getProperty("user.dir") + "/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize() ;
		driver.get(url);
		return driver;
	}
	
}
