package Axpert_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SimpleText {
	
	@Test
	public void launch_Browser()
	{
		 System.setProperty("webdriver.chrome.driver","C://Users//amitkamble//Downloads//Downloads//chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("http://172.16.0.85/run11.2/aspx/mainnew.aspx");
			driver.manage().window().maximize();
	        driver.findElement(By.linkText("Log in")).click();
	}
	
	@Test ( priority=0)
	public void SubmitRecord()
	{
		System.out.println("Record submit successfully");
		
	}

}
