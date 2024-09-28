package TestNG_Programs;

import org.testng.annotations.Test;

public class TestNGxml {
	
	@Test(priority=3)
	void setup()
	{
		System.out.println("Launch the browser");
	}

	@Test(priority=2)
	void  login()
	{
		
	System.out.println("Login successfully");	
	}	
	
	@Test (priority=1)
	void close()
	{
		System.out.println("Clossing the browser");
	}

}
