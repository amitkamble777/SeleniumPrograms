package screenshot;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FullPageScreenShot {
public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\Selenium All programs 1\\Driver File\\Driver File\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://localhost/AxpertWeb/aspx/dwb.aspx");
		driver.manage().window().maximize();
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.xpath("//span[@id='select2-axSelectProj-container']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("post9124");
        driver.findElement(By.xpath("(//li[contains(text(), 'post9124')])[2]")).click();
        driver.findElement(By.xpath("//input[@name='axUserName']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name='btnNext']")).click();
        driver.findElement(By.xpath("//input[@id='axPassword']")).sendKeys("agile");
        driver.findElement(By.xpath("(//input[@title='Login'])[1]")).click();
        driver.findElement(By.xpath("//input[@id='globalSearchinp']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='globalSearchinp']")).sendKeys("Data Driven");
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//span[contains(text(),'Data Driven')])[2]")).click();
        driver.switchTo().frame("middle1");
        driver.findElement(By.id("name000F1")).sendKeys("akshit");
       driver.findElement(By.id("city000F1")).sendKeys("delhi");
       driver.findElement(By.name("amount000F1")).sendKeys("500");
     
       //1st Full Page Screen Shot
       /*Multiple screenshot will refer as a multiple variable.
       
       We can not refer multiple screenshot with the single variable
       
       getSscreenshot method is available in TakesSceenshot interface
       File is a predefined class through which we can create a  object
         */
       
 //  TakesScreenshot ts=(TakesScreenshot) driver;
//   File source=ts.getScreenshotAs(OutputType.FILE);
//   // File target= new File(System.getProperty("user.dir")+"\\E:\\Slenium 2024-03\\Tstruct.png");
//    File target= new File(System.getProperty("user.dir")+"\\ScreenShot\\Form.png");
//    source.renameTo(target);  // copy the source file into the target file.
             /*2nd Specific area of the screen shot 
       getScreenshotAs  method is calling from WebElement Interface
       Screen is a  WebElelemnt--- Xpath is store in screen variable 
       */
       
      WebElement screen=driver.findElement(By.xpath("//div[@id='divDc1']"));
      File Sourcefile= screen.getScreenshotAs(OutputType.FILE);
      File targetf= new File(System.getProperty("user.dir")+"\\ScreenShot\\RuntimeScren.png");
      Sourcefile.renameTo(targetf);  // Copy the source file to target file 
       
      driver.findElement(By.id("ftbtn_iSave")).click();
       //driver.quit();


	}

}
