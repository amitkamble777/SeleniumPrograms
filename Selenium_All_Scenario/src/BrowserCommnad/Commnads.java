package BrowserCommnad;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Commnads {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\Selenium All programs 1\\Driver File\\Driver File\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	
//driver.get("http://localhost/AxpertWeb/aspx/dwb.aspx"); //AcceptURL only in string format
//driver.navigate().to("http://localhost/AxpertWeb/aspx/dwb.aspx"); //Accept the url in string format
//driver.navigate().to("http://localhost/AxpertWeb/aspx/dwb.aspx"); //Accept the URL in URL Object format


Url myur= new Url("http://localhost/AxpertWeb/aspx/dwb.aspx");
driver.navigate().to(myur);
		driver.manage().window().maximize();
		//driver.get("https://qa.agilecloud.biz/Axpert11.3Alpha/aspx/mainnew.aspx");
		
	
	}

}
