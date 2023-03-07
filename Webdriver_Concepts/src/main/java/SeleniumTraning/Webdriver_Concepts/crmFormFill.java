package SeleniumTraning.Webdriver_Concepts;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class crmFormFill {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		
		Utils ut = new Utils(driver);
		driver = ut.launchBrowser("chrome");
		
		
		
		ut.getURL("https://classic.crmpro.com/index.html");
		
		ElementUtil eu = new ElementUtil(driver);
		
		By username = By.name("username");
		By password = By.name("password");
		
	
		WebElement u_Name = eu.web_Element(username);
        WebElement p_word = eu.web_Element(password);
        
        u_Name.sendKeys("newautomation");
        p_word.sendKeys("Selenium@12345");
        driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
        Thread.sleep(4000);
        
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name=\"mainpanel\"]")));
        
        WebElement contact = driver.findElement(By.xpath("//a[text()=\"Contacts\"]"));
        WebElement addContact = driver.findElement(By.xpath("//a[text()=\"New Contact\"]"));
        
          Actions ac = new Actions(driver);
          ac.moveToElement(contact).build().perform();
          addContact.click();
          
          //Title Webelement
          
          WebElement title = driver.findElement(By.xpath("//select[@name=\"title\"]"));
          eu.dropDown(title, "index" , "3");
          
          WebElement question = driver.findElement(By.xpath("//input[@class=\"button_help\"]"));
          question.click();
          
          String parentWindow = driver.getWindowHandle();
          
          Set<String> windows =driver.getWindowHandles();
          
          for(String win:windows)
          {
        	  if(!win.equals(parentWindow))
        	  {
        		  driver.switchTo().window(win);
        		  driver.manage().window().maximize();
        		  System.out.println(driver.getTitle());
        		  driver.close();
        	  }
          }
          driver.switchTo().window(parentWindow);
          driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name=\"mainpanel\"]")));
         
          WebElement firstName = driver.findElement(By.xpath("//input[@name=\"first_name\"]"));
          firstName.sendKeys("vamsi");
          
          WebElement middleName = driver.findElement(By.xpath("//input[@name=\"middle_initial\"]"));
          middleName.sendKeys("Krishna");
          
          WebElement surname= driver.findElement(By.xpath("//input[@name=\"surname\"]"));
          surname.sendKeys("ch");
          
          WebElement Suffix_Dp = driver.findElement(By.xpath("//select[@name=\"suffix\"]"));
          eu.dropDown(Suffix_Dp, "value", "MD");
          
          driver.findElement(By.xpath("//input[@type=\"file\"]")).sendKeys("C:\\Users\\Niranjan\\Desktop\\New folder\\LOR\\Principal\\Principal\\Pic_D");
          
          
          
          
          
         
 
          	
          
          
          
          
          
        
        
        
		
		
		
	}
}

