package SeleniumAllCommand;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ScreenShot {
	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium All programs 1\\Driver File\\Driver File\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://crmpro.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("amit358");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("amit@777");
		driver.findElement(By.xpath("//input[@value='Login']")).click();

//full Page Screen shot -- Use TakeScreenShot Interface 
		/*
		 * driver is a instance variable of webdriver Webdriver and takescreenshot both
		 * are different interface thats why we need to do type casting Webdriver
		 * interface -(Is a root interface) which contains a lot of methods Which are
		 * implemented by a multiple classes Remote Webdriver is a class ->Remote
		 * Webdriver class implemented all the methods from Webdriver interface,
		 * javascript interface, Takescreenshot interface Everything is available in
		 * remote Webdriver
		 */
		/*
		TakeScreenShot ab = ((TakeScreenShot) driver);
		//File src = ((RemoteWebDriver) ts).getScreenshotAs(OutputType.FILE);
		File src= ab.getScreenshotAs(OutputType.FILE);
		File trg = new File("F://Screenshot//image.png");
		Files.copy(src, trg);
		driver.quit();
		*/
		TakesScreenshot ss = ((TakesScreenshot) driver);
		String fileWithPath = "F://Screenshot//image.png";
		//Call getScreenshotAs method to create image file
		File SrcFile=ss.getScreenshotAs(OutputType.FILE);
		//Move image file to new destination
		File DestFile=new File(fileWithPath);
		//Copy file at destination
		Files.copy(SrcFile, DestFile);
	    driver.quit();
		
		

	}

}
