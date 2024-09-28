package TestNG_Programs;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BeforeAfterTest {
 @BeforeClass
	void beforeclass()
	{
		System.out.println("Execute Before class");
	}
	
	@AfterClass
	void Afterclass()
	{
		System.out.println("Execute After  class");
	}

	
	@Test
	void test1()
	{
	System.out.println("Execute Test method through xml");
	}
	
@Test
	void Beforeclass()
	{
		System.out.println("Execute class test suite");
	}
	
@Test
	void test3()
	{
		System.out.println("Execute Test 3");
	}
@org.testng.annotations.BeforeMethod
void BeforeMethod()
{
	System.out.println("Execute before every emthod");
}
@org.testng.annotations.AfterMethod
void AfterMethod()
{
	System.out.println("Execute After every emthod");
}
@BeforeSuite
void Beforsuite()
{
System.out.println("Before the Suite");
}

@org.testng.annotations.AfterSuite
void AfterSuite()
{
System.out.println("After the Suite");
}
	
}


