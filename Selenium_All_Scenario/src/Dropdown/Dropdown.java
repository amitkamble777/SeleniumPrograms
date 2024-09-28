package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\Selenium All programs 1\\Driver File\\Driver File\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://localhost/AxpertWeb/aspx/dwb.aspx");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.xpath("//span[@id='select2-axSelectProj-container']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("post9124");
        driver.findElement(By.xpath("(//li[contains(text(), 'post9124')])[2]")).click();
        driver.findElement(By.xpath("//input[@name='axUserName']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name='btnNext']")).click();
        driver.findElement(By.xpath("//input[@id='axPassword']")).sendKeys("agile");
        driver.findElement(By.xpath("(//input[@title='Login'])[1]")).click();
        driver.findElement(By.xpath("//input[@id='globalSearchinp']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='globalSearchinp']")).sendKeys("Drop down");
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//span[contains(text(),'Drop down')])[2]")).click();
        driver.switchTo().frame("middle1");
       
        
        //1) Select single option from drop down
//        driver.findElement(By.xpath(" //textarea[@role='searchbox']")).click();
//        driver.findElement(By.xpath("(//li[contains(text(),  'amit')])[1]")).click();
        
        //2)Capture all the options and find out size
        driver.findElement(By.xpath("//span[@id='select2-Form000F1-container']")).click();
        
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("amit");
       List<WebElement> opt= driver.findElements(By.xpath("//ul[@class='select2-results__options']//input"));
       
       // List<WebElement> opt= driver.findElements(By.xpath("//ul[@class='select2-results__options']//li"));
       System.out.println("Drop down Size:" +opt.get(1));
        
       //driver.findElement(By.xpath("//ul[@class='select2-results__options']"));
//       // driver.findElement(By.xpath(" "));
//       
//       //3) Printing option from drop down 
//       for(WebElement op:opt)
//       {
//    	   System.out.println(op.getText());
//       }
//       
//       //4) select multiplle options from drop down
//       for(WebElement abc:opt)
//       {
//    	   
//    	   String option = abc.getText();
//    	   System.out.println();
//       }
//       
       }

}
