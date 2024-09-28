package PageObjectFactor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	WebDriver driver;
	
	public Login(WebDriver driver) {
		
		this.driver= driver;
		PageFactory.initElements(driver,this);
		}

	@FindBy(xpath="//a[@title='Log in']")
	   WebElement login;
	
	@FindBy(xpath="//span[@id='select2-axSelectProj-container']")
	   WebElement dropd;
	
	@FindBy(xpath="//input[@type='search']")
	   WebElement schema;
	
	@FindBy(xpath="(//li[contains(text(), 'post9124')])[2]")
	   WebElement openschema;
	
	@FindBy(xpath="//input[@name='axUserName']")
	   WebElement username;
	
	@FindBy(xpath="//input[@name='btnNext']")
	   WebElement next;
	
	
	@FindBy(xpath="//input[@id='axPassword']")
	   WebElement password;
	
	
	@FindBy(xpath="(//input[@title='Login'])[1]")
	   WebElement logins;
	
public WebElement log()
	{
	return login;
		
	}
public WebElement dropd()
{
return dropd;
	
}
public WebElement schema()
{
return schema;
	
}
public WebElement openchema()
{
return openschema;
	
}
public WebElement username()
{
return username;
	
}
public WebElement button()
{
return next;
	
}
public WebElement password()
{
return password;
}

public WebElement Login()
{
return logins;
}






}
