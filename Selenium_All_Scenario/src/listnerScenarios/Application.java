package listnerScenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/*
 If  i run only test case my listner class is not trigger 
 @Listeners(listnerScenarios.ListernAction.class)  
 If without xml file i have to execute this tesr cases we can use @listern annotation then afte that it will call the listeners methods 
 */

@Listeners(listnerScenarios.ListernAction.class) // If we dont have xml file we can use this annotation for calling the listeners method
public class Application {

	WebDriver driver;
	
	@BeforeClass
	void login()
	{
		
		driver= new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		}
	
	@Test
	void openapp()
	{
		
		System.out.println("Open app");
	}
	@Test
	void search()
	{
		System.out.println("Search Product");
		Assert.assertEquals(true, true);
	}
	
	@AfterClass
	void closed()
	{
		
		driver.quit();
	}
}
