package DataDriven;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatadrivernTstruct {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","F:\\Selenium All programs 1\\Driver File\\Driver File\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://localhost/AxpertWeb/aspx/dwb.aspx");
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
        driver.findElement(By.xpath("//input[@id='globalSearchinp']")).sendKeys("Data Driven");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//span[contains(text(),'Data Driven')])[2]")).click();
        driver.switchTo().frame("middle1");
     
      String filepath=System.getProperty(("user.dir") +"\\TestData\\dataexp.xlsx");
      //ExcelUtility rows= new ExcelUtility();
  int row=ExcelUtility.getRowCount(filepath, "Sheet1");
     for(int i=1; i<=row; i++)
     {
    	 //Read data from Excel sheet  of 1st row 
    	   String name= ExcelUtility.getCellData(filepath, "Sheet1", i, 0);
    	   String city= ExcelUtility.getCellData(filepath, "Sheet1", i, 1);
    	   String amount= ExcelUtility.getCellData(filepath, "Sheet1", i, 2);
    	 
    	//2nd step -->>Pass the above data in the application to all the fields  from the excel sheet
    	   driver.findElement(By.id("name000F1")).sendKeys(name);
           driver.findElement(By.id("city000F1")).sendKeys(city);
           driver.findElement(By.name("amount000F1")).sendKeys(amount);
 		   driver.findElement(By.id("ftbtn_iSave")).click();
 		   
 //Validation- -- capture the values for use 		   
 }
            		
//   driver.findElement(By.id("name000F1")).sendKeys("amit");
//   driver.findElement(By.id("city000F1")).sendKeys("mumbai");
//   driver.findElement(By.name("amount000F1")).sendKeys("120");
//   driver.findElement(By.id("ftbtn_iSave")).click();
//	 driver.quit();
}

}
