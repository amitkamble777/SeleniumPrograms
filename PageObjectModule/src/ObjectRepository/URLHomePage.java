package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class URLHomePage {
	  WebDriver driver;
	
	public URLHomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver= driver;
	}
By signin =	By.xpath("//a[@title= 'Already a user? Sign in']");
By user =By.xpath("//input[@id='login1']");
By pass =By.xpath("//input[@id='password']");
By go =By.xpath("//input[@name='proceed']");

public WebElement signin()
{
	return driver.findElement(signin);
}

 public WebElement email()
 {
	return driver.findElement(user);
 }
public WebElement password()
{
return driver.findElement(pass);	
}
public WebElement Go()
{
return driver.findElement(go);	
}
 
 
 
}




