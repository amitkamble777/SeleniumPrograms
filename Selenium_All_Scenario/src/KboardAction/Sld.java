package KboardAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*Minimum value of slider eleement 
We need to know the current position of the element on x axis
slid_min.getLocation();  this method will return location of the element on X axis and Y axis

Output 
Loaction of min slider:250
After Increase value:(311, 250) --- > this is not showing the exact values -- dpend on resolution pixel size
We have to increase the value
We need to create a action class Object 
Her we can change only x axis values-- because this is a horizontal Scrollbar
*/

public class Sld {
public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\Selenium All programs 1\\Driver File\\Driver File\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
	    WebElement slid_min=driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[1]"));
		slid_min.getLocation();  // getlocation() is belong to webelement
		System.out.println("Loaction of min slider:" + slid_min.getLocation());  // this will return theexact location values on X and Y axis
		System.out.println("Loaction of min slider:" + slid_min.getLocation().x); //This will return only x axis value
        System.out.println("Loaction of min slider:" + slid_min.getLocation().getY()); //This will return only Y axis value
        
        Actions act=new Actions(driver);
        act.dragAndDropBy(slid_min, 100, 250).build().perform();
        System.out.println("After Increase value:" +slid_min.getLocation());
        
        //For maximum slider need to check evening
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        WebElement slid_max=driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[2]"));
        slid_max.getLocation();
        System.out.println("Location of maximum value:" +slid_max.getLocation());
        Thread.sleep(2000);
        act.dragAndDropBy(slid_max, -100, 250).perform();
        System.out.println("Decrease theMaximum value" +slid_max);
        
}

}
