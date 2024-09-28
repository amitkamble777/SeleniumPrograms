package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/*
 Pge object module no need to user  driver.find
 In page object without using f=driver.findelement - -we can locate the element 
 In page object  we can locate the elements using by.locator
 All the object should be created from driver.findby element
 All Objects should be defined on the  top 
 
 Methods should be define on the bottom
 Method an not give a without return type
 
 2 METHODS TO USE DIFFERNE CLASS
 1.Use interitance of that class 
 2.Create the object of that class and invoke the methods of it 
 
*/
public class landingPage {
	
	public WebDriver driver;
	  By abd=By.xpath("(//a[contains(text(), 'Platform')])[2]");
	  WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));// 10 seconds timeout

	// Wait for the element to be clickable
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[contains(text(), 'Platform')])[2]")));
	

public landingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	{
		this.driver=driver;
	}	
}
public WebElement partner()

{
	return driver.findElement((By) element);
}
	

}
