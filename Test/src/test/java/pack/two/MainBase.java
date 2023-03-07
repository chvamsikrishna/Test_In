package pack.two;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pack.one.Page;

public class MainBase {

	
	WebDriver driver;
	protected Page page;
		
		
	     @BeforeClass
	     public void setUp() throws Exception
	     {
	    	driver = new ChromeDriver();
	    	
	    	String envName = System.getProperty("env");
			System.out.println("Test cases are running on --"+ envName);
			
			if(envName == null )
			{
				System.out.println("No env are given hence running on QA env ");
			}
	    	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	    	page = new Page(driver);
	     }
	     
	     @AfterClass
	     public void tearDown()
	     {
	    	 driver.close();
	     }
	     

}

