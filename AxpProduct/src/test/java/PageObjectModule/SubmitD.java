package PageObjectModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SubmitD {
	WebDriver driver;
public SubmitD (WebDriver driver)
	{
		this.driver=driver;
}
	
	By search = By.xpath("//input[@id='globalSearchinp']");
	By name= By.xpath("//input[@id='globalSearchinp']");  //Page object file 
	By Open= By.xpath("(//span[contains(text(),'Page object file')])[2]");  //Page object file 
	By emp= By.xpath("//input[@id='emp000F1']");
	By city= By.xpath("//input[@id='city000F1']");
	By age= By.xpath("//input[@id='age000F1']");
	By radio= By.xpath("//input[@value='A']");
	By table= By.xpath("(//span[contains(text(), 'apps')])[2]");
	By submit= By.xpath("//a[@title='save']");
	
public WebElement search()
	{
		return driver.findElement(search);
	}
	public WebElement nam()
	{
		return driver.findElement(name);
	}
	public WebElement open()
	{
		return driver.findElement(Open);
	}
	public WebElement emp()
	{
		return driver.findElement(emp);
	}
	
	public WebElement city()
	{
		return driver.findElement(city);
	}
	public WebElement age()
	{
		return driver.findElement(age);
	}
	public WebElement radio()
	{
		return driver.findElement(radio);
	}
	public WebElement submit()
	{
		return driver.findElement(submit);
	}
	
}
