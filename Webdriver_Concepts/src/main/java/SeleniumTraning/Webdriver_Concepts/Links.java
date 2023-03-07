package SeleniumTraning.Webdriver_Concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {
 
 static WebDriver driver;

	public static void main(String[] args) {

		Utils uts = new Utils(driver);
		driver = uts.launchBrowser("chrome");
	uts.getURL("https://www.amazon.com/");
//		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Niranjan\\Documents\\Selenium_Files\\chromedriver.exe");
//		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		
		List <WebElement> wb = driver.findElements(By.tagName("a"));
		
		
		for( WebElement e : wb)
		{
			String s = e.getAttribute("href");
//			String s = e.getText();
			System.out.println(s);
			
			
		}
		
	}

}
