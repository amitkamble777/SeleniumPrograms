package SeleniumAllCommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main (String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\Selenium All programs 1\\Driver File\\Driver File\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://crmpro.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("amit358");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("amit@777");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.quit();

	}

}
