package TestCase;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ObjectRepository.Opencartres;
import ObjectRepository.PageObjectFactory;
import ObjectRepository.Phonepad;
import ObjectRepository.loginpage;

public class OpenRegisterPage {
	public WebDriver driver;

	@Test(priority = 1)
	public void Resister() {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Selenium All programs 1\\Driver File\\Driver File\\chromedriver-win64\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		// driver.get("https://novoresume.com/resume-templates");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[contains(text(), 'My Account')]")).click();

		Opencartres abc = new Opencartres(driver);
		abc.resit().click();
		abc.firstname().sendKeys("amit");
		abc.lastname().sendKeys("kamble");
		abc.email().sendKeys("amit@gmail.com");
		driver.findElement(By.xpath("//a[@title='My Account']")).click();
	}
@Test(priority = 2)
	public void login() {
		loginpage log = new loginpage(this.driver);
		log.login().click();
		log.username().sendKeys("amitk@agilelabs.com");
		log.password().sendKeys("Amit@1234");
	}
@Test(priority = 3)
	public void Phone() {
		Phonepad phone = new Phonepad(this.driver); // PhonePad- camelCase letterb
		phone.phonepad().click();
		
}
@Test (priority=4)
public void cameras()
{
	PageObjectFactory cam= new PageObjectFactory(this.driver);
	cam.camer().click();
}
}
