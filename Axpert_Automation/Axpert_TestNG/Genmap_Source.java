package Axpert_TestNG;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Genmap_Source {
	
	

	@Test(priority=0)
	public void Browser() 
	{
	System.setProperty("webdriver.chrome.driver","C://Users//amitkamble//Downloads//Downloads//chromedriver.exe");
	}
	
	
	@Test (priority=1)
	public void login() throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		driver.get("http://172.16.0.85/run11.2/aspx/mainnew.aspx");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@title='Log in']")).click();
       driver.findElement(By.xpath("//button[@title='Remove all items'][1]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@type='search']")).sendKeys("qapostgres112");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//li[contains(text(), 'qapostgres112')])[2]")).click();
	     driver.findElement(By.xpath("//input[@name='axUserName']")).sendKeys("admin");
	    driver.findElement(By.xpath("//input[@name='btnNext']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@id='axPassword']")).sendKeys("agile");
	    driver.findElement(By.xpath("//input[@title='Login'][1]")).click();
	    }
	
	@Test (priority=2)
	public void Submit_Records()
	{
		WebDriver driver= new ChromeDriver();
		driver.findElement(By.xpath("//input[@id='globalSearchinp']")).click();
		driver.findElement(By.xpath("//input[@id='globalSearchinp']")).sendKeys("genmap source 13-2");
		driver.findElement(By.xpath("(//span[contains(text(), 'genmap source 13-2')])[3]")).click();
		System.out.println("Submit records successfully");
	}
	@Test (priority=3)
	public void LoadAndModify()
	{
		System.out.println("Modify and submit the records");
	}
	@Test (priority=4)
	public void deleteRecord()
	{
		System.out.println("Delete the  record");
	}
	@Test (priority=5)
	public void searched_deletedRecord()
	{
		System.out.println("Search the deleted records");
	}
	
}


