package WindowsHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\Selenium All programs 1\\Driver File\\Driver File\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://quillbot.com/grammar-check");
		driver.manage().window().maximize();
		driver.switchTo().window("QuillBot Premium");
		driver.findElement(By.xpath("//span[contains(text(), 'QuillBot Premium')]")).click();
		}

}
