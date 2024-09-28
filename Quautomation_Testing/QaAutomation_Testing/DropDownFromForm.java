package QaAutomation_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownFromForm {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C://Users//amitkamble//Downloads//Downloads//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://qa.agilecloud.biz/Axpert11.3Alpha/aspx/signin.aspx");
		driver.manage().window().maximize();
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.xpath("//button[@title='Remove all items'][1]")).click();
      //  Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("qatestbed");
      //  Thread.sleep(2000);
        driver.findElement(By.xpath("//li[contains(text(), 'qatestbed')][1]")).click();
         driver.findElement(By.xpath("//input[@name='axUserName']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name='btnNext']")).click();
        driver.findElement(By.xpath("//input[@id='axPassword']")).sendKeys("agile");
        driver.findElement(By.xpath("//input[@title='Login'][1]")).click();
        driver.findElement(By.xpath("//span[@title= 'Tstruct']")).click();
        driver.findElement(By.xpath("//span[contains(text(), 'Components')]")).click();
        driver.findElement(By.xpath("//span[contains(text(), 'Dropdown')][1]")).click();
        driver.findElement(By.xpath("//span[contains(text(), 'Dropdown Test with MOE as Select From Form')]")).click();
        driver.switchTo().frame("middle1");
        driver.findElement(By.xpath("//span[@id='select2-dform000F1-container']")).click();
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("sumit");
        Thread.sleep(1000);
       // driver.findElement(By.xpath("//li[contains(text(),'Sumit')]")).click();
        driver.findElement(By.xpath("//li[contains(text(), 'Sumit')]")).click();
        
       // driver.quit();
        
        
     }

}
