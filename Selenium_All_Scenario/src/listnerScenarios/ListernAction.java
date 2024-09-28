package listnerScenarios;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListernAction implements ITestListener
{
	  public void onStart(ITestContext context) { //Before starting all methods it will execute only once
		 
		  System.out.println("Test Execution is started.....");   //Before starting all the test menthod OnTestStart method will automaticaaly trigger
		  }
	
	
public void onTestStart(ITestResult result) {
  System.out.println("Test start");   // This will execute for start the every test methods 
  }

public void onTestSuccess(ITestResult result) 
{
    System.out.println("Test Pass........");
  }
public void onTestFailure(ITestResult result) {
  System.out.println("Test Fail..........."); // Test will fail-- Automaticaaly trigger the method
  }
public void onTestSkipped(ITestResult result) {
    System.out.println("Test Skipp........"); // test will get skipp
  }
public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    // not implemented
  }
public void onTestFailedWithTimeout(ITestResult result) {
    onTestFailure(result);
  }
public void onFinish(ITestContext context) {
    System.out.println("Test Execution completed"); //After execution of all test mthods -- it will triger
  }

}