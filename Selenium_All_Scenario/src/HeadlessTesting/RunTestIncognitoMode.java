package HeadlessTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RunTestIncognitoMode {

	public static void main(String[] args) {

    ChromeOptions option= new ChromeOptions();
	option.addArguments("--incognito");
		
WebDriver driver=new ChromeDriver(option);
driver.get("https://www.javatpoint.com/java-oops-concepts");
driver.manage().window().maximize();

System.out.println("Title of the Page:" + driver.getTitle());

		
	}

}
