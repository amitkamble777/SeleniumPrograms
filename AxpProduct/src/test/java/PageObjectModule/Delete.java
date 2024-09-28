package PageObjectModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Delete {

WebDriver driver;	
	public Delete(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By list=By.xpath("//a[@title='List View']");
	By check =By.xpath("(//input[@name='chkItem'])[1]");
	By remove =By.xpath("//span[contains(text(), 'remove')]");
	By yes=By.xpath("//button[@title='Yes']");
	
public WebElement list()
	{
		return driver.findElement(list);
	}

public WebElement check()
{
	return driver.findElement(check);
}
public WebElement remove()
{
	return driver.findElement(remove);
}
public WebElement yes()
{
	return driver.findElement(yes);
}




}



	
