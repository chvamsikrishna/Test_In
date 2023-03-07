package testNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

// TestNG is a external Library alternate to JUnit
// Write test cases based on Annotations, Priorities, test case dependency
// It provides HTML reports
// Can run test cases with Parallel mode
// Can we integrated with Maven, Jenkins
// Data Driven testing
// Custom listerners
// testng.xml file ( Runner File  which controls the execution ) 
// Assertions ( Hard and Soft Assertions ) 

/*/
 * for only java we have testNG, for python we use PyTest.
 * Install testNG plugin ( To run the test cases, We don't need main method ) 
 *  and test NG dependency and we are good to go.
 *  
 *  Naming convention should end with Test...eg: TestNGLevelsTest.java
 */

// Suite -> Test -> class ->Method -> test cases -> Method -> Class -> Test -> Suite

public class TestNGLevels {
	
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite");
	}
	
	@Test
	public void test1()
	{
		System.out.println("Test-1");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite");
	}
	

}
