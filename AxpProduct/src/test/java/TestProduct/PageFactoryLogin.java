package TestProduct;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageObjectFactor.Login;
public class PageFactoryLogin {
	
	WebDriver driver;
	@Test(priority=1)
	public void login() {
	System.setProperty("webdriver.chrome.driver","F:\\Selenium All programs 1\\Driver File\\Driver File\\chromedriver-win64\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("http://localhost/AxpertWeb/aspx/dwb.aspx");
	driver.manage().window().maximize();

	Login log=new Login(driver);
	log.log().click();
	log.dropd().click();
	log.schema().click();
	log.openchema().click();
	log.username().sendKeys("admin");
	log.button().click();
	log.password().sendKeys("agile");
	log.Login().click();
	}
	
@Test(priority=2)
	public void data() throws InterruptedException
	{
		 driver.findElement(By.xpath("//input[@id='globalSearchinp']")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//input[@id='globalSearchinp']")).sendKeys("Page Factory Framework");
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("(//span[contains(text(),'Page Factory Framework')])[2]")).click();
	        driver.switchTo().frame("middle1");
	       driver.findElement(By.xpath("//input[@id='emp000F1']")).sendKeys("priya");
	       	
	}
	
	}
