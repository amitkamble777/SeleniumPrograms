package Actionclaa;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*
 Right click action is also called as context click 
 
 After right click context menu si showing
 
  
 */

public class RightclickAction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\Selenium All programs 1\\Driver File\\Driver File\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	    driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		WebElement element= driver.findElement(By.xpath("//span[contains(text(), 'right click me')]"));
		Actions act= new Actions(driver);
	//Right click action	
	act.contextClick(element).perform();
	
	//Click on Copy
	driver.findElement(By.xpath("//span[contains(text(), 'Copy')]")).click();
	
	Thread.sleep(3000);
	//close that alert box
	driver.switchTo().alert().accept();
		
				
				

	}

}
