package Actionclaa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


/*
 Source element is a rome 
 Target element is a italy
 Rome is a capital of italy
 
 */

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\Selenium All programs 1\\Driver File\\Driver File\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	    driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette\\");
		driver.manage().window().maximize();
		Actions act= new Actions(driver);	
	
		//Drag and drop 1 
	WebElement rome=driver.findElement(By.xpath("//div[@id='box6']"));  //source elemenet
    WebElement italy=driver.findElement(By.xpath("//div[@id='box106']")); //target element
    act.dragAndDrop(rome, italy).perform();
    
    //Drag and drOP 2 
    WebElement Wash=driver.findElement(By.xpath("//div[@id='box3']"));  //source elemenet
    WebElement US=driver.findElement(By.xpath("//div[@id='box103']")); //target element
    act.dragAndDrop(Wash, US).perform();
    
    //If elemet drag from one frame and drop to another frame we need to use switch frame 
    
    
    




	
	}

}
