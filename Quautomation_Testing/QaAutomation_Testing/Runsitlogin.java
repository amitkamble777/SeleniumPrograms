package QaAutomation_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Runsitlogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//amitkamble//Downloads//Downloads//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://172.16.0.85/run11.2/aspx/mainnew.aspx");
		driver.manage().window().maximize();
        driver.findElement(By.linkText("Log in")).click();
        
    driver.findElement(By.xpath("//button[@title='Remove all items'][1]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@type='search']")).sendKeys("qaposgres112");
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//li[contains(text(), 'qapostgres112')])[1]")).click();
     driver.findElement(By.xpath("//input[@name='axUserName']")).sendKeys("admin");
    driver.findElement(By.xpath("//input[@name='btnNext']")).click();
    driver.findElement(By.xpath("//input[@id='axPassword']")).sendKeys("agile");
    driver.findElement(By.xpath("//input[@title='Login'][1]")).click();
    driver.findElement(By.xpath("//span[@title= 'Tstruct']")).click();
    driver.findElement(By.xpath("//span[contains(text(),'Basic Fields')]")).click();
    driver.findElement(By.xpath("//span[contains(text(),'Text Field')][1]")).click();
    driver.findElement(By.xpath("//span[@title='Simple Text']")).click();
   // driver.findElement(By.linkText("Simple Text with Accept MOE")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//a[@title='Simple Text with Accept MOE']")).click();
    driver.switchTo().frame("middle1");
    driver.findElement(By.xpath("//input[@id='accpetfld000F1']")).sendKeys("syamala"); 
    driver.findElement(By.xpath("//a[@title='save']")).click();
    driver.findElement(By.xpath("//a[@title='List View']")).click();
    //Modification
    driver.findElement(By.xpath("//input[@Value='1'][1]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//a[contains(text(), 'syamala')]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@name='accpetfld000F1']")).sendKeys("pushpa");
    driver.findElement(By.xpath("//a[@title='save']")).click();
    
    //Delete the record
    driver.findElement(By.xpath("//a[@title='List View']")).click();
    driver.findElement(By.xpath("//input[@Value='1'][1]")).click();
    driver.findElement(By.xpath("//a[@id='iconsNewRemoveIcon']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//button[@title='Yes']")).click();
    
//Search the records
   Thread.sleep(1000);
   driver.findElement(By.xpath("//div[@id='iconsNewSearch']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@id='ivInSearchInput']")).sendKeys("pushpa");
    
    
    
    
    
    
    
  }
}
