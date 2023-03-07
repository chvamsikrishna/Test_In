package testConcepts;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Advance_Concepts extends BaseClass{
	
	@Test
	public void screenshot() throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File f = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:/Users/Niranjan/Documents/Java_Eclipse_Practice/Webdriver_Concepts/src/main/java/testConcepts/screenshot/screen.jpg"));
	}
	
	@Test
	public void brokenLinkCheck()
	{
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for(WebElement linkValue : links)
		{
			try {
			String value = linkValue.getAttribute("href");
			
			//Pass the URL to create a connection 
			URL url = new URL(value);
			HttpsURLConnection connection = (HttpsURLConnection)url.openConnection();
			
			int statusCode =connection.getResponseCode();
			
			if( statusCode > 299)
			{
				System.out.println(value+" is a broken Link");
			}
			else
			{
				System.out.println(value+" is a Healthy Link------");
			}
			
			
			}
			catch(Exception e)
			{
				System.out.println("No href found");
				
			}
			
			
		}
	}
	
	@Test
	public void shadowDomTest() throws InterruptedException
	{
		
		driver.switchTo().frame("pact");
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver; 
		WebElement inputData = (WebElement)js.executeScript("return document.querySelector('#snacktime').shadowRoot.querySelector('.uoj > input')");
		
		//inputData.sendKeys("chai");
		String value_Field = "arguments[0].setAttribute('value','chai')";
		((JavascriptExecutor)driver).executeScript(value_Field,inputData);
		//((JavascriptExecutor)driver).executeScript("document.getElementById('tea').value='chai';",inputData );
		
	}
	
	@Test
	public void svgElements() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver; 
		js.executeScript("window.scrollBy(0,1000);");
		
		List<WebElement> rects = driver.findElements(By.xpath("(//*[local-name()='svg'])[2]//*[name()='g' and @class='highcharts-series-group']//*[name()='rect']"));
		System.out.println(rects.size());
		
		Actions act = new Actions(driver);
		for(WebElement e:rects)
		{
		  act.moveToElement(e).perform();
		  Thread.sleep(500);
		  WebElement values =driver.findElement(By.xpath("(//*[local-name()='svg'])[2]//*[name()='g' and @class='highcharts-label highcharts-tooltip highcharts-color-undefined']//*[name()='text']"));
		  System.out.println(values.getText());
		
		}
	}

}
