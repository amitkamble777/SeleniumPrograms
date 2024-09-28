import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestNG {

	@Test
	void test() {
	
		System.out.println("TestNg");
	}
	@Test()
	void serverStartedOk() 
	{
		System.out.println("Execue test case 1");
	}
	
	@Test()
	void initEnvironment() 
	{
		System.out.println("Test 2");
	}
	@Test()
  void method1() 
	{
	System.out.println("Test case 3");
	}
	
}
