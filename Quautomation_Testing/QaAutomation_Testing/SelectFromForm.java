package QaAutomation_Testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectFromForm {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C://Users//amitkamble//Downloads//Downloads//chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("http://172.16.0.85/run11.3/aspx/mainnew.aspx");
			driver.manage().window().maximize();
	        driver.findElement(By.linkText("Log in")).click();
	        
	    driver.findElement(By.xpath("//button[@title='Remove all items'][1]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@type='search']")).sendKeys("agilepost113");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//li[contains(text(), 'agilepost113')][1]")).click();
	     driver.findElement(By.xpath("//input[@name='axUserName']")).sendKeys("admin");
	    driver.findElement(By.xpath("//input[@name='btnNext']")).click();
	    driver.findElement(By.xpath("//input[@id='axPassword']")).sendKeys("agile");
	    driver.findElement(By.xpath("//input[@title='Login'][1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='globalSearchinp']")).click();
	    driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Select from form");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//span[contains(text(), 'Select from form')])[2]")).click();
	    Thread.sleep(1000);
	    driver.switchTo().frame("middle1");
	    driver.findElement(By.xpath("(//span[contains(text(),'Select an option')])[1]")).click();
	    driver.findElement(By.xpath("//input[@role='searchbox']")).sendKeys("harshu");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//li[contains(text(),'harshu')]")).click();
	    driver.findElement(By.xpath("(//span[contains(text(),'Select an option')])[1]")).click();
	    driver.findElement(By.xpath("//input[@role='searchbox']")).sendKeys("mumbai");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//li[contains(text(),'mumbai')]")).click();
	    
	    driver.findElement(By.xpath("(//span[contains(text(),'Select an option')])[2]")).click();
	    driver.findElement(By.xpath("//input[@role='searchbox']")).sendKeys("adilabad");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//li[contains(text(),'adilabad')]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(//span[@role='textbox'])[3]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@type='search']")).sendKeys("lakshmi");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//li[contains(text(),'lakshmi')]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//span[@id='select2-withoutautoselect000F1-container']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@role='searchbox']")).sendKeys("Tester");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//li[contains(text(),'Tester')]")).click();
	    Thread.sleep(1000);
driver.findElement(By.xpath("(//span[@title= 'Select an option'])[11]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("(//span[@title= 'amit'])[2]")).sendKeys("amit");
driver.findElement(By.xpath("(//span[@title= 'amit'])[2]")).click();

	    driver.quit();
	   
	    

	}

}
