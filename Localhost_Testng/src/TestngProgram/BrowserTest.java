package TestngProgram;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest{

WebDriver driver;
@BeforeClass
    public void setUp() {
        // Set up things needed before any tests run
        System.setProperty("webdriver.chrome.driver", "F:\\Selenium All programs 1\\Driver File\\Driver File\\chromedriver-win64\\chromedriver.exe");
    }

    @BeforeMethod
    public void openBrowser() {
        // Open a new browser before each test method
        driver = new ChromeDriver();
    }

    @Test
    public void loginTest() {
        // Test to login to a page
        driver.get("http://localhost/AxpertWeb/aspx/sess.aspx");
        driver.manage().window().maximize();
        // Perform login actions
        // Assert login success
        System.out.println("Browser launch successfully");
    }
    
    @Test
    public void login()
    {
    	driver.findElement(By.xpath("//a[@title='Log in']")).click();
        driver.findElement(By.xpath("//span[@id='select2-axSelectProj-container']")).click();
       // Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("post9124");
        driver.findElement(By.xpath("(//li[contains(text(), 'post9124')])[2]")).click();
        driver.findElement(By.xpath("//input[@name='axUserName']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name='btnNext']")).click();
        driver.findElement(By.xpath("//input[@id='axPassword']")).sendKeys("agile");
        driver.findElement(By.xpath("(//input[@title='Login'])[1]")).click();	
        System.out.println("Login successfully");
     }
 @AfterMethod
    public void closeBrowser() {
        // Close the browser after each test method
        //driver.quit();
    }

    @AfterClass
    public void tearDown() {
        // Clean up things after all tests have run
    }
}
