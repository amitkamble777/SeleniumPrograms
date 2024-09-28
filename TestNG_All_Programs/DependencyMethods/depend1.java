package DependencyMethods;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class depend1 {

@Test (priority=0)
void login()
{
System.out.println("Login ");	
//Assert.assertEquals(true, true);
}

@Test (priority=1, dependsOnMethods= {"login"})
void search()
{
	System.out.println("Search");
	Assert.assertEquals("amit", "sumit");
}

@Test (priority=2, dependsOnMethods= {"search"})
void adsearch()
{
System.out.println("Adavace Search");
}

@Test (priority=3, dependsOnMethods= {"adsearch"})
void logout()
{
System.out.println("Logout");	
}

}
