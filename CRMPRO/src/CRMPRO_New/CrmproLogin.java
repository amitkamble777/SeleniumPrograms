package CRMPRO_New;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CrmproLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium All programs 1\\Driver File\\Driver File\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://crmpro.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		// driver.findElement(By.xpath(" ")).click();
		// driver.findElement(By.linkText("Sign Up")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("amit358");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("amit@777");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.switchTo().frame("mainpanel");
		Thread.sleep(2000);
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

}
