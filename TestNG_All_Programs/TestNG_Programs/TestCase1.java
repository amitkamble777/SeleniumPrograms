package TestNG_Programs;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
	
 @Test (priority=0)
 public void search()
{
System.out.println("First Test case for search the user");	
}

@Test(priority=0)
void valid()
{
	System.out.println("Second Test case for valid user");		
	
	}
 
}
