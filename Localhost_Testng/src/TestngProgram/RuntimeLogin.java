package TestngProgram;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RuntimeLogin {
	WebDriver driver=new ChromeDriver();
@BeforeClass
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","F:\\Selenium All programs 1\\Driver File\\Driver File\\chromedriver-win64\\chromedriver.exe");
		driver.get("http://localhost/AxpertWeb/aspx/dwb.aspx");	
		driver.manage().window().maximize();
		System.out.println("Browser launch successfully");
	}


@AfterClass
public void afterclass()
{

System.out.println("CLose the browser");	
}

@Test
public void logintest() throws InterruptedException
{
	driver.findElement(By.linkText("Log in")).click();
    driver.findElement(By.xpath("//span[@id='select2-axSelectProj-container']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@type='search']")).sendKeys("post9124");
    driver.findElement(By.xpath("(//li[contains(text(), 'post9124')])[2]")).click();
    driver.findElement(By.xpath("//input[@name='axUserName']")).sendKeys("admin");
    driver.findElement(By.xpath("//input[@name='btnNext']")).click();
    driver.findElement(By.xpath("//input[@id='axPassword']")).sendKeys("agile");
    driver.findElement(By.xpath("(//input[@title='Login'])[1]")).click();
}

}