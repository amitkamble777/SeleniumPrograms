package TestCase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageObjectm.PageObjectFactory;
import PageObjectm.Submit;
public class Release13
{
 public WebDriver driver;
 
@Test(priority = 1)
public void login() throws InterruptedException
{
		System.setProperty("webdriver.chrome.driver","F:\\Selenium All programs 1\\Driver File\\Driver File\\chromedriver-win64\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://localhost/AxpertWeb/aspx/dwb.aspx");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.xpath("//span[@id='select2-axSelectProj-container']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("post9124");
        driver.findElement(By.xpath("(//li[contains(text(), 'post9124')])[2]")).click();
        driver.findElement(By.xpath("//input[@name='axUserName']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name='btnNext']")).click();
        driver.findElement(By.xpath("//input[@id='axPassword']")).sendKeys("agile");
        driver.findElement(By.xpath("(//input[@title='Login'])[1]")).click();
        driver.findElement(By.xpath("//input[@id='globalSearchinp']")).sendKeys("Release13_AxiInstaller kit");
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//span[contains(text(), 'Release13_AxiInstaller kit')])[2]")).click();
      driver.switchTo().frame("middle1");
 }

//this class is implememted in PageObject Factory class
@Test(priority = 2)
public void PageObjectFactory () throws InterruptedException
{
PageObjectFactory abc= new PageObjectFactory(this.driver);
		abc.name().sendKeys("amit");  //this is same like that drive.findElement(By.xapth)
		abc.city().sendKeys("mumbai");
        abc.amount().sendKeys("500");
//         abc.gridrow().click();
//        abc.collage().sendKeys("kke");
//	    abc.mobile().sendKeys("9097932040");
  	    abc.save().click();
}
	
//	Submit abc=new Submit(driver);
//	//driver.switchTo().frame("middle1");
//	abc.name().sendKeys("amit");
//	//abc.nm().sendKeys("amit");
//	abc.city().sendKeys("mumbai");
//	abc.amount().sendKeys("500");
//	abc.collage().sendKeys("KKW");
//	abc.mobile().sendKeys("9545173489");
//	abc.save().click();

@Test(priority =3)
public void modifydata() throws InterruptedException
{
PageObjectm.modifydata mod=new PageObjectm.modifydata(this.driver);
Thread.sleep(3000);
mod.list().click();
mod.check().click();
Thread.sleep(3000);
mod.Hyper().click();
mod.name().clear();
mod.name().sendKeys("raju");
mod.city().clear();
mod.city().sendKeys("solapur");
mod.amount().clear();
mod.amount().sendKeys("4500");
mod.grid().click();
mod.collage().clear();
mod.collage().sendKeys("BAMU university");
Thread.sleep(2000);
mod.mobile().clear();
mod.mobile().sendKeys("9869848398");
mod.save().click();
}

@Test(priority =4)
public void Delete() throws InterruptedException
{
PageObjectm.Delete del= new PageObjectm.Delete(this.driver);
Thread.sleep(3000);
del.listv().click();
del.Checklist().click();
del.Hyperlink().click();
del.Remove().click(); 
Thread.sleep(3000);
del.Confirmation().click();
}
}

