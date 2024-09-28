package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Phonepad {

	WebDriver driver1;
	
	public Phonepad(WebDriver driver)
	{
	this.driver1=driver;	
	}
	By phone=By.xpath("(//a[contains(text(),'Phones & PDAs')])[1]");
	
	
	public WebElement phonepad()
	{
		return driver1.findElement(phone);
		
	}
}
	