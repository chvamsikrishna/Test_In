package SeleniumTraning.Webdriver_Concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Selectors_UserTable {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		Utils ut = new Utils(driver);
		driver = ut.launchBrowser("chrome");
	
		ut.getURL("https://selectorshub.com/xpath-practice-page/");
		
		ElementUtil eu = new ElementUtil(driver);

		By header = By.xpath("(//table[@id='resultTable']//th)[2]/a");
		
		System.out.println(eu.doGetText(header));
		
		List<WebElement>names =driver.findElements(By.xpath("//table[@id='resultTable']//tbody//a"));
		
		System.out.println();
	    int roll = 0;
		for(WebElement users : names)
		{
			System.out.println(++roll +":" +users.getText());
		}
		
	}

}
