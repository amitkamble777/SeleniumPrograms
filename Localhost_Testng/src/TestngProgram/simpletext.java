package TestngProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class simpletext {
	
	WebDriver driver= new ChromeDriver();
	@BeforeClass
	public void launchbrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","F:\\Selenium All programs 1\\Driver File\\Driver File\\chromedriver-win64\\chromedriver.exe");
	    driver.get("http://localhost/AxpertWeb/aspx/dwb.aspx");
		driver.manage().window().maximize();
		System.out.println("Browser alunch successfully");
	}
	
	@Test(priority= 1)
	public void login() throws InterruptedException
	{
		driver.findElement(By.linkText("Log in")).click();
	    driver.findElement(By.xpath("//span[@id='select2-axSelectProj-container']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@type='search']")).sendKeys("post9124");
	    driver.findElement(By.xpath("(//li[contains(text(), 'post9124')])[2]")).click();
	    driver.findElement(By.xpath("//input[@name='axUserName']")).sendKeys("admin");
	    driver.findElement(By.xpath("//input[@name='btnNext']")).click();
	    driver.findElement(By.xpath("//input[@id='axPassword']")).sendKeys("agile");
	    driver.findElement(By.xpath("(//input[@title='Login'])[1]")).click();
		System.out.println("Login succefully");
		}
	@Test(priority = 2)
	public void Form() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@id='globalSearchinp']")).click();
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Simple text ");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//span[contains(text(),'Simple text')])[2]")).click();
	    driver.switchTo().frame("middle1");
	    driver.findElement(By.xpath("//input[@id='emp000F1']")).sendKeys("syamala");
	    driver.findElement(By.xpath("//input[@id='city000F1']")).sendKeys("banglore");
	    driver.findElement(By.xpath("//input[@id='age000F1']")).sendKeys("25");
	    driver.findElement(By.xpath("//input[@id='mobileno000F1']")).sendKeys("9096811963");
	    driver.findElement(By.xpath("//a[@title='save']")).click();
	    System.out.println("Submit data");	
	}
    @Test(priority = 3)
    public void modify()
    {
    	 driver.findElement(By.xpath("//a[@title='List View']")).click();
    	    driver.findElement(By.xpath("(//input[@name='chkItem'])[1]")).click();
    	    driver.findElement(By.xpath("//a[contains(text(), 'syamala')]")).click();
    	    driver.findElement(By.xpath("//input[@id='emp000F1']")).sendKeys("amol");
    	    driver.findElement(By.xpath("//input[@id='city000F1']")).clear();
    	    driver.findElement(By.xpath("//input[@id='city000F1']")).sendKeys("Hyderabad");
    	    driver.findElement(By.xpath("//input[@id='age000F1']")).clear();
    	    driver.findElement(By.xpath("//input[@id='age000F1']")).sendKeys("45");
    	    driver.findElement(By.xpath("//input[@id='mobileno000F1']")).clear();
    	    driver.findElement(By.xpath("//input[@id='mobileno000F1']")).sendKeys("9822985540");
    	    driver.findElement(By.xpath("//a[@title='save']")).click();
    	    System.out.println("Modify and submit the data");
    }
    
    @Test(priority = 4)
    public void delete() throws InterruptedException 
    {
        driver.findElement(By.xpath("//a[@title='List View']")).click();
        driver.findElement(By.xpath("(//input[@name='chkItem'])[1]")).click();
        driver.findElement(By.xpath("//span[contains(text(), 'remove')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@title='Yes']")).click();
        System.out.println("Delete data");
    }
     @Test(priority= 5)
     public void searchdata() throws InterruptedException
     {
    	 driver.findElement(By.xpath("//span[@class='material-icons material-icons-style material-icons-2' and  contains(text(), 'search')]")).click();
    	    Thread.sleep(1000);
    	    driver.findElement(By.xpath("//input[@id='ivInSearchInput']")).sendKeys("syamala");
     }
   @AfterClass 
    public void closeBrowser()
    {
	  // driver.quit();
	   System.out.println("Close the browser");
    }
    
//    //driver.findElement(By.xpath("//td[contains(text(), 'No matching records found')]"))
//    driver.quit();
     }

