package src.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","F:\\Selenium All programs 1\\Driver File\\Driver File\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("http://localhost/AxpertWeb/aspx/dwb.aspx");
			driver.manage().window().maximize();
	        driver.findElement(By.linkText("Log in")).click();

	}

}
