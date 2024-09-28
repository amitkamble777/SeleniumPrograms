package QaAutomation_Testing;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Rule {
public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver","F:\\Selenium All programs 1\\Driver File\\Driver File\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("http://172.16.0.85/run11.3/aspx/mainnew.aspx");
			driver.manage().window().maximize();
	        driver.findElement(By.linkText("Log in")).click();
	        
	    driver.findElement(By.xpath("//button[@title='Remove all items'][1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@type='search']")).sendKeys("axpost113");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//li[contains(text(), 'axpost113')][2]")).click();
	     driver.findElement(By.xpath("//input[@name='axUserName']")).sendKeys("amit");
	    driver.findElement(By.xpath("//input[@name='btnNext']")).click();
	    driver.findElement(By.xpath("//input[@id='axPassword']")).sendKeys("agile");
	    driver.findElement(By.xpath("//input[@title='Login'][1]")).click();
	    driver.findElement(By.xpath("//span[@title='Options']")).click();
	    driver.findElement(By.xpath("//span[@title='Configuration']")).click();
	    Thread.sleep(2000);
	    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='vw-100 vh-100']")));
	    driver.findElement(By.xpath("//span[contains(text(), 'Mem DB Console')]")).click();
	   
	     driver.findElement(By.xpath("(//input[@name='chkItem'])[1]")).click();
	    
	    
	   /* 
	    
	    //driver.findElement(By.xpath("//span[@class='setting-caption menu-title' and contains(text(), 'Rules')]")).click();
	   driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='vw-100 vh-100']")));
	   driver.findElement(By.xpath("//span[contains(text(), 'Rules')]")).click();
	   Thread.sleep(2000);
	   driver.switchTo().frame("axpiframeac");
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//div[@id='iconsNewNew']")).click();
	   driver.findElement(By.xpath("//input[@id='rulename000F1']")).sendKeys("Rule 32-3");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(//span[contains(text(), 'Select an option')])[1]")).click();
	    driver.findElement(By.xpath("//input[@role='searchbox']")).sendKeys("Rule 22-3");
	    Thread.sleep(2000);
	   driver.findElement(By.xpath("//li[contains(text(),'Rule 22-3-(rule2)')]")).click();
	   driver.findElement(By.xpath("(//textarea[@type='search'])[1]")).click();
	   Thread.sleep(1000);
	    driver.findElement(By.xpath("(//textarea[@type='search'])[1]")).sendKeys("default");
	    Thread.sleep(2000);
	   driver.findElement(By.xpath("//li[contains(text(),'default')]")).click(); 
	   driver.findElement(By.xpath("//a[contains(text(), 'Form controls')]")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("(//span[contains(text(), 'Select an option')])[2]")).click();
	   driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Hide");
	   Thread.sleep(2000);
      driver.findElement(By.xpath("//li[contains(text(),'Hide')]")).click();
      Thread.sleep(1000);
      driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--multiple tem fldmultiSelect form-control focus-input "
      		+ "form-select py-0 d-flex pe-10 ms-render']")).click();
     driver.findElement(By.xpath("(//textarea[@type='search'])[3]")).sendKeys("age");
      Thread.sleep(1000);
      driver.findElement(By.xpath("//li[contains(text(),'age-(age)')]")).click();
      driver.findElement(By.xpath("//div[@id='dvlayout']")).click();
     // driver.findElement(By.xpath("//div[@id='dvlayout']")).click();
      driver.findElement(By.xpath("(//textarea[@type='search'])[3]")).sendKeys("emp");
     Thread.sleep(1000);
      driver.findElement(By.xpath("//li[contains(text(),'emp-(emp)')]")).click();
     
      driver.findElement(By.xpath("//a[@id='ftbtn_iSave']")).click();
      
      */
      
      
      
     //driver.quit();
	   
}

}
