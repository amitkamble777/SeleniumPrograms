package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectFactory {

	WebDriver driver;
	
	public PageObjectFactory(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}

@FindBy(xpath="(//a[contains(text(), 'Cameras')])[2]")
WebElement cameras;

public WebElement camer()
{
return cameras;	
}
}