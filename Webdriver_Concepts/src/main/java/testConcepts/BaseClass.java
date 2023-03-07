package testConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	WebDriver driver; 
	
	@BeforeTest
	public void setUp()
	
	{
       driver= new ChromeDriver();
       driver.manage().window().maximize();
       //driver.get("https://courses.letskodeit.com/practice");
       //driver.get("https://www.google.com");
       //driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.get("https://emicalculator.net/");
        
        
    } 
	
	@AfterTest
    public void tearDown()
    {
    	//driver.close();
    }
    
}
