package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/*
 We dont access this method directly from the assert class
 This method we have to acees from Object
 This method we can access from the object of SofassertClass
 These are not a static methods available in soft assert class
 When we used the sof assertion 
 end of this method we hae to use this  
 sa.AssertAll();   --> this methodd is mandatory 
 Then only this will do the right validation
 Clas level we can create soft assert method,the problem is object we can not create in testng Because object is create only main method
 Varaible we can create  in class level then we can inittiate in multiple methods
 soft assert is a class we can create object in main method
 
  
 */
public class SoftAssertion2 {
	SoftAssert sa;
	
/*	@Test
	void Soft()
	{
		System.out.println("Test 1");
		System.out.println("Test 2");
		
		SoftAssert sa =new  SoftAssert(); 
		sa.assertEquals(1, 3);   //Assertion is fail but testcase all statement will be execute
		
		System.out.println("Test 3");
		System.out.println("Test 4");
	
		sa.assertAll();   //Mandatory  thsi is specially for soft assertion -- hard assertion not need 
	}

*/
	@Test
	
	void softvariable()
	{
		
		sa= new SoftAssert();
		System.out.println("Soft Assert variable Test 1");
		System.out.println("Soft Assert variable Test 2");
		sa.assertEquals("sanju", "amit");
		System.out.println("Soft Assert variable Test 3");
		System.out.println("Soft Assert variable Test 4");
		
		sa.assertAll();
		
	}

}




