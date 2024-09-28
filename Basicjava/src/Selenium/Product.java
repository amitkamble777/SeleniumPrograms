package src.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Product {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\Selenium All programs 1\\Driver File\\Driver File\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://qa.agilecloud.biz/Axpert11.3Alpha/aspx/mainnew.aspx");
		driver.manage().window().maximize();
driver.findElement(By.linkText("Log in")).click();
Thread.sleep(2000);
driver.findElement(By.xpath(("//span[@class='selection'][1]"))).click();	
	
	}

}
