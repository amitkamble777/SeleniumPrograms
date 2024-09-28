package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.URLHomePage;

public class loginPage {
	
	@Test
	public void login() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","F:\\Selenium All programs 1\\Driver File\\Driver File\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.rediff.com/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	
	URLHomePage em =new URLHomePage(driver);
	//Thread.sleep(1000);
	em.signin().click();
	em.email().sendKeys("sdsdfgdg");
	em.password().sendKeys("fddgderterrt");
	// em.Go().click();
    //driver
	}
	
}


