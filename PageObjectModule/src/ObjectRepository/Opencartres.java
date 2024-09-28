package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Opencartres {

	WebDriver driver;
public Opencartres(WebDriver driver)
{
this.driver=driver;
}
By res1=By.xpath("//a[contains(text(), 'Register')]");
By name=By.xpath("//input[@name='firstname']");
By lastname=By.xpath("//input[@name='lastname']");
By email=By.xpath("//input[@name='email']");
 
public WebElement resit()
	{
		 return driver.findElement(res1);
		
	}

public WebElement firstname()
{
 return driver.findElement(name);	
}

public WebElement lastname()
{
 return driver.findElement(lastname);	

}
public WebElement email()
{
 return driver.findElement(email);	
}

}
