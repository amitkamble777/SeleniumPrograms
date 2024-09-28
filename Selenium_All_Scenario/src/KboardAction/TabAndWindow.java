package KboardAction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 Requirment is Open the 2nd Url in 2nd TAB
 This command  introduce  in selenium 4 onwards
 */

public class TabAndWindow {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","F:\\Selenium All programs 1\\Driver File\\Driver File\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		//driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);  // Open the browser
		driver.get("https://www.opencart.com/");

		//Open the New Browser --> Open the 2nd URL in other Browser
		
		
}
}