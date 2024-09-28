package PageObjectModule;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Login {
WebDriver driver;
public Login (WebDriver driver)
	{
		this.driver=driver;
	}

	By login =By.xpath("//a[@title='Log in']");
	By dropr= By.xpath("//span[@id='select2-axSelectProj-container']");
	By schema= By.xpath("//input[@type='search']"); // enter schema value
	By schopen= By.xpath("(//li[contains(text(), 'post9124')])[2]"); // click
	By user= By.xpath("//input[@name='axUserName']");
	By nextb= By.xpath("//input[@name='btnNext']");
	By pass= By.xpath("//input[@id='axPassword']");
	By log= By.xpath("(//input[@title='Login'])[1]");

//	By next= By.xpath("//input[@name='btnNext']");
//	By next= By.xpath("//input[@name='btnNext']");
	
public WebElement login()
{
 return driver.findElement(login);
}
public WebElement drop()
{
 return driver.findElement(dropr);
}
public WebElement Schema()
{
 return driver.findElement(schema);
}
public WebElement SchemaOpen()
{
 return driver.findElement(schopen);
}
public WebElement user()
{
 return driver.findElement(user);
}
public WebElement button()
{
 return driver.findElement(nextb);
}
public WebElement password()
{
 return driver.findElement(pass);
}
public WebElement log()
{
 return driver.findElement(log);
}

}