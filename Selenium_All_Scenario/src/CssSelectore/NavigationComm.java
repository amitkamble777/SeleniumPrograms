package CssSelectore;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationComm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\Selenium All programs 1\\Driver File\\Driver File\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		URL MYURL= URL("https://qa.agilecloud.biz/Axpert11.3Alpha/aspx/sess.aspx");
		driver.navigate().to(MYURL);

	}

	private static boolean URL(String string) {
		// TODO Auto-generated method stub
		return true;
	}

}
