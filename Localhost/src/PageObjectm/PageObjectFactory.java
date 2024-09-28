package PageObjectm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectFactory {
WebDriver driver;
 
public PageObjectFactory(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

@FindBy(xpath="//input[@id='name000F1']")
WebElement name;

@FindBy(xpath="//input[@id='city000F1']")
WebElement city;

@FindBy(xpath="//input[@id='amount000F1']")
WebElement amount;

@FindBy(xpath="//tr[@id='sp2R001F2']")
WebElement gridrow;

@FindBy(xpath="//input[@id='collage000F2']")
WebElement collage;

@FindBy(xpath="//input[@id='mobile000F2']")
WebElement Mobile;

@FindBy(xpath="//a[@title='save']")
WebElement Save;

public WebElement name()
{
return name;	
}
public WebElement city()
{
return city;	
}
public WebElement amount()
{
return amount;	
}
public WebElement gridrow()
{
return gridrow;

}
public WebElement collage()
{
return collage;	
}
public WebElement mobile()
{
return Mobile;	
}
public WebElement save()
{
return Save;	
}
}