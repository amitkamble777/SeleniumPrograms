package PageObjectm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Delete {
WebDriver driver;
public Delete(WebDriver driver)
	{
		this.driver=driver;
	}
	By lis= By.xpath("//a[@title='List View']");
	By check= By.xpath("//input[@name='chkItem' and @Value='1']");
	By hyperlink= By.xpath("(//a[ @data-row='0' and contains(text(), 'raju')])[1]");
    By remove= By.xpath("//a[@title='Delete']");
	By yes= By.xpath("//button[@title='Confirm']");
	
	public WebElement listv()
	{
		return driver.findElement(lis);
	}
	
	public WebElement Checklist()
	{
		return driver.findElement(check);
	}
	public WebElement Hyperlink()
	{
		return driver.findElement(hyperlink);
	}

	public WebElement Remove()
	{
		return driver.findElement(remove);
	}
	public WebElement Confirmation()
	{
		return driver.findElement(yes);
	}
	
}
