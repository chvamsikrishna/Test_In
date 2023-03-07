package nAL_Options;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OptionsClass extends MainClass {
	

	List<String> actualOptions = new ArrayList<String>();
	
	  
	@DataProvider(name = "list")
	public Object[][] option_Details()
	{
		return new Object[][] 
				{
			{"Login"},{"Register"},{"Forgotten Password"},{"My Account"},{"Address Book"},{"Wish List"},
			{"Order History"},{"Downloads"},{"Recurring payments"},{"Reward Points"},{"Returns"},{"Transactions"},
			{"Newsletter"}
				};
		
	}
	
	public void listValues()
	{
       List<WebElement> options = driver.findElements(By.className("list-group-item"));
   
         for(WebElement values: options)
		{
              String local_value = values.getText();
              actualOptions.add(local_value);
	    }
        
	}


	
	@Test(dataProvider="list")
	public void optionsCheck(String Expectedvalue)
	{ 
	    listValues();
		Assert.assertTrue(actualOptions.contains(Expectedvalue));
		actualOptions.clear();
		
	}
	
}
	
	

