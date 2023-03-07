package SeleniumTraning.Webdriver_Concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsExecute {

	static WebDriver driver = new ChromeDriver();
	public static void main(String[] args) throws InterruptedException {

//		Utils ut = new Utils(driver);
//		driver =ut.launchBrowser("Chrome");
		
	    driver.get("https://www.google.com/");
		
		
	    WebElement input = driver.findElement(By.name("q"));
	    WebElement search = driver.findElement(By.xpath("(//input[@value='Google Search'])[1]"));
	    
	    input.sendKeys("test");
	    Thread.sleep(2000);
	    
	    List<WebElement> suggestions =driver.findElements(By.xpath("//span[contains(text(),\"test\")]"));
	    
	    System.out.println(suggestions.size());
	    
	    for(WebElement values : suggestions)
	    	
	    {
	    	
	    	String fields = values.getText();
	    	System.out.println(fields);
	    }
	    
 	    JavascriptExecutor js = (JavascriptExecutor)driver;
        Thread.sleep(10000);
        js.executeScript("arguments[0].click();", search);
	    
	    
	    
	}

}
