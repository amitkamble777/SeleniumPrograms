package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage {
	WebDriver driver;

public loginpage(WebDriver driver)
{
this.driver=driver;
}
By login=By.xpath("(//a[contains(text(), 'Login')])[1]");	
By username= By.xpath("//input[@name='email']");
By password= By.xpath("//input[@name='password']");
	
public WebElement login()
{
 return driver.findElement(login);	
}

public WebElement username()
{
return driver.findElement(username);	
}
public WebElement password()
{
return driver.findElement(password);	
}
}
