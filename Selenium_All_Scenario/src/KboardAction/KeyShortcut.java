package KboardAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyShortcut {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\Selenium All programs 1\\Driver File\\Driver File\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("inputText1")).sendKeys("Agile labs Pvt Ltd Banglore");
		
		Actions act= new Actions(driver);
		//Control A --Select the text
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();  //Two cases
		
		//control C-- Coppy the Text
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform(); //Two cases
		
		//Click on Tab
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).build().perform();
		
		//Control V-- Paste the text
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).build().perform();
		
		
		
		

	}

}
