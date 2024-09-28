package DataDriven;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fillgridsource{
public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\Selenium All programs 1\\Driver File\\Driver File\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://localhost/AxpertWeb/aspx/dwb.aspx");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Log in")).click();
		String test = ("Fillgrid");
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
        driver.findElement(By.xpath("//input[@id='globalSearchinp']")).sendKeys("Fillgrid Source");
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//span[contains(text(),'Fillgrid Source')])[2]")).click();
        driver.switchTo().frame("middle1");
       driver.findElement(By.xpath("//input[@id='emp000F1']")).sendKeys("priya");
       driver.findElement(By.xpath("//input[@id='stname001F2']")).sendKeys("priya");
       driver.findElement(By.xpath("//input[@id='clg001F2']")).sendKeys("KKW");
       driver.findElement(By.xpath("//input[@id='age001F2']")).sendKeys("20");
       driver.findElement(By.xpath("//a[@id='gridAddBtn2']")).click();
      // driver.findElement(By.xpath("//input[@id='emp000F1']")).sendKeys("sumit");
       Thread.sleep(1000);
       driver.findElement(By.xpath("//input[@id='stname002F2']")).sendKeys("raju");
       driver.findElement(By.xpath("//input[@id='clg002F2']")).sendKeys("iceem");
       driver.findElement(By.xpath("//input[@id='age002F2']")).sendKeys("30");
       driver.findElement(By.xpath("//a[@id='gridAddBtn2']")).click();
       Thread.sleep(1000);
       driver.findElement(By.xpath("//input[@id='stname003F2']")).sendKeys("amol");
       driver.findElement(By.xpath("//input[@id='clg003F2']")).sendKeys("padd");
       driver.findElement(By.xpath("//input[@id='age003F2']")).sendKeys("24");
       driver.findElement(By.xpath("//a[@id='ftbtn_iSave']")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//a[@title='List View']")).click();
       driver.findElement(By.xpath("(//input[@name='chkItem'])[1]")).click();
       driver.findElement(By.xpath("//a[contains(text(), 'priya')]")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//input[@id='emp000F1']")).sendKeys("pushpa");
       Thread.sleep(1000);
       driver.findElement(By.xpath("//tr[@id='sp2R001F2']")).click();
       driver.findElement(By.xpath("//input[@id='stname001F2']")).click();
       driver.findElement(By.xpath("//input[@id='stname001F2']")).sendKeys("syamala");
       driver.findElement(By.xpath("//input[@id='clg001F2']")).click();
       driver.findElement(By.xpath("//input[@id='clg001F2']")).sendKeys("hpb");
       driver.findElement(By.xpath("//input[@id='age001F2']")).click();
       driver.findElement(By.xpath("//input[@id='age001F2']")).sendKeys("25");
       driver.findElement(By.xpath("//tr[@id='sp2R002F2']")).click();
       driver.findElement(By.xpath("//input[@id='stname002F2']")).click();
       driver.findElement(By.xpath("//input[@id='stname002F2']")).sendKeys("shubham");
       driver.findElement(By.xpath("//input[@id='clg002F2']")).click();
       driver.findElement(By.xpath("//input[@id='clg002F2']")).sendKeys("Hi tech");
       driver.findElement(By.xpath("//input[@id='age002F2']")).click();
       driver.findElement(By.xpath("//input[@id='age002F2']")).sendKeys("32");
       driver.findElement(By.xpath("//tr[@id='sp2R003F2']")).click();
       driver.findElement(By.xpath("//input[@id='stname003F2']")).click();
       driver.findElement(By.xpath("//input[@id='stname003F2']")).sendKeys("gaju");
       driver.findElement(By.xpath("//input[@id='clg003F2']")).click();
       driver.findElement(By.xpath("//input[@id='clg003F2']")).sendKeys("MGM");
       driver.findElement(By.xpath("//input[@id='age003F2']")).click();
       driver.findElement(By.xpath("//input[@id='age003F2']")).sendKeys("23");
       Thread.sleep(2000);
       driver.findElement(By.xpath("//a[@id='ftbtn_iSave']")).click();
       // WebDriverWait wait =new WebDriverWait(driver, 5);
       driver.switchTo().defaultContent();
       driver.findElement(By.xpath("//input[@id='globalSearchinp']")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//input[@id='globalSearchinp']")).sendKeys("Fillgrid Target");
       Thread.sleep(1000);
       driver.findElement(By.xpath("(//span[contains(text(),'Fillgrid Target')])[2]")).click();
       driver.switchTo().frame("middle1");
       driver.findElement(By.xpath("//span[contains(text(), 'Select an option')]")).click();
       driver.findElement(By.xpath("//input[@role='searchbox']")).sendKeys("pushpa");
       Thread.sleep(3000);
       driver.findElement(By.xpath("//li[contains(text(), 'pushpa')]")).click();
       driver.findElement(By.xpath("//a[@title='fillgrid1']")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("(//input[@name='chkItem'])[1]")).click();
       driver.findElement(By.xpath("(//input[@name='chkItem'])[2]")).click();
       Thread.sleep(1000);
       driver.findElement(By.xpath("//button[contains(text(), 'Ok')]")).click();
        Thread.sleep(1000);
       driver.findElement(By.xpath("//a[@id='ftbtn_iSave']")).click();
       driver.findElement(By.xpath("//a[@title='List View']")).click();
       Thread.sleep(2000);
       WebElement variable = driver.findElement(By.xpath("(//a[@data-data='pushpa'])[1]"));
       String actual= variable.getText();
		System.out.println(actual);
		String Expected= "Form cannot be empty.";
		String excelreportpath = null;
		File f = new File(excelreportpath);
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		try {
			assertEquals(actual, Expected);
//			test.pass("Test Case Scenario 1 Passed");
//			test.addScreenCaptureFromPath(screenshot1);
			wb.getSheetAt(0).getRow(1).getCell(6).setCellValue(Expected);
			wb.getSheetAt(0).getRow(1).getCell(7).setCellValue(actual);
			wb.getSheetAt(0).getRow(1).getCell(8).setCellValue("Pass");
			wb.getSheetAt(0).getRow(1).createCell(9);
			FileOutputStream fos = new FileOutputStream(f);
			wb.write(fos);
			wb.close();
			System.out.println("Completed");
		} catch (AssertionError e) {
//			test.fail("Failed due to " + e.getMessage());
//			test.addScreenCaptureFromPath(screenshot1);
			// wb.getSheetAt(0).getRow(20).getCell(1).setCellValue(Testcase);
			wb.getSheetAt(0).getRow(1).getCell(6).setCellValue(Expected);
			wb.getSheetAt(0).getRow(1).getCell(7).setCellValue(actual);
			wb.getSheetAt(0).getRow(1).getCell(8).setCellValue("Fail");
			String message = e.getMessage();
			wb.getSheetAt(0).getRow(1).getCell(9).setCellValue(message);
			FileOutputStream fos = new FileOutputStream(f);
			wb.write(fos);
			wb.close();
		}
		String excelreportpath1 = "E:\\Slenium 2024-03\\Mavenjava01\\TestData\\Exceldata.xlsx"; 

}

}
// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
// driver.findElement(By.xpath("//input[@id='globalSearchinp']")).click();      
       
//       Thread.sleep(5000);
//       driver.findElement(By.xpath("//a[@title='List View']")).click();
//       driver.findElement(By.xpath("(//input[@name='chkItem'])[1]")).click();
//       driver.findElement(By.xpath("//a[contains(text(), 'pushpa')]")).click();
//       driver.findElement(By.xpath("//a[@title='Delete']")).click();
//       Thread.sleep(1000);
//       driver.findElement(By.xpath("//button[contains(text(), 'Confirm')]")).click();
//       Thread.sleep(1000);
//       driver.findElement(By.xpath("//a[@title='List View']")).click();
//       driver.findElement(By.xpath("(//span[contains(text(), 'search')])[1]")).click();
//       driver.findElement(By.xpath("//input[@id='ivInSearchInput']")).sendKeys("pushpa");
//       Thread.sleep(2000);
//       WebElement textField = driver.findElement(By.xpath("//td[contains(text(), 'No matching records found')]"));
//        String actualtext = textField.getText();
//       String  expectedText = "No matching records found";
//       System.out.println(actualtext);    
//}                                                                                                                                                                                                                                                   