package HeadlessTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeadLess {

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
       driver.findElement(By.id("ftbtn_iSave")).click();
       driver.quit();
     

	}

}
