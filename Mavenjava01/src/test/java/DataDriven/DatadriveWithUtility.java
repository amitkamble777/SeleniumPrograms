package DataDriven;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatadriveWithUtility {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","F:\\Selenium All programs 1\\Driver File\\Driver File\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://localhost/AxpertWeb/aspx/dwb.aspx");
		driver.manage().window().maximize();
		
	String filePath= System.getProperty(("user-dir") +"\\Filepath");
int row= ExcelUtility.getRowCount(filePath, "Sheet1");  // this file store in row variable
	
	for (int i=1; i<=row; i++)
	{
		//Read data from Excel sheet--
		/*here variable is the column name 
		 First row will capture all the data from excel sheet
		 
		Row number is same only the Cell number is change 
		We capture  the data from 1st row by using utility file/Utilityclass
		
		 */
	String data=ExcelUtility.getCellData(filePath, "Sheet1", i, 0);
	String name=ExcelUtility.getCellData(filePath, "Sheet1", i, 1);
	String city=ExcelUtility.getCellData(filePath, "Sheet1", i, 2);
	String age=ExcelUtility.getCellData(filePath, "Sheet1", i, 3);
	String amount=ExcelUtility.getCellData(filePath, "Sheet1", i, 4);
		
		//Pass above data into application --> Pass the data into all the fields in the application.
	driver.findElement(By.xpath("")).sendKeys(data);
		driver.findElement(By.xpath("")).sendKeys(name);
		//for drop down we have to use the select class object
		
		// Validation
		
		
		
		
		
	}

	}

}
