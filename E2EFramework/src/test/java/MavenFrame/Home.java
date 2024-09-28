package MavenFrame;
import java.io.IOException;
import org.testng.annotations.Test;

import Pageobject.landingPage;
public class Home extends Base {
	
	@Test
	public void basepageNavigation() throws IOException
	{
	driver=intializeDriver();
	driver.get("https://agile-labs.com/");
	driver.manage().window().maximize();
	
	// create the object for that class and invoke the methods of it
	
	landingPage land= new landingPage(driver); // here we have to set driver as an arguments for calling this page object method
	//Thread.sleep(2000);
	
	land.partner().click();//driver.findElement(By.xpath)
	driver.quit();
 
	}
	}


