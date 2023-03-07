package SeleniumTraning.Webdriver_Concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleLanguageLinks {

	static WebDriver driver;


	public static void main(String[] args) {

		Utils uts = new Utils(driver);
		driver = uts.launchBrowser("chrome");
		
		uts.getURL("https://www.google.com");
		
		By langLinks = By.xpath("//*[@id='SIvCob']/a");
		
		List<WebElement> wb = driver.findElements(langLinks);
		System.out.println(wb.size());
		
		int count =0;
		for(WebElement e : wb)
		{
			String lang = e.getText();
			System.out.println(lang);
			if(count ==3);
			{
				e.click();
				break;
			}	
		}
		count ++;
		
	}

}
