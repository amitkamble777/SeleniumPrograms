package PageObjectm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Submit {
WebDriver driver;
public Submit(WebDriver driver)
{
	this.driver=driver;
}

By nm=By.xpath("//input[@id='name000F1']");
By ct=By.xpath("//input[@id='city000F1']");
By amt=By.xpath("//input[@id='amount000F1']");
By coll=By.xpath("//input[@id='collage001F2']");
By mob =By.xpath("//input[@id='mobile001F2']");
By save= By.xpath("//a[@title='save']");

public WebElement name()
{
return driver.findElement(nm);	
}
public WebElement city()
{
return driver.findElement(ct);	
}
public WebElement amount()
{
return driver.findElement(amt);	
}
public WebElement collage()
{
return driver.findElement(coll);	
}
public WebElement mobile()
{
return driver.findElement(mob);	
}
public WebElement save()
{
return driver.findElement(save);	
}



}
