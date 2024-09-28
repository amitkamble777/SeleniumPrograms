package HeadlessTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumOptions;


public class SimpleTest {

	public static void main(String[] args) {
	  // For Chrome driver
	
	ChromeOptions options= new ChromeOptions();
	options.addArguments("--Headless=new--"); // this is a setting for Headless mode of Execution
	WebDriver driver= new ChromeDriver(options); // if options is not pass in constructor it i will execute without Headless
	//OPen URL
	driver.get("http://localhost/AxpertWeb/aspx/dwb.aspx");
	
	String title=driver.getTitle();
	
	if(title.equals("localhost"))
	{
		System.out.println("Test Passed");
	}
	else
	{
		System.out.println("Test Failed");
	}
	
driver.quit();
	}

}
