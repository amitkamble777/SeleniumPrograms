package Actionclaa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*
 Action
 
 1.Mouse Hover Actions 
 Right click 
 double click
 drag and drop 
  
Action is a predefined class provided in  selenium
And through which we can perform all the operations 
1.1.Mouse Hover Actions 
Mouse curore on the Whichever element you want, sometimes we need to place the mouse on that particular element then only
these options are visible same things
Some of the time i place the cursore on element --- Respective actions are visible


For every action method we need to perform .build().perform()
.build()-- Which will create an action ---> this is also part of the action class
.perform()--Which will perform an action
This 2 methods are belongs to action class subject
Any method we used with action class that should end with .build().perform()  method
This 2 method is an mandatory method for Action class

By using action class object we can perform mouse and keyboard action
  
  
  
 
 */



public class MouseAction {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","F:\\Selenium All programs 1\\Driver File\\Driver File\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://alzonesoftware.com/cmro-invoicing-automation-cmro-bots/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	WebElement knowledge = driver.findElement(By.xpath("//a[contains(text(), 'Knowledge center')]"));  //for more option Mouse Action
		WebElement  blog= driver.findElement(By.xpath("(//a[contains(text(), 'Blog')])[1]"));
		
		Actions act=new Actions(driver);
		//act.moveToElement(knowledge).moveToElement(blog).click(). build().perform();
		act.moveToElement(knowledge).moveToElement(blog).perform();
//Only perform action is capable of build the action thats why we can use only perform method
//Perform method can do a 2 action 1 create an action and 2 complete  the action
//perform method internally calling the build method and complete the action		
		
		
	}

}
