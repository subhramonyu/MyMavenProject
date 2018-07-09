package PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basetest {
	
	 protected WebDriver driver;
/*	public WebDriver setDriver( String browserName,String url){
		//System.setProperty(key, value)
		if (browserName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\subhramonyu.das\\Downloads\\chromedriver_win32\\");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			return driver;
		}
		return driver;
	}*/
	
	public WebDriver chromeDriver(String url) {
		// for chrome
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize() ;
		driver.get(url);
		return driver;
	}
	
}
