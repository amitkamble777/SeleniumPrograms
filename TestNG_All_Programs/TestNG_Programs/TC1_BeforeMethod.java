package TestNG_Programs;

import org.testng.annotations.Test;

public class TC1_BeforeMethod {
	
@org.testng.annotations.BeforeMethod
 void BeforeMethod()
{
System.out.println("This test case Execute before every method");	 
}

@org.testng.annotations.AfterMethod
void AfterMethod()
{
System.out.println("This test case execute after Every metod");	
}

@Test	
 void test1()
{
System.out.println("Execute test first ");	
}

@Test
void test2()
{
System.out.println("Execute test Second");	
}

@Test
void test3()
{
System.out.println("Execute test Third");	
}
}
