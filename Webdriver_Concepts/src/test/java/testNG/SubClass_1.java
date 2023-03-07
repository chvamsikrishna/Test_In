package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SubClass_1 extends BaseClass 
{
	

	
   @Test()
   public void guru99()
   {
	 // driver.get("https://www.guru99.com/");
	  String title_1 = driver.getTitle();
	  System.out.println(title_1);   
   }
   
   @Test()
   public void guru99_()
   {
	  //driver.get("https://www.guru99.com/");
	  driver.findElement(By.xpath("(//ul[@class='menu1']//a)[1]")).click();
	  String pageTitle = driver.getTitle();
	  System.out.println(pageTitle);  
   }
  	
   
}
