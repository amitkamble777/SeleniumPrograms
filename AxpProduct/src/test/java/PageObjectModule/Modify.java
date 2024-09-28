package PageObjectModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Modify {
	
	WebDriver driver;
	
	public Modify (WebDriver driver)
	{
		
		this.driver=driver;
	}

	By list=By.xpath("//a[@title='List View']");
	By check=By.xpath("(//input[@name='chkItem'])[1]");
	By hyperlink=By.xpath("//a[contains(text(), 'amit')]");
	By emp= By.xpath("//input[@id='emp000F1']");
	By city= By.xpath("//input[@id='city000F1']");
	By age= By.xpath("//input[@id='age000F1']");
	By radio= By.xpath("//input[@value='B']");
    By submit= By.xpath("//a[@title='save']");
	
	public WebElement list()
	{
		return driver.findElement(list);
	}
	
	public WebElement check()
	{
		return driver.findElement(check);
	}
	
	public WebElement hyper()
	{
		return driver.findElement(hyperlink);
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
	public WebElement sbumit()
	{
		return driver.findElement(submit);
	}
				
	
	
	
	
	
	
}
