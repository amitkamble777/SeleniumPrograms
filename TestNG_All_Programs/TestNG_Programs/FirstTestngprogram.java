package TestNG_Programs;

import org.testng.annotations.Test;

public class FirstTestngprogram {

	@Test
	void setup()
	{
		System.out.println("Launch the browser");
	}

	@Test
	void  login()
	{
		
	System.out.println("Login successfully");	
	}	
	
	@Test
	void close()
	{
		System.out.println("Clossing the browser");
	}
	
	
}
