package Actionclaa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\Selenium All programs 1\\Driver File\\Driver File\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	    driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
	WebElement but =driver.findElement(By.xpath("//button[contains(text(), 'Double-Click Me To See Alert')]"));
	Thread.sleep(2000);
	//Double click Action 
	Actions act= new Actions(driver);
	act.doubleClick(but).perform();
	
	//video time 50 to 6 5for validation of doubleclick Action -- SDET QA Automation video session 35
	
	
	
	
	
	
}

}
