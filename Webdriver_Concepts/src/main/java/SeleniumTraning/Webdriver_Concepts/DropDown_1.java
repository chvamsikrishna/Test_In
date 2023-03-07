package SeleniumTraning.Webdriver_Concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown_1 {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		Utils ut = new Utils(driver);
		driver = ut.launchBrowser("Chrome");
		ut.getURL("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		
		By dropdown_Id = By.id("course");
		
		ElementUtil eu = new ElementUtil(driver);
		WebElement wb =eu.web_Element(dropdown_Id);
		
		Select products = new Select(wb);
		
		String value ="3";
		
		int v = Integer.parseInt(value);
		
		System.out.println(v);
		//products.selectByIndex();
		products.selectByValue("net");
		//products.selectByVisibleText("Java");
		
		List<WebElement> li_Products = products.getOptions();
		System.out.println(li_Products.size());
		for(WebElement we : li_Products)
		{
			String prod_Name = we.getText();
			if(prod_Name.equals("Java"))
			{
				we.click();
			}
  		}
		

	}

}
