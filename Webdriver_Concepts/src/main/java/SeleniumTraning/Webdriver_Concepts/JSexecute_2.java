package SeleniumTraning.Webdriver_Concepts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSexecute_2 {
	
	// Use of Java Script in various cases below, Use in project only when there are no options
			/*
			 *  click 
			 *  SendKeys
			 *  Refresh
			 *  Scroll vertically 
			 *  Height and Width of the page
			 *  
			 */

	static WebDriver driver;
	

	
	public static void main(String[] args) {
		driver = new ChromeDriver();
		
		
		JSexecute_2 obj = new JSexecute_2();
		obj.dimentions();
		
		
		
	}
	
	public void click()
	{
		
	}
	
	public void keys()
	{
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('input-email').value='vamsi@gmail.com';");
		
	}
	
	public void refresh()
	{
		
		driver.get("https://www.google.com/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("history.go(0);");
		
	}
	
	public void dimentions()
	{

		driver.get("https://www.google.com/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		String height = js.executeScript("return window.innerHeight;").toString();
		String width = js.executeScript("return window.innerWidth;").toString();
		
		 int value_Height= Integer.parseInt(height);
		 int value_Width = Integer.parseInt(width);
		 
		 System.out.println(value_Height+" "+value_Width);
		
	}
	
	public void scroll()
	{
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,1000);");
		
	}

}
