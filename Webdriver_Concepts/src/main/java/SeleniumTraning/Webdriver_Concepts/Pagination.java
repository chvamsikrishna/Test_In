package SeleniumTraning.Webdriver_Concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Pagination {

 static  WebDriver driver;
 
 
	public static void main(String[] args) throws InterruptedException {
		
		Utils ut = new Utils(driver);
		driver = ut.launchBrowser("Chrome");
		ut.getURL("https://selectorshub.com/xpath-practice-page/");
		
		//common locator - Check box Click - Next page 
		
		Thread.sleep(5000);
		By location = By.xpath("//td[text()='India']");
		By checkBox = By.xpath("(//td[text()='India'])/preceding-sibling::td/input[@type='checkbox']");
		WebElement  next = driver.findElement(By.xpath("//a[@id='tablepress-1_next']"));
		
		
		   
		
		  while(true)
		{
			 
			  if(driver.findElements(location).size()>0)
			  {
			 System.out.println(driver.findElements(location).size());
             List<WebElement> countries_Check = driver.findElements(checkBox);
			for(WebElement country_Check: countries_Check)
			{
					country_Check.click();

			}
			  }
			  
			  if(next.isEnabled())
			  {
			  next.click();
			  Thread.sleep(2000);
			  }
			  else
			  {
				  break;
			  }
			
			  
			  
			
		}
		
	
	
		

	}

}
