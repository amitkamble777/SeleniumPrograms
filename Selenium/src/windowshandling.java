import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowshandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\Selenium All programs 1\\Driver File\\Driver File\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://crmpro.com/");	
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//a[@title='Buses']")).click();
		driver.quit();
		
	}

}
