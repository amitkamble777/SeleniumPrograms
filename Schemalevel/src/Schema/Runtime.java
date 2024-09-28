package Schema;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://172.16.0.85/run11.2/aspx/mainnew.aspx");
		driver.manage().window().maximize();
        driver.findElement(By.linkText("Log in")).click();

	}

}
