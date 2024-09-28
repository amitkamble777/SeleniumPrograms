package Dropdown;

import java.lang.foreign.Linker.Option;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectdrop {
	
	
	/*
	 Three methods in Drop down 
	 If we have select tag in HTML then we have to use this three Options
	 
	 option.selectByIndex(0); // we need to count from 0 to no of value
	 If index attribute not available in HTML, then we can give index value also
		option.selectByValue("Australia"); ---> Value is the attribut of the element 
		option.selectByVisibleText("Australia");
		 Soem times  Value and VisibleText both are same 
		 Visible text and value both are same
	 
	 */

	public static void main(String[] args) {
	
     System.setProperty("webdriver.chrome.driver","F:\\Selenium All programs 1\\Driver File\\Driver File\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
	//Select option from the drop down 
		WebElement country= driver.findElement(By.xpath("//select[@id='country']"));
		Select  option= new Select(country);
	//	option.selectByVisibleText("Australia");
		option.selectByIndex(7);   // select the 5th no of values
		
	//Capture the options from the dropdown--capture all the options value from the drop down 
	List<WebElement> opt= option.getOptions();  // this method returns multiple options of dropdown field
	System.out.println("No. of Options in drop down:" +opt.size());// O/P-->No. of Options in drop down:10
		
//Print The Option in Console window
    /*	for (int i=0; i<opt.size(); i++) //Return all the options from the dropdown as Webelement.
    	{
    		System.out.println(opt.get(i).getText());
    // Get i --reperesent the index  & get tex reperesent the name of  the option
    		
    }
	*/
	
//Enhence fro Loop
	for(WebElement op:opt)
	{
	System.out.println(op.getText());
	
	}
	driver.quit();
	}

}
