package HeadlessTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleSSL {

	
	public static void main(String[] args) {
		
		ChromeOptions option= new ChromeOptions();
		option.setAcceptInsecureCerts(true);// bydefault here  is false we  need to do true
		//Accept SSL Certificate from the Web Page 
		
		WebDriver driver=new ChromeDriver(option); // Without option this setting is not applicable
		
	driver.get("https://www.javatpoint.com/java-oops-concepts");
	driver.manage().window().maximize();
	
	System.out.println("Title of the Page:" + driver.getTitle());  //Privacy error
	                                                   // After applying SSL METHOD  Actual title will get Expired.badssl.com   

	}

}
