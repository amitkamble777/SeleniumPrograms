package Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 Tage is different its not a  select tag 
 
 Here it is showing a button tag 
 */
public class BoostTrapDropDown {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","F:\\Selenium All programs 1\\Driver File\\Driver File\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("http://localhost/AxpertWeb/aspx/sess.aspx");
			driver.manage().window().maximize();
	        driver.findElement(By.linkText("Log in")).click();
	        
	    driver.findElement(By.xpath("//button[@title='Remove all items'][1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@type='search']")).sendKeys("post9124");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//li[contains(text(), 'post9124')][1]")).click();
	    driver.findElement(By.xpath("//input[@name='axUserName']")).sendKeys("admin");
	    driver.findElement(By.xpath("//input[@name='btnNext']")).click();
	    driver.findElement(By.xpath("//input[@id='axPassword']")).sendKeys("agile");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//input[@title='Login'])[1]")).click();
        driver.findElement(By.xpath("//input[@id='globalSearchinp']")).click();
        Thread.sleep(1000);
	    
//	    driver.findElement(By.xpath("//input[ @type='button'  and  @title='Login']")).click();
//	    driver.manage().window().maximize();
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//	    Thread.sleep(3000);
//	    driver.findElement(By.xpath("//input[@id='globalSearchinp']")).click();
//	    driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Drop down");
//	    Thread.sleep(2000);
//	    driver.findElement(By.xpath("(//span[contains(text(), 'Drop down')])[2]")).click();
//	    Thread.sleep(1000);
//	    driver.switchTo().frame("middle1");

	}

}
