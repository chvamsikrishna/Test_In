package excel_Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Excel_dataCheck extends MasterClass
{
	@Test(dataProvider = "excel", dataProviderClass = GetExcelDataClass.class)
	public void excelFeedTest(String username, String password)
	{
		
		
		  WebElement email = driver.findElement(By.id("input-email"));
		  email.clear();
		  email.sendKeys(username);
		  
		  WebElement pass = driver.findElement(By.id("input-password"));
		  pass.clear();
		  pass.sendKeys(password);
		  
		  WebElement submit = driver.findElement(By.cssSelector("input.btn.btn-primary"));
		  submit.click();

		String actualMessage = driver.findElement(By.xpath("//div[contains(text(),\"E-Mail\")]")).getText();
		Assert.assertEquals(actualMessage, "Warning: No match for E-Mail Address and/or Password.");
		
	}
}
