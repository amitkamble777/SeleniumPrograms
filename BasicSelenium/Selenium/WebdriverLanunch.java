package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebdriverLanunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\amitkamble\\Downloads\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://172.16.0.85/run11.2/aspx/sess.aspx");
		driver.manage().window().maximize();
		
}

}
