package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;


/*
 In Hard Assertion 
 Assert.assertEquals(1, 3);  // if condtion if false  rest of the part will not be executed
 first statements is execute 
 After fail Hard Assertion -- rest of the statements will not be execute
 In testng  most of the time last statement is a assertion
 Assertion jar last la asel ani fail zal  tari kah iproblem honar nahi
 
 */
public class SoftAssertion {
	
	@Test
	void HardAssertion()
	{
		System.out.println("Test 1");
		System.out.println("Test 2");
		
		Assert.assertEquals(1, 3);
		
		System.out.println("Test 3");
		System.out.println("Test 4");
		
		
	}

}
