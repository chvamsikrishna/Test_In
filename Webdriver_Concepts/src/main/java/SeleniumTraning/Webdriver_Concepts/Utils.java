package SeleniumTraning.Webdriver_Concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utils {

	 static WebDriver driver;
	
	public WebDriver launchBrowser(String browserName)
	{
	
		switch(browserName.toLowerCase())
		{
		case "chrome":
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Niranjan\\Documents\\Selenium_Files\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
			
		default:
			System.out.println("Please enter valid browser type");
			break;
		}
		return driver;
	}
	
	public void getURL( String URL)
	{
		driver.get(URL);
	}
	
	public String getPageTitle()
	{
		 return driver.getTitle();
	}
	
	
	
}
