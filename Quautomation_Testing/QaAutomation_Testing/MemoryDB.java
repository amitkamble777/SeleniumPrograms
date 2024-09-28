package QaAutomation_Testing;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MemoryDB {

	public static void main(String[] args) throws InterruptedException {
	
		 System.setProperty("webdriver.chrome.driver","F:\\Selenium All programs 1\\Driver File\\Driver File\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://qa.agilecloud.biz/Axpert11.3Alpha/aspx/sess.aspx");
			driver.manage().window().maximize();
			driver.findElement(By.linkText("Log in")).click();
	        
	    driver.findElement(By.xpath("//button[@title='Remove all items'][1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@type='search']")).sendKeys("axorcl113");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//li[contains(text(), 'axorcl113')][2]")).click();
	     driver.findElement(By.xpath("//input[@name='axUserName']")).sendKeys("amit");
	    driver.findElement(By.xpath("//input[@name='btnNext']")).click();
	    driver.findElement(By.xpath("//input[@id='axPassword']")).sendKeys("agile");
	    driver.findElement(By.xpath("//input[@title='Login'][1]")).click();
	    driver.findElement(By.xpath("//span[@title='Options']")).click();
	    driver.findElement(By.xpath("//span[@title='Configuration']")).click();
	    Thread.sleep(2000);
	    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='vw-100 vh-100']")));
	    
//		Actions act = new Actions(driver);
//        act.sendKeys(Keys.PAGE_DOWN).build().perform();    
//        System.out.println("Scroll down perfomed");
//        Thread.sleep(2000);
	    
	    WebElement element= driver.findElement(By.xpath("//span[contains(text(), 'Mem DB Console')]"));
	    Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver; 
        js.executeScript("arguments[0].scrollIntoView();",element);
       driver.findElement(By.xpath("//span[contains(text(), 'Mem DB Console')]")).click();
	  Thread.sleep(2000);
	 // driver.findElement(By.xpath("//div[@id='ivirMainDataTableWrapper']")).click();
WebElement checkbox=driver.findElement(By.xpath("(//input[@value='1'])[2]"));
checkbox.click();
	  
     

	   	
	   
		
		
	}

}
