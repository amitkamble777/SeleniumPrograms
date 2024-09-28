package Assertions;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
 Same assertions are available in Junit also
 Assert.assertEquals(25, 20);--> it will compair the String, number and bollean also
 Number and string not compare
 
 Assert.assertNotEquals("amit", "priya");  it will compair the String, number and bollean also
 Number and string not compare
 
 This all assertions  comes under Hard Assertions
 Hard assertion means -->method which can directly access from the assert class
 
 */

public class HardAssertion {
	@Test
	void TestTwoValues()
	{
Assert.assertEquals(12 , 12);	 //This method will compare the both values	
Assert.assertEquals("amit" ,"amit");
	}

	@Test
	void NotEqual()
	{
		Assert.assertNotEquals(25, 30);  // Pass the test case 
		Assert.assertNotEquals("amit", "priya");
		}
	@Test
	 void True()
	 {
		//Assert.assertTrue(false); //It will fail the test case
		// Assert.assertTrue(true);  // It will pass the test case
	 
	 Assert.assertTrue(1==1);   // Passed
	// Assert.assertTrue(2==3);   // Failed
	
	 //Here i used the relational operator
	 }
	@Test
	void fals()
	{
		//Assert.assertFalse(1==1);  // Failed
	Assert.assertFalse("amit"== "priya");    // Passed --for mumeric and string also
		
	}
	
	@Test
	void blindfaile()
	{
		//Without condition and validation  test  will be fail
		Assert.fail();   // this method diectly fail the Test case
	}
	
}
