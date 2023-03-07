package nAL_Email;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmailClass extends RootClass {

	@DataProvider(name ="dp")
	public Object[][] testData()
	{
		return new Object[][]
				{
			{"vamsi144@gmail.com","12345"},
			{"vamsi@hotmail.com","12345"},
			{"vamsi131@gmail.com","12"}
				} ;
	}

	@Test(dataProvider ="dp")
	public void email_test(String mail, String pass) 
	
	{
		
		
//		Email_Locators.email.clear();
//		Email_Locators.email.sendKeys(mail);
//
//		Email_Locators.password.clear();
//		Email_Locators.password.sendKeys(pass);
//
//		Email_Locators.submit.click();
		
		
		  WebElement email = driver.findElement(By.id("input-email"));
		  email.clear();
		  email.sendKeys(mail);
		  
		  WebElement password = driver.findElement(By.id("input-password"));
		  password.clear();
		  password.sendKeys(pass);
		  
		  WebElement submit = driver.findElement(By.cssSelector("input.btn.btn-primary"));
		  submit.click();

		String actualMessage = driver.findElement(By.xpath("//div[contains(text(),\"E-Mail\")]")).getText();
		Assert.assertEquals(actualMessage, "Warning: No match for E-Mail Address and/or Password.");

	}

}
