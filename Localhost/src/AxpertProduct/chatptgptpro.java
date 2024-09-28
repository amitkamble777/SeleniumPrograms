package AxpertProduct;
import java.time.Duration;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;
public class chatptgptpro {

	    private WebDriver driver;
	    private WebDriverWait wait;

	    @BeforeClass
	    public void launchBrowser() {
	        // Set the path for the ChromeDriver executable
	        System.setProperty("webdriver.chrome.driver", "F:\\Selenium All programs 1\\Driver File\\Driver File\\chromedriver-win64\\chromedriver.exe");
	        
	        // Initialize the ChromeDriver and WebDriverWait
	        driver = new ChromeDriver();
	        wait = new WebDriverWait(driver,Duration.ofSeconds(5)); ; // 10 seconds timeout

	        // Navigate to the application URL
	        driver.get("http://localhost/AxpertWeb/aspx/dwb.aspx");
	        driver.manage().window().maximize();
	        System.out.println("Browser launched successfully");
	    }

	    @Test(priority = 0)
	    public void login() {
	        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Log in"))).click();
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@id='select2-axSelectProj-container']"))).click();
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='search']"))).sendKeys("post9124");
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//li[contains(text(), 'post9124')])[2]"))).click();
	        driver.findElement(By.xpath("//input[@name='axUserName']")).sendKeys("admin");
	        driver.findElement(By.xpath("//input[@name='btnNext']")).click();
	        driver.findElement(By.xpath("//input[@id='axPassword']")).sendKeys("agile");
	        driver.findElement(By.xpath("(//input[@title='Login'])[1]")).click();
	        System.out.println("Login successfully");
	    }

	    @Test(priority = 1)
	    public void Aopenform() {
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='globalSearchinp']"))).click();
	        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Simple text");
	        driver.switchTo().frame("middle1");
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(text(), 'Simple text')])[2]"))).click();
	     //   driver.switchTo().frame("middle1"); // Ensure you switch to the correct frame
	        driver.findElement(By.xpath("//input[@id='emp000F1']")).sendKeys("syamala");
	        driver.findElement(By.xpath("//input[@id='city000F1']")).sendKeys("bangalore");
	        driver.findElement(By.xpath("//input[@id='age000F1']")).sendKeys("25");
	        driver.findElement(By.xpath("//input[@id='mobileno000F1']")).sendKeys("9096811963");
	        driver.findElement(By.xpath("//a[@title='save']")).click();
	        System.out.println("Data submitted");
	    }

	  //  @Test(priority = 3)
//	    public void modify() {
//	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='List View']"))).click();
//	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@name='chkItem'])[1]"))).click();
//	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(), 'syamala')]"))).click();
//	        driver.findElement(By.xpath("//input[@id='emp000F1']")).sendKeys("amol");
//	        WebElement cityInput = driver.findElement(By.xpath("//input[@id='city000F1']"));
//	        cityInput.clear();
//	        cityInput.sendKeys("Hyderabad");
//	        WebElement ageInput = driver.findElement(By.xpath("//input[@id='age000F1']"));
//	        ageInput.clear();
//	        ageInput.sendKeys("45");
//	        WebElement mobileInput = driver.findElement(By.xpath("//input[@id='mobileno000F1']"));
//	        mobileInput.clear();
//	        mobileInput.sendKeys("9822985540");
//	        driver.findElement(By.xpath("//a[@title='save']")).click();
//	        System.out.println("Data modified and submitted");
//	    }

	    @Test(priority = 4)
	    public void delete() {
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='List View']"))).click();
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@name='chkItem'])[1]"))).click();
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(), 'remove')]"))).click();
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@title='Yes']"))).click();
	        System.out.println("Data deleted");
	    }

	    @Test(priority = 5)
	    public void searchData() {
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='iconsNewSearch']"))).click();
	        driver.findElement(By.xpath("//input[@id='ivInSearchInput']")).sendKeys("syamala");
	    }

	    @AfterClass
	    public void closeBrowser() {
	        if (driver != null) {
	            driver.quit();
	        }
	        System.out.println("Browser closed");
	    }
	}


