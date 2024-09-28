package TestProduct;

import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import PageObjectModule.Delete;
import PageObjectModule.Login;
import PageObjectModule.Modify;
import PageObjectModule.SubmitD;

public class SubmitData {
public WebDriver driver; 	
@Test(priority=1)
	public void login()
	{
	System.setProperty("webdriver.chrome.driver","F:\\Selenium All programs 1\\Driver File\\Driver File\\chromedriver-win64\\chromedriver.exe");
	 driver = new ChromeDriver();
	driver.get("http://localhost/AxpertWeb/aspx/sess.aspx");
	driver.manage().window().maximize();
	Login log= new Login(driver);
	log.login().click();
	log.drop().click();
	log.Schema().sendKeys("post9124");
	log.SchemaOpen().click();
	log.user().sendKeys("admin");
	log.button().click();
	log.password().sendKeys("agile");
	log.log().click();
	}
	
	@Test(priority=2)
	public void  SubmitD() throws InterruptedException
	{
		SubmitD sub= new SubmitD(this.driver);
		sub.search().click();
		sub.nam().sendKeys("Page object file");
		Thread.sleep(3000);
		sub.open().click();
		driver.switchTo().frame("middle1");
		sub.emp().sendKeys("amit");
		sub.city().sendKeys("mumbai");
		sub.age().sendKeys("30");
		sub.radio().click();
		sub.submit().click();
		
	//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='w-100 h-100']")));
		//driver.findElement(By.xpath("//input[@id='workpaceR0']")).click();
		//driver.findElement(By.xpath("//input[@id='workpaceR0']")).sendKeys("Agile labs");
		}
@Test(priority=3)
public void modify() throws InterruptedException
{
	Modify mod= new Modify(driver);
	Thread.sleep(1000);
	mod.list().click();
	mod.check().click();
	mod.hyper().click();
	mod.emp().sendKeys("sysamala");
	mod.city().clear();
	mod.city().sendKeys("Hyderabad");
	mod.age().clear();
	mod.age().sendKeys("54");
	mod.sbumit().click();
	}

@Test (priority=4)
public void delete() throws InterruptedException
{
	
Delete del= new Delete(driver);
Thread.sleep(3000);
del.list().click();
del.check().click();
del.remove().click();
Thread.sleep(2000);
del.yes().click();
}

@Test (priority=5)
public void Searchrecord()
{
PageObjectModule.Searchrecord ser= new PageObjectModule.Searchrecord(driver);
	ser.Search().click();
	ser.sear().sendKeys("syamala");
Assertions.assertEquals("amit", "syamala" );
}
}

//	public void Table() throws InterruptedException
//	{
//	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='w-100 h-100']")));	
//	PageObjectModule.Table tab= new PageObjectModule.Table(this.driver);
//		tab.workc().click();
//		tab.work().sendKeys("Agile labs pvt");
//		tab.yearc().click();
//		tab.year().sendKeys("3");
//		tab.designationc().click();
//		tab.designation().sendKeys("Automation Tester");
//		driver.switchTo().defaultContent();
//		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5));
//		driver.findElement(By.xpath("//button[contains(text(),'Ok')]/div")).click();
		
		//tab.button().click();
		//driver.findElement(By.xpath("//div[@class='modal-footer']"));
	//driver.findElement(By.xpath("$x(\"//button[@class='btn btn-primary modal-ok']\")")).click();
//	}
	


