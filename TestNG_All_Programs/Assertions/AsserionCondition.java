package Assertions;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*Assertion means -- validation of eexpected and actual result.
 only test method will get pass and fail that result wil be populated in the report.
 TestNg will take the result on the test method
 test method status will be updated on the report and result everywhere
 So many Assertion methods are available in Assert class
 Assertion fail test is showing along with Exception in Console
 We will see only assertions output in the report
 We can use multiple asssertion in multiple  test Menthod 
Ech test method having differnt types of validation
We

*/
public class AsserionCondition {
@Test
	void Testtitle()
	{
		String  exp_title="Agile";	
		String  act_title="Agile";
		
/*	if(exp_title.equals(act_title))
		{
			System.out.println("Test Passed");
		}
		else
		{
	System.out.println("Test Failed");
	}
	*/
//Assert.assertEquals(false, false);
		Assert.assertEquals(exp_title, act_title);
		}
	
}
