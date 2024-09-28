import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class crmplogin {
	WebDriver driver;
	@BeforeClass
	    public void setUp() {
	     // Set the path for the ChromeDriver executable
	      System.setProperty("webdriver.chrome.driver", "F:\\Selenium All programs 1\\Driver File\\Driver File\\chromedriver-win64\\chromedriver.exe");

	        // Initialize the WebDriver
	        driver = new ChromeDriver();
	WebDriver driver = new ChromeDriver();
	driver.get("https://crmpro.com/");
	driver.manage().window().maximize();
	}
	
	@Test
	public void  login() throws InterruptedException 
	{
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("amit358");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("amit@777");
	driver.findElement(By.xpath("//input[@value='Login']")).click();
	driver.switchTo().frame("mainpanel");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
//	driver.findElement(By.linkText("Alerts")).click();
	driver.findElement(By.linkText("CALL")).click();
	// Dropdown--
	// driver.findElement(By.xpath("//select[@name='flag'][1]")).click();
  Select name = new Select(driver.findElement(By.xpath("//select[@name='flag'][1]")));
	name.selectByVisibleText("Reschedule");

//driver.findElement(By.xpath("//select[@name='flag'][1]")).click();
//driver.findElement(By.xpath("//select[@name='reminder_minutes']")).click();
//Drop down 
	Select drop = new Select(driver.findElement(By.xpath("//select[@name='reminder_minutes']")));
	drop.selectByIndex(3);

	Select abc = new Select(driver.findElement(By.xpath("//select[@name='reminder_type']")));
	abc.selectByValue("S");
	}
	
	@AfterClass
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
}
	}
