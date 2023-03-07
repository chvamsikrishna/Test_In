package SeleniumTraning.Webdriver_Concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SVG {

	static WebDriver driver;
	
		//iframe = id = map-instance-98209
		//svg = //*[local-name()='svg' and @id='map-svg']
		//location - //*[local-name()='svg' and @id='map-svg']//*[name()='g' and @class='rpath']//*[name()='path']
		
public static void main(String[] args) throws InterruptedException {
		
		Utils ut = new Utils(driver);
		driver = ut.launchBrowser("Chrome");
		ut.getURL("https://petdiseasealerts.org/forecast-map#/");
		
		Thread.sleep(5000);
			
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map')]")));
		
		
		List<WebElement>regions = driver.findElements(By.xpath("//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @class='region']//*[name()='path']"));
		
		   System.out.println(regions.size());
		   
		    for(WebElement e : regions)
		    {
		        String s = e.getAttribute("name");
		        System.out.println(s);
		        
		        if(s.equals("Vermont"))
		        	
		        {
		        	e.click();
		        	break;
		        }
		        	
		        
		        
		        
		    }
		
		
}

}
