package SeleniumTraning.Webdriver_Concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class footerLinks {

	static WebDriver driver;

	public static void main(String[] args) {

		Utils uts = new Utils(driver);
		driver = uts.launchBrowser("chrome");
		uts.getURL("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
		
		By footerTag = By.xpath("//footer//li/a");
		
		List <WebElement> wb = driver.findElements(footerTag);
		
		for(WebElement e :wb)
		{
			    
		         System.out.println(e.getText()+ " "+ e.getAttribute("href"));
			     
		      
		}
		

}
}
