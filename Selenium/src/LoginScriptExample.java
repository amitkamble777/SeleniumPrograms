import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class LoginScriptExample {

    WebDriver driver;
    
    WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        // Set the path for the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "F:\\Selenium All programs 1\\Driver File\\Driver File\\chromedriver-win64\\chromedriver.exe");

        // Initialize the WebDriver
        driver = new ChromeDriver();

        // Open the login page
        driver.get("http://example.com/login");
    }

    @Test
    public void testLogin() {
        // Locate the username field and enter a value
        WebElement usernameField = driver.findElement(By.id("username"));
        usernameField.sendKeys("yourUsername");

        // Locate the password field and enter a value
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("yourPassword");

        // Locate the login button and click it
        WebElement loginButton = driver.findElement(By.id("loginButton"));
        loginButton.click();

        // Wait for the next page to load (this is a simple way, for production code use WebDriverWait)
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Verify that login was successful by checking the presence of an element on the landing page
        WebElement loggedInElement = driver.findElement(By.id("loggedInElementId"));
        Assert.notNull(loggedInElement, "Login failed!");
    }

    @AfterClass
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}

