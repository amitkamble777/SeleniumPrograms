package KboardAction;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenLinkNewTab {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\Selenium All programs 1\\Driver File\\Driver File\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/");
		driver.manage().window().maximize();
		
		WebElement feature=driver.findElement(By.xpath("(//a[contains(text(), 'Features')])[1]"));
		Thread.sleep(2000);
	//	feature.click(); //This method will open link in same tab 
		
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL).click(feature).keyUp(Keys.CONTROL).build().perform();
	/*
		Switch the Feature Page using Set collection
		Set  is not allowed the Get index
		Convert the Arraylist and we have extract by using index
		 Set<String> id = driver.getWindowHandles();
		driver.getWindowHandles()  --> his path return the set Collection
		driver.switchTo().window(id.get(1));--> By using this command we can  switch to multiple pages 
		
		
		*/
		List<String> id = new ArrayList(driver.getWindowHandles());  // Combine the 2 statements from set to arraylist
		
		//Feature page
		driver.switchTo().window(id.get(1)); // this will switch to Feature Page 
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(text(),'Shipping, Payments and Reports')])[1]")).click();
		
		//HomePage
		driver.switchTo().window(id.get(0));
	
		
		
		

	}

	}

//}
