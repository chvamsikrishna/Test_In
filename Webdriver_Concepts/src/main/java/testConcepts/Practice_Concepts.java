package testConcepts;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import net.bytebuddy.asm.Advice.Argument;

public class Practice_Concepts extends BaseClass{
	
	@Test
	public void radioButton_Test()
	{
		List <WebElement> radioItems =
		driver.findElements(By.xpath("//legend[contains(text(),\"Radio\")]/following-sibling::label"));
		
		for(WebElement buttons: radioItems)
		{
			String buttonName = buttons.getText();
			if(buttonName.equals("Benz"))
			{
				buttons.click();
			}
		}
		
		System.out.println("-----END OF RADIO TEST ----");
	}
	
	@Test
    public void selectDropDown()
    {
		
		Select dropDown = new Select(driver.findElement(By.id("carselect")));
		List<WebElement> options = dropDown.getOptions();
		for(WebElement values : options)
		{
			String dropDown_Value = values.getText();
			System.out.println(dropDown_Value);
			
		}
		
		dropDown.selectByValue("Honda");	
		System.out.println("-----END OF select TEST ----");
    }
	
	
	@Test
	public void checkBox_Test()
	{
		
		List <WebElement> checkbox_Items =
				driver.findElements(By.cssSelector("#checkbox-example-div>fieldset>label"));
		
		for(WebElement checks: checkbox_Items)
		{
			if(checks.getText().equals("BMW"))
			{
				checks.click();
			}
		}
		System.out.println("-----END OF Checkbox TEST ----");
	}
	
	@Test
	public void window_Test() 
	{
		
			WebElement openWindow =
			                  driver.findElement(By.xpath("//legend/following-sibling::button[@id=\"openwindow\"]"));
			
			String currentWindow = driver.getWindowHandle();
			
			openWindow.click();
			
			Set<String> handles = driver.getWindowHandles();
			System.out.println(handles.size());
			 
			// Ideally while using windows we use Iterator --- to Iterate through out the windows
			
			for (String windows : handles)
			{
				if(!windows.equals(currentWindow))
				{
			            driver.switchTo().window(windows);
			            System.out.println("Child-Window "+ driver.getTitle());
			            driver.close();  
				}
				
			}
			
			driver.switchTo().window(currentWindow);
			System.out.println("Parent-Window " +driver.getTitle());
			
			System.out.println("-----END OF Window TEST ----");
		
   }
	
	@Test
	public void otherTab_Test()
	{

		WebElement openTab =
		                  driver.findElement(By.xpath("//a[@id=\"opentab\"]"));
		
		String currentWindow = driver.getWindowHandle();
		openTab.click();
		
		
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles.size());
		 
		 Iterator<String> window_Test =handles.iterator();
		 
		 while(window_Test.hasNext())
		 {
		              
			String window_Value = window_Test.next();
					
			if(!window_Value.equals(currentWindow))
			{
		            driver.switchTo().window(window_Value);
		            System.out.println("Child-Window "+ driver.getTitle());
		            driver.close();  
			}
			
		}
		
		driver.switchTo().window(currentWindow);
		System.out.println("Parent-Window " +driver.getTitle());
	
		System.out.println("-----END OF other tab TEST ----");
	}
	
	
	@Test
	public void alert_Test() throws InterruptedException
	{
		   JavascriptExecutor js = (JavascriptExecutor) driver;
		  // js.executeScript("document.getElementById(\"name\").click();");
		   js.executeScript("document.getElementById(\"name\").value='Hey'");
		   js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@id=\"alertbtn\"]")));
		   
		   Alert a = driver.switchTo().alert();
		   Thread.sleep(3000);
		   a.accept(); 
	}
	

	@Test
	public void webTable_Test()
	{
		
		int i=1;
		
		
		List<WebElement> headers = driver.findElements(By.xpath("//table//tr/th"));
		
		
	 for(int j=0;j<3;j++)
	 {
		for(WebElement title: headers)
		{
			String header_Value = title.getText();
			String cellValue = driver.findElement(By.xpath("(//table//tr/td)["+i+"]")).getText();
			System.out.println(header_Value+":"+cellValue );
			i++;
		}
		System.out.println("---------------");
		
	  }
	}
	
	@Test
	public void enableDisable()
	{
		
		
		WebElement ed_textArea = driver.findElement(By.xpath("(//input[@class=\"inputs\"])[2]"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById(\"enabled-button\").scrollIntoView();");
		ed_textArea.sendKeys("123");
		
		WebElement disable_Button = driver.findElement(By.xpath("((//input[@class=\"inputs\"])[2]/parent::fieldset/input)[1]"));
		disable_Button.click();
		
		try {
			disable_Button.sendKeys("456");
		}
		catch(Exception e)
		{
			System.out.println("Not able to write into text area");
		}
				
		WebElement enable_Button = driver.findElement(By.xpath("((//input[@class=\"inputs\"])[2]/parent::fieldset/input)[2]"));
		enable_Button.click();
		
		ed_textArea.sendKeys("abc");
		
		
	}
	
	@Test
	public void elementCheck()
	{
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,500);");
		
		WebElement textArea = driver.findElement(By.cssSelector("#displayed-text"));
	    WebElement hide = driver.findElement(By.cssSelector("#hide-textbox"));
	    WebElement show = driver.findElement(By.cssSelector("#show-textbox"));
		
	    textArea.sendKeys("show");
	    
	    hide.click();
	    
	    try
	    {
	    	textArea.sendKeys("Hide");
	    }
	    catch(Exception e)
	    {
	    	System.out.println("Element not found!!!!");
	    }
	    
	    show.click();
	    textArea.sendKeys("2");
	    
	 }
	
	@Test
	public void mouseHover()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,650);");
		
		WebElement element_Hover = driver.findElement(By.cssSelector("#mousehover"));
		
		Actions act = new Actions(driver);
		act.moveToElement(element_Hover).build().perform();
		
		List<WebElement>hoverElements =
				driver.findElements(By.xpath("//*[@id=\"mousehover\"]/following-sibling::div/a"));
		
		System.out.println(hoverElements.size());
		
		for(WebElement he: hoverElements)
		{
		     String ele = he.getText();
		     
		     if(ele.equals("Top"))
		     {
		    	 he.click();
		     }    
		}
	}
	
	@Test
	public void iframe_Test() throws InterruptedException
	{
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,700);");
			
		driver.switchTo().frame(driver.findElement(By.id("courses-iframe")));
		
		Thread.sleep(2000);
		
		WebElement dropDown = driver.findElement(By.xpath("//*[@name=\"categories\"]"));
		
		dropDown.click();
		
		Select drop = new Select(dropDown);
		List<WebElement> values = drop.getOptions();
		values.size();
		
		for(WebElement dD :values )
		{
			   String ele_Text = dD.getText();
			   System.out.println(ele_Text);		   
		}
		
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("window.scrollTo(0,600);");
		
		driver.switchTo().defaultContent();
		
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		js2.executeScript("window.scrollTo(0,-1000);");
		
	}
	
}
