package AxpertProduct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","F:\\Selenium All programs 1\\Driver File\\Driver File\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("http://localhost/AxpertWeb/aspx/dwb.aspx");
			driver.manage().window().maximize();
	        driver.findElement(By.linkText("Log in")).click();
	        driver.findElement(By.xpath("//span[@id='select2-axSelectProj-container']")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("post9124");
	        driver.findElement(By.xpath("(//li[contains(text(), 'post9124')])[2]")).click();
	        driver.findElement(By.xpath("//input[@name='axUserName']")).sendKeys("admin");
	        driver.findElement(By.xpath("//input[@name='btnNext']")).click();
	        driver.findElement(By.xpath("//input[@id='axPassword']")).sendKeys("agile");
	        driver.findElement(By.xpath("(//input[@title='Login'])[1]")).click();
	        driver.findElement(By.xpath("//input[@id='globalSearchinp']")).click();
	        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Basic field");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("(//span[contains (text(), 'Basic field')])[2]")).click();
	        Thread.sleep(1000);
	        driver.switchTo().frame("middle1");
	        driver.findElement(By.xpath("//input[@id='emp000F1']")).sendKeys("raju");
	        driver.findElement(By.xpath("//input[@id='city000F1']")).sendKeys("delhi");
	        driver.findElement(By.xpath("//input[@id='age000F1']")).sendKeys("37");
	        driver.findElement(By.xpath("//select[@id='dropd000F1']")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//option[contains(text(), 'amit')]")).click();
	      //  driver.findElement(By.xpath("//input[@id='datee000F1']")).click();
	        Thread.sleep(2000);
	      driver.findElement(By.xpath("//input[@id='name001F2']")).sendKeys("arun");
	     driver.findElement(By.xpath("//input[@id='amount001F2']")).sendKeys("45"); 
	     driver.findElement(By.xpath("(//span[contains(text(), 'Select an option')])[2]")).click();
	     driver.findElement(By.xpath("//input[@type='search']")).sendKeys("priya");
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//li[contains(text(), 'priya')]")).click();
	    driver.findElement(By.xpath("(//span[contains(text(), 'add')])[1]")).click();
	    driver.findElement(By.xpath("//input[@id='name002F2']")).sendKeys("manju");
	    driver.findElement(By.xpath("//input[@id='amount002F2']")).sendKeys("45"); 
	    driver.findElement(By.xpath("//span[contains(text(), 'Select an option')]")).click();
	    driver.findElement(By.xpath("//input[@type='search']")).sendKeys("sumit");
	    driver.findElement(By.xpath("//li[contains(text(), 'sumit')]")).click();
	    driver.findElement(By.xpath("//a[@id='ftbtn_iSave']")).click();
	    Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@id='btn13']")).click();
        driver.findElement(By.xpath("//input[@value='1']")).click();
        driver.findElement(By.xpath("//a[contains(text(), 'raju')]")).click();
        driver.findElement(By.xpath("//input[@id='emp000F1']")).sendKeys("akshay");
        driver.findElement(By.xpath("//input[@id='city000F1']")).sendKeys("banglore");
        driver.findElement(By.xpath("//input[@id='age000F1']")).sendKeys("36");
        driver.findElement(By.xpath("//select[@id='dropd000F1']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//option[contains(text(), 'sanju')]")).click();
	    
        driver.findElement(By.xpath("(//span[contains(text(), 'add')])[1]")).click();
        Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@id='name002F2']")).sendKeys("pushpa");
	    driver.findElement(By.xpath("//input[@id='amount002F2']")).sendKeys("35");
	    driver.findElement(By.xpath("//a[@id='ftbtn_iSave']")).click();
	    driver.findElement(By.xpath("//a[@id='btn13']")).click();
        driver.findElement(By.xpath("//input[@value='1']")).click();   
	    
	    
	    //driver.quit();

	}

}
