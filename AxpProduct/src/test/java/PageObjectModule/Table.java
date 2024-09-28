package PageObjectModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Table {

	WebDriver driver; 
	
	public Table(WebDriver driver)
	{
		this.driver= driver;
	}
	By workc=By.xpath("//input[@id='workpaceR0']");
	By work=By.xpath("//input[@id='workpaceR0']");
	By yearc=By.xpath("//input[@name='No of Years']");
	By year=By.xpath("//input[@name='No of Years']");
	By designationc=By.xpath("//input[@id='designationR0']");
	By designation=By.xpath("//input[@id='designationR0']");
	By button= By.xpath("//button[contains(text(), 'Ok')]");
	
	public WebElement workc()
	{
     return driver.findElement(workc);
	}
	public WebElement work()
	{
     return driver.findElement(work);
	}
	public WebElement yearc()
	{
     return driver.findElement(yearc);
	}
	public WebElement year()
	{
     return driver.findElement(year);
	}

public WebElement designationc()
{
 return driver.findElement(designationc);
}
public WebElement designation()
	{
     return driver.findElement(designation);
	}
public WebElement button()
{
 return driver.findElement(button);
}	
	
}
