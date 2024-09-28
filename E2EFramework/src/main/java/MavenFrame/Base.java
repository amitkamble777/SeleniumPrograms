package MavenFrame;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
we will creating invoking driver in a single method
If i have 1500 test cases 
If i passed my browser is chrome -- all my test case will execute in chrome browser
All my 1500 test cases sould run in chrome browser
Base file will be connected to all the test cases
//Chrome -- Based upon a drier we can invoke the browser.
//firefox
 * 
 timeout is applyto all my testcases
//IE
*/
public class Base{
public WebDriver driver;
//@SuppressWarnings("deprecation")
public WebDriver intializeDriver() throws IOException
{
Properties props = new Properties();
FileInputStream fs= new  FileInputStream("E:\\Slenium 2024-03\\E2EFramework\\src\\main\\java\\data.properties");
props.load(fs);
String browserName = props.getProperty("browser");
 
 if(browserName.equals("chrome"))  //we can not use == because we extract the value from data properties
{
	 System.setProperty("webdriver.chrome.driver","F:\\Selenium All programs 1\\Driver File\\Driver File\\chromedriver-win64\\chromedriver.exe");
	 driver= new ChromeDriver();
	 //Execute in chrome browser
}
 else if (browserName.equals("firefox"))
{
	//Execute in firefox browser 
}
 else
{
	 //Execute in edge browser
}
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
}	
}

