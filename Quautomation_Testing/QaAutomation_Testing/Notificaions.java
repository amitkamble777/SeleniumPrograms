package QaAutomation_Testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Notificaions {

	private static final WebDriver WebDriverwait = null;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\Selenium All programs 1\\Driver File\\Driver File\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://qa.agilecloud.biz/Axpert11.3Alpha/aspx/sess.aspx");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='select2-axSelectProj-container']")).click();
		driver.findElement(By.xpath("//input[@role='searchbox']")).sendKeys("axorcl113");
		driver.findElement(By.xpath("//li[contains(text(), 'axorcl113')]")).click();
		driver.findElement(By.xpath("//input[@id='axUserName']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='btnNext']")).click();
		driver.findElement(By.xpath("//input[@id='axPassword']")).sendKeys("Agile01");
		driver.findElement(By.xpath("(//input[@value='Login'])[1]")).click();
		driver.findElement(By.xpath("//span[@title='Options']")).click();
		driver.findElement(By.xpath("(//span[contains(text(), 'Configuration')])[2]")).click();
		Thread.sleep(1000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='vw-100 vh-100']")));
		driver.findElement(By.xpath("//span[@class='setting-caption menu-title' and contains(text(), 'Notifications')]")).click();
        Thread.sleep(1000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='axpiframeac']")));
		driver.findElement(By.xpath("//span[contains(text(), 'apps')]")).click();
	    driver.findElement(By.xpath("//span[contains(text(), 'Form Notification')]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//span[contains(text(), 'Select an option')])[1]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@role='searchbox']")).sendKeys("11.3 Release_5");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[contains(text(), '11.3 Release_5-(rels5)')]")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Notification recipient')]")).click();
//		Thread.sleep(1000);
driver.findElement(By.xpath("(//span[@role='combobox'])[2]")).click();
//		driver.findElement(By.xpath("//span[@role='combobox'])[2]")).sendKeys("Creator");
//	    driver.findElement(By.xpath("//li[contains(text(), 'Creator')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[10]")).click();
		Thread.sleep(2000);
		
//	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10)); // 10 seconds timeout
//		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("//a[@id='ank2']")));
//		element.click();
//		
		
		
	

		//driver.findElement(By.xpath("//a[contains(text(), 'Notification recipient')]")).click();
		//driver.findElement(By.xpath("//a[@id='ank2']")).click();
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		WebElement element = driver.findElement(By.xpath("//a[@id='ank2']"));
//		js.executeScript("arguments[0].click();", element);
//		element.click();
}

}
