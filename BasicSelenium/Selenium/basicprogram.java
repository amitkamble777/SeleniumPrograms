package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basicprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
System.setProperty("webdriver.chrome.driver","F:\\Selenium All programs 1\\Driver File\\Driver File\\chromedriver-win64\\chromedriver.exe");
WebDriver driver= new ChromeDriver();  // invoke the browser
 System.out.println("Basic selenium");
driver. get("https://demo.guru99.com/test/newtours/");

	
	}

}
