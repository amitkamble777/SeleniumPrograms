package PageObjectModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Searchrecord {
	
	WebDriver driver;
	public Searchrecord(WebDriver driver)
	{
	this.driver=driver;
	}
	
	By search= By.xpath("//div[@id='iconsNewSearch']");
	
	By serc= By.xpath("//input[@id='ivInSearchInput']");
	
	public WebElement Search()
	{
		return driver.findElement(search);
	}
	
	public WebElement sear()
	{
		return driver.findElement(serc);
	
	}
}
