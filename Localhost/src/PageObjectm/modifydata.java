package PageObjectm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class modifydata {
WebDriver driver;
	public modifydata(WebDriver driver)
	{
		this.driver =driver;	
	}
	
	By list= By.xpath("//a[@title='List View']");
	By check= By.xpath("//input[@name='chkItem' and @Value='1']");
	By hyperlink= By.xpath("(//a[ @data-row='0' and contains(text(), 'amit')])[1]");
	By name= By.xpath("//input[@id='name000F1']");
	By city= By.xpath("//input[@id='city000F1']");
	By amount= By.xpath("//input[@id='amount000F1']");
	By grid= By.xpath("//tr[@id='sp2R001F2']");
	By cole= By.xpath("//input[@id='collage001F2']");
	By mobile= By.xpath("//input[@id='mobile001F2']");
	By save= By.xpath("//a[@title='save']");
	
	
	public WebElement list()
	{
		return driver.findElement(list);
	}
	public WebElement check()
	{
		return driver.findElement(check);
	}
	public WebElement Hyper()
	{
		return driver.findElement(hyperlink);
	}
	public WebElement name()
	{
		return driver.findElement(name);
	}
	public WebElement city()
	{
		return driver.findElement(city);
	}
	public WebElement amount()
	{
		return driver.findElement(amount);
	}
	public WebElement grid()
	{
		return driver.findElement(grid);
	}
	
	
  public WebElement collage()
	{
		return driver.findElement(cole);
	}
	public WebElement mobile()
	{
		return driver.findElement(mobile);
	}
	public WebElement save()
	{
		return driver.findElement(save);
	}

}
