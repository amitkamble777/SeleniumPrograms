package TestNG_Programs;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {
	
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
	
@Test
	void Annotation()
	{
		System.out.println("Execute Test 1");
	}
	
	
	@Test
	void test2()
	{
		System.out.println("Execute Test 2");
	}
	
	
	@Test
	void test3()
	{
		System.out.println("Execute Test 3");
	}
	
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
	

	@BeforeTest
void Befortest()
{
System.out.println("Befor the Test");
}

@AfterTest
void Aftertest()
{
System.out.println("After the  Test");
}
	
}
