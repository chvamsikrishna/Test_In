package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


public class BaseClass {

	public WebDriver driver;
	

	@Parameters({"url","browser"})
	@BeforeTest
	public void setUp(String url, String browserName)
	{
		switch(browserName.toLowerCase())
		{
		case "chrome" : driver = new ChromeDriver();
		break;
		case "firefox" : driver = new FirefoxDriver();
		break;
		case "safari" : driver = new SafariDriver();
		break;
		default: System.out.println("please pass the correct browser");
		}
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
	
}
