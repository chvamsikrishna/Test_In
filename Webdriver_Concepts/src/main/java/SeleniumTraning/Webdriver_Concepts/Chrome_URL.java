package SeleniumTraning.Webdriver_Concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_URL {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		String env = "Chrome";
		Utils browserUtils =new Utils(driver);
		browserUtils.launchBrowser(env);

	    browserUtils.getURL("https://www.google.com/");
	    String title = browserUtils.getPageTitle();
	    System.out.println(title);
	    
	    if(title.contains("Google"))
	    
	    {
	    	System.out.println("correct title");
	    }
	    System.out.println("invalid title");

	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Niranjan\\Documents\\Selenium_Files\\chromedriver.exe");
	// WebDriver driver = new ChromeDriver();
    
	 //driver.get("https://www.google.com/");
	 //String title = driver.getTitle();
	// System.out.println(title);
	 
//	 if(title.equals("Google"))
//	 {
//		 System.out.println("title matched");
//	 }
//	 System.out.println("title matched");
//	}
	 
	 //System.out.println(title.equals("Google")?"Title Matched":"Title not matched");
	 
	}

}
