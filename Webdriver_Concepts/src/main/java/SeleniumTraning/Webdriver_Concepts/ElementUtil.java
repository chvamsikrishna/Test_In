package SeleniumTraning.Webdriver_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {
	
	WebDriver driver;
	
	public ElementUtil(WebDriver driver)
	{
		this.driver = driver;
	}

	
	public WebElement web_Element(By locator)
	{
		return driver.findElement(locator);
	}
	
	public void doSendKeys(By locator, String value)
	{
		web_Element(locator).sendKeys(value);
	}
	
	public void doClick(By locator)
	{
		web_Element(locator).click();
	}
	
	public String doGetText(By locator)
	{
		return web_Element(locator).getText();
	
		
	}
	
	public void dropDown(WebElement w, String type, String attribute_Value)
	{
		Select sc = new Select(w);
		
		switch(type.toLowerCase().trim())
		{
		case "value":
			sc.selectByValue(attribute_Value);
			break;
		case "visibletext":
			sc.selectByVisibleText(attribute_Value);
			break;
		case "index":
			sc.selectByIndex(Integer.parseInt(attribute_Value));
			break;
		default :
			System.out.println("Enter correct value for dropdown");
		 
			
		}
		
	}
	
	
	
}
