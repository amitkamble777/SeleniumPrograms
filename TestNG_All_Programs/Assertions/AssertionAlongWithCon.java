package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
 Conditional staement alomg with assertions
 Only condition pass or fail that status we need to populate in report
 Only the assertion result will be populated in the result
 Assert is a predefind class which contains different assertion methods
 
 */

public class AssertionAlongWithCon {
	@Test
	void Testtitle()
	{
		String  exp_title="Agile Labs";	
		String  act_title="Agile Labs";
		
	if(exp_title.equals(act_title))
		{
			System.out.println("Test Passed");
			Assert.assertTrue(true);
		}
		else
		{
	System.out.println("Test Failed");
	Assert.assertTrue(false);
	}
	
	}
}
