package SeleniumTraning.Webdriver_Concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utils {

	  WebDriver driver;
	 
	 public Utils(WebDriver driver)
	 {	
		 this.driver = driver;
	 }
	
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
	
	public void quitBrowser()
	{
		driver.quit();
	}
	
	public void closeBrowser()
	{
		driver.close();
	}
	
	
	
}
