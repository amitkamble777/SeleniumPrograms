package HeadlessTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableAutomatedMessageScreen {

	public static void main(String[] args) {
	
		ChromeOptions option= new ChromeOptions();
		option.setExperimentalOption("excludeSwitches" , new String[] {"enable-automation"});
	   WebDriver driver=new ChromeDriver(option); 
		
	   driver.get("https://www.javatpoint.com/java-oops-concepts");
	
	   
	   driver.manage().window().maximize();

	}

}
