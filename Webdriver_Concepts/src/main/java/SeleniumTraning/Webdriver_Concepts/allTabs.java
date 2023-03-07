package SeleniumTraning.Webdriver_Concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class allTabs {
	
	
	static int l2;
	static WebDriver driver;

	public static void main(String[] args) {
		
	  Utils us = new Utils(driver);
	  driver = us.launchBrowser("chrome");
	  us.getURL("https://www.bigbasket.com/");
	  
	  
	  ElementUtil eu = new  ElementUtil(driver);
	 
	  By shopByCategory = By.xpath("//a[@qa=\"categoryDD\"]");
	  eu.doClick(shopByCategory);
	  
	  By elements = By.xpath("//a[@qa=\"catL1\"]");
	  By element_2 = By.xpath("//a[@qa= \"catL2\"]");
	  By element_3 = By.xpath("//a[@qa= \"catL3\"]");
	  
	  Actions act = new Actions(driver);
	  
	  List <WebElement> level1= driver.findElements(elements);
	  System.out.println(level1.size());
	  
	  for( WebElement e : level1)
	  {
	     if(!(e.getText().equals("")))
		  {
	  act.moveToElement(driver.findElement(elements)).moveToElement(e).build().perform();
	  System.out.println(e.getText());
	     l2++;
	  List <WebElement> level2= driver.findElements(element_2);
	  for( WebElement e1 : level2)
	  {
		  if(!(e1.getText().equals("")))
		  { 
		  act.moveToElement(e1).build().perform();
		  System.out.println(" -"+e1.getText());
		  l2++;
		  List <WebElement> level3= driver.findElements(element_3);
		     for(WebElement e2: level3)
		     {
		    	 if(!(e2.getText().equals("")))
		    	 {
		    	 act.moveToElement(e2);
		    	 System.out.println("  --"+e2.getText());
		    	 l2++;
		    	 }
		     }
		  }
	  }
	  
	
	  
	}	

	  }
	  System.out.println("Total Links"+l2);
	}
	
}



