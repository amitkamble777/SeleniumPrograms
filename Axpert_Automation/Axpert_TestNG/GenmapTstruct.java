package Axpert_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenmapTstruct {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Users//amitkamble//Downloads//Downloads//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://172.16.0.85/run11.2/aspx/mainnew.aspx");
		driver.manage().window().maximize();
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.xpath("//button[@title='Remove all items'][1]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@type='search']")).sendKeys("qaposgres112");
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//option[contains(text(), 'qapostgres112')])[2]")).click();
    Thread.sleep(1000);
     driver.findElement(By.xpath("//input[@name='axUserName']")).sendKeys("admin");
    driver.findElement(By.xpath("//input[@name='btnNext']")).click();
    driver.findElement(By.xpath("//input[@id='axPassword']")).sendKeys("agile");
    driver.findElement(By.xpath("//input[@type='button']")).click();
    driver.findElement(By.xpath("//button[@class='toast-close-button']")).click();
    driver.findElement(By.xpath("//input[@id='globalSearchinp']")).click();
	driver.findElement(By.xpath("//input[@id='globalSearchinp']")).sendKeys("genmap source 13-2");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[contains(text(), 'genmap source 13-2')])[3]")).click();
//Thread.sleep(5000);
//driver.quit();
    
    
    

	}

}
