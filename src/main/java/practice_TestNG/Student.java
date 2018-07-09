package practice_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Student {
	
	void show() {
		System.out.println("Show Student");
	}

	public boolean SearchForElement(WebDriver driver, WebElement anElement) {
	
		boolean bValue = true;
		String id1 = "abcdnb123";
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(anElement));
		return bValue;
		
	}
	
}




